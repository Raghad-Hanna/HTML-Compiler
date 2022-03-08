package ast.visitor;

import ast.nodes.*;
import ast.nodes.arithmetic_expressions.*;
import ast.nodes.attributes.*;
import ast.nodes.boolean_expressions.*;
import ast.nodes.contents.*;
import ast.nodes.elements.*;
import ast.nodes.expressions.*;
import gen.HTMLParser;
import gen.HTMLParserBaseVisitor;
import org.antlr.v4.runtime.tree.RuleNode;
import symbol_table_manager.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ASTBuilder extends HTMLParserBaseVisitor<Object> {
    private Scope currentScope;
    private HashSet<String> uniqueIDs;
    private boolean elementIdentified;
    private Scope appScope;

    public ASTBuilder(Scope currentScope) {
        this.currentScope = currentScope;
        this.uniqueIDs = new HashSet<>();
        this.elementIdentified = false;
    }

    /**
     * document Rule
     */
    @Override
    public Document visitDocument(HTMLParser.DocumentContext ctx) {
        XML xml = new XML();
        DTD dtd = new DTD();

        if(ctx.XML() != null)
            xml.setDocument(ctx.XML().getText());

        if(ctx.DTD() != null)
            dtd.setDefinition(ctx.DTD().getText());

        List<Scriptlet> scriptlets = new ArrayList<>();
        for(int i = 0; i < ctx.SCRIPTLET().size(); i++)
            scriptlets.add(new Scriptlet(ctx.SCRIPTLET(i).getText()));

        List<Content> elements =
                (List<Content>)getSequenceElements(ctx.element());

        return new Document(xml, dtd, scriptlets, elements);
    }

    /**
     * element Rule
     */
    @Override
    public Content visitNonVoidElement(HTMLParser.NonVoidElementContext ctx) {
        String startTagName = ctx.COMPONENT_NAME(0).getText();
        String endTagName = ctx.COMPONENT_NAME(1).getText();

        List<Attribute> attributes = (List<Attribute>)getSequenceElements(ctx.attribute());
        if(!this.elementIdentified) {
            String uniqueID = this.generateIDRandomly();
            attributes.add(new Attribute("id", new StringLiteral("\"" + uniqueID + "\""),
                    false));
        }

        List<Content> contents = (List<Content>)getSequenceElements(ctx.content());
        this.popStructuralDirectivesScopes(attributes);

        HTMLElement element = new HTMLElement(startTagName, endTagName,
                attributes, contents);

        element.setPosition(ctx.COMPONENT_NAME(0).getSymbol().getLine(),
                ctx.COMPONENT_NAME(0).getSymbol().getCharPositionInLine());

        this.elementIdentified = false;
        return element;
    }

    @Override
    public Content visitVoidElement(HTMLParser.VoidElementContext ctx) {
        String selfClosingTagName = ctx.COMPONENT_NAME().getText();

        List<Attribute> attributes = (List<Attribute>)getSequenceElements(ctx.attribute());
        if(!this.elementIdentified) {
            String uniqueID = this.generateIDRandomly();
            attributes.add(new Attribute("id", new StringLiteral("\"" + uniqueID + "\""),
                    false));
        }

        this.popStructuralDirectivesScopes(attributes);

        HTMLElement element = new HTMLElement(selfClosingTagName, "",
                attributes, new ArrayList<>());

        element.setPosition(ctx.COMPONENT_NAME().getSymbol().getLine(),
                ctx.COMPONENT_NAME().getSymbol().getCharPositionInLine());

        this.elementIdentified = false;
        return element;
    }

    @Override
    public Content visitSwitchElement(HTMLParser.SwitchElementContext ctx) {
        return (Content)visit(ctx.switchE());
    }

    @Override
    public Content visitScriptletElement(HTMLParser.ScriptletElementContext ctx) {
        return new Scriptlet(ctx.SCRIPTLET().getText());
    }

    @Override
    public Script visitScriptElement(HTMLParser.ScriptElementContext ctx) {
        return new Script(ctx.getText());
    }

    @Override
    public Style visitStyleElement(HTMLParser.StyleElementContext ctx) {
        return new Style(ctx.getText());
    }

    /**
     * attribute Rule
     */
    @Override
    public Attribute visitOriginalAttribute(HTMLParser.OriginalAttributeContext ctx) {
        return (Attribute)visit(ctx.htmlAttribute());
    }

    @Override
    public Attribute visitExtendedAttribute(HTMLParser.ExtendedAttributeContext ctx) {
        return (Attribute)visit(ctx.directive());
    }

    /**
     * htmlAttribute Rule
     */
    @Override
    public Attribute visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx) {
        String key = ctx.COMPONENT_NAME().getText();
        String value = ctx.ATTRIBUTE_VALUE().getText();

        if(key.equalsIgnoreCase("id")) {
            this.uniqueIDs.add(value);
            this.elementIdentified = true;
        }

        Attribute attribute = new Attribute(key,
                new StringLiteral(value), false);

        attribute.setPosition(ctx.COMPONENT_NAME().getSymbol().getLine(),
                ctx.COMPONENT_NAME().getSymbol().getCharPositionInLine());

        return attribute;
    }

    /**
     * directive Rule
     */
    @Override
    public Attribute visitCp_appDirective(HTMLParser.Cp_appDirectiveContext ctx) {
        String name = ctx.CP_APP().getText();

        Identifier moduleName = null;
        if(ctx.IDENTIFIER() != null) {
            moduleName = new Identifier(ctx.IDENTIFIER().getText());
            Scope cp_appScope = new SymbolTable(moduleName.getSymbolName(), currentScope);
            currentScope.addEnclosedScope(cp_appScope);
            currentScope = cp_appScope;
            this.appScope = currentScope;
        }

        Attribute attribute = new Attribute(name, (moduleName != null)? moduleName : new StringLiteral(""),
                true);
        attribute.setConstitutedScope(currentScope);

        attribute.setPosition(ctx.CP_APP().getSymbol().getLine(),
                ctx.CP_APP().getSymbol().getCharPositionInLine());

        return attribute;
    }

    @Override
    public Attribute visitCp_showDirective(HTMLParser.Cp_showDirectiveContext ctx) {
        String name = ctx.CP_SHOW().getText();
        Expression booleanExpression = (Expression)visit(ctx.expression());

        Attribute attribute = new Attribute(name, booleanExpression, false);
        attribute.setConstitutedScope(currentScope);

        attribute.setPosition(ctx.CP_SHOW().getSymbol().getLine(),
                ctx.CP_SHOW().getSymbol().getCharPositionInLine());

        return attribute;
    }

    @Override
    public Attribute visitCp_hideDirective(HTMLParser.Cp_hideDirectiveContext ctx) {
        String name = ctx.CP_HIDE().getText();
        Expression booleanExpression = (Expression)visit(ctx.expression());

        Attribute attribute = new Attribute(name, booleanExpression, false);
        attribute.setConstitutedScope(currentScope);

        attribute.setPosition(ctx.CP_HIDE().getSymbol().getLine(),
                ctx.CP_HIDE().getSymbol().getCharPositionInLine());

        return attribute;
    }

    @Override
    public Attribute visitCp_ifDirective(HTMLParser.Cp_ifDirectiveContext ctx) {
        String name = ctx.CP_IF().getText();
        Expression booleanExpression = (Expression)visit(ctx.expression());

        Attribute attribute = new Attribute(name, booleanExpression, false);
        attribute.setConstitutedScope(currentScope);

        attribute.setPosition(ctx.CP_IF().getSymbol().getLine(),
                ctx.CP_IF().getSymbol().getCharPositionInLine());

        return attribute;
    }

    @Override
    public Attribute visitEventListenerDirective(HTMLParser.EventListenerDirectiveContext ctx) {
        Attribute attribute = new Attribute(ctx.EVENT_LISTENER().getText(),
                (Expression)visit(ctx.expression()), false);

        attribute.setPosition(ctx.EVENT_LISTENER().getSymbol().getLine(),
                ctx.EVENT_LISTENER().getSymbol().getCharPositionInLine());

        return attribute;
    }

    @Override
    public Attribute visitCp_modelDirective(HTMLParser.Cp_modelDirectiveContext ctx) {
        Attribute attribute = new Attribute(ctx.CP_MODEL().getText(),
                (Expression)visit(ctx.objectChainedMembers()), false);

        attribute.setPosition(ctx.CP_MODEL().getSymbol().getLine(),
                ctx.CP_MODEL().getSymbol().getCharPositionInLine());

        return attribute;
    }

    @Override
    public Attribute visitCp_forDirective(HTMLParser.Cp_forDirectiveContext ctx) {
        String name = ctx.CP_FOR().getText();

        Scope cp_forScope = new SymbolTable(name, currentScope);
        currentScope.addEnclosedScope(cp_forScope);
        currentScope = cp_forScope;

        Expression loopParts = (Expression)visit(ctx.forLoop());

        Attribute attribute = new Attribute(name, loopParts, true);
        attribute.setConstitutedScope(currentScope);

        attribute.setPosition(ctx.CP_FOR().getSymbol().getLine(),
                ctx.CP_FOR().getSymbol().getCharPositionInLine());

        return attribute;
    }

    /**
     * expression Rule
     */
    @Override
    public Expression visitStringLiteralArgument(HTMLParser.StringLiteralArgumentContext ctx) {
        StringLiteral stringLiteral = new StringLiteral(ctx.STRING_LITERAL().getText());

        stringLiteral.setPosition(ctx.STRING_LITERAL().getSymbol().getLine(),
                ctx.STRING_LITERAL().getSymbol().getCharPositionInLine());

        return stringLiteral;
    }

    @Override
    public Expression visitObjectLiteralArgument(HTMLParser.ObjectLiteralArgumentContext ctx) {
        return (ObjectLiteral)visit(ctx.objectLiteral());
    }

    @Override
    public Expression visitArrayLiteralArgument(HTMLParser.ArrayLiteralArgumentContext ctx) {
        return (Expression)visit(ctx.arrayLiteral());
    }

    @Override
    public BooleanExpression visitBooleanExpressionArgument(HTMLParser.BooleanExpressionArgumentContext ctx) {
        return (BooleanExpression)visit(ctx.booleanExpression());
    }

    @Override
    public ArithmeticExpression visitArithmeticExpressionArgument(HTMLParser.ArithmeticExpressionArgumentContext ctx) {
        return (ArithmeticExpression)visit(ctx.arithmeticExpression());
    }

    @Override
    public Expression visitAssignmentExpressionArgument(HTMLParser.AssignmentExpressionArgumentContext ctx) {
       return (Expression)visit(ctx.assignmentExpression());
    }

    @Override
    public Expression visitTernaryOperatorArgument(HTMLParser.TernaryOperatorArgumentContext ctx) {
       return (Expression)visit(ctx.ternaryOperator());
    }

    @Override
    public Expression visitDataBindingExpressionArgument(HTMLParser.DataBindingExpressionArgumentContext ctx) {
        return (Expression)visit(ctx.dataBindingExpression());
    }

    @Override
    public Expression visitConcatenatedExpressionArgument(HTMLParser.ConcatenatedExpressionArgumentContext ctx) {
        List<Expression> expressions = (List<Expression>)getSequenceElements(ctx.expression());
        return new ConcatenatedExpressions(expressions);
    }

    @Override
    public Expression visitParenthesizedExpressionArgument(HTMLParser.ParenthesizedExpressionArgumentContext ctx) {
        return (Expression)visit(ctx.expression());
    }

    /**
     * objectLiteral Rule
     */
    @Override
    public Expression visitObjectLiteral(HTMLParser.ObjectLiteralContext ctx) {
        List<Property> properties = new ArrayList<>();
        if(ctx.properties() != null)
            properties = (List<Property>)visit(ctx.properties());

        return new ObjectLiteral(properties);
    }

    /**
     * properties Rule
     */
    @Override
    public List<Property> visitProperties(HTMLParser.PropertiesContext ctx) {
        return (List<Property>)getSequenceElements(ctx.property());
    }

    /**
     * property Rule
     */
    @Override
    public Property visitProperty(HTMLParser.PropertyContext ctx) {
        ObjectChainedMembers key = (ObjectChainedMembers)visit(ctx.objectChainedMembers());
        Expression value = (Expression)visit(ctx.expression());

        return new Property(key, value);
    }

    /**
     * arrayLiteral Rule
     */
    @Override
    public Expression visitArrayLiteral(HTMLParser.ArrayLiteralContext ctx) {
        List<Expression> elements = new ArrayList<>();
        if(ctx.arrayElements() != null)
            elements = (List<Expression>)(visit(ctx.arrayElements()));

        return new ArrayLiteral(elements);
    }

    /**
     * arrayElements Rule
     */
    @Override
    public List<Expression> visitArrayElements(HTMLParser.ArrayElementsContext ctx) {
        return (List<Expression>)getSequenceElements(ctx.expression());
    }

    /**
     * booleanExpression Rule
     */
    @Override
    public BooleanExpression visitPrimitiveBooleanExpression(HTMLParser.PrimitiveBooleanExpressionContext ctx) {
        return (BooleanExpression)visit(ctx.booleanValue());
    }

    @Override
    public BooleanExpression visitBinaryBooleanExpression(HTMLParser.BinaryBooleanExpressionContext ctx) {
        String operator;
        if(ctx.booleanOperator() != null)
            operator = ctx.booleanOperator().getText();
        else
            operator = ctx.equalityOperator().getText();

        return new BinaryBooleanExpression((BooleanExpression)visit(ctx.booleanExpression(0)),
                operator, (BooleanExpression)visit(ctx.booleanExpression(1)));
    }

    @Override
    public BooleanExpression visitBinaryComparisonExpression(HTMLParser.BinaryComparisonExpressionContext ctx) {
        String operator;
        if(ctx.comparisonOperator() != null)
            operator = ctx.comparisonOperator().getText();
        else
            operator = ctx.equalityOperator().getText();

        return new BinaryComparisonExpression((ArithmeticExpression)visit(ctx.arithmeticExpression(0)),
                operator, (ArithmeticExpression)visit(ctx.arithmeticExpression(1)));
    }

    @Override
    public BooleanExpression visitUnaryBooleanExpression(HTMLParser.UnaryBooleanExpressionContext ctx) {
        String operator = ctx.NOT().getText();
        return new UnaryBooleanExpression(operator,
                (BooleanExpression)visit(ctx.booleanExpression()));
    }

    @Override
    public BooleanExpression visitParenthesizedBooleanExpression(HTMLParser.ParenthesizedBooleanExpressionContext ctx) {
        return (BooleanExpression)visit(ctx.booleanExpression());
    }

    /**
     * booleanValue Rule
     */
    @Override
    public BooleanExpression visitBooleanLiteral(HTMLParser.BooleanLiteralContext ctx) {
        if(ctx.TRUE() != null)
            return new BooleanLiteral(ctx.TRUE().getText());
        return new BooleanLiteral(ctx.FALSE().getText());
    }

    @Override
    public BooleanExpression visitBooleanObjectAccessedMember(HTMLParser.BooleanObjectAccessedMemberContext ctx) {
        return (BooleanExpression)visit(ctx.objectChainedMembers());
    }

    /**
     * arithmeticExpression Rule
     */
    @Override
    public ArithmeticExpression visitPrimitiveArithmeticExpression(HTMLParser.PrimitiveArithmeticExpressionContext ctx) {
        return (ArithmeticExpression)visit(ctx.numericValue());
    }

    @Override
    public ArithmeticExpression visitBinaryArithmeticExpression(HTMLParser.BinaryArithmeticExpressionContext ctx) {
        String operator = ctx.arithmeticOperator().getText();
        return new BinaryArithmeticExpression((ArithmeticExpression)visit(ctx.arithmeticExpression(0)),
                operator, (ArithmeticExpression)visit(ctx.arithmeticExpression(1)));
    }

    @Override
    public ArithmeticExpression visitUnaryArithmeticExpression(HTMLParser.UnaryArithmeticExpressionContext ctx) {
        String operator;
        if(ctx.PLUS() != null)
            operator = ctx.PLUS().getText();
        else
            operator = ctx.MINUS().getText();

        return new UnaryArithmeticExpression(operator,
                (ArithmeticExpression)visit(ctx.arithmeticExpression()));
    }

    @Override
    public ArithmeticExpression visitParenthesizedArithmeticExpression(HTMLParser.ParenthesizedArithmeticExpressionContext ctx) {
        return (ArithmeticExpression)visit(ctx.arithmeticExpression());
    }

    /**
     * numericValue Rule
     */
    @Override
    public ArithmeticExpression visitNumericLiteral(HTMLParser.NumericLiteralContext ctx) {
        NumberLiteral numberLiteral = new NumberLiteral(ctx.NUMBER().getText());

        numberLiteral.setPosition(ctx.NUMBER().getSymbol().getLine(),
                ctx.NUMBER().getSymbol().getCharPositionInLine());

        return numberLiteral;
    }

    @Override
    public ArithmeticExpression visitNumericObjectAccessedMember(HTMLParser.NumericObjectAccessedMemberContext ctx) {
        return (ArithmeticExpression)visit(ctx.objectChainedMembers());
    }

    /**
     * assignmentExpression Rule
     */
    @Override
    public Expression visitAssignmentExpression(HTMLParser.AssignmentExpressionContext ctx) {
        ObjectChainedMembers variable = (ObjectChainedMembers)visit(ctx.objectChainedMembers());
        return new AssignmentExpression(variable,
                (Expression)visit(ctx.expression()));
    }

    /**
     * ternaryOperator Rule
     */
    @Override
    public TernaryOperator visitBasicTernaryOperator(HTMLParser.BasicTernaryOperatorContext ctx) {
        BooleanExpression leftOperand = (BooleanExpression)visit(ctx.booleanExpression());
        Expression middleOperand = (Expression)visit(ctx.expression(0));
        Expression rightOperand = (Expression)visit(ctx.expression(1));
        return new TernaryOperator(leftOperand, middleOperand, rightOperand);
    }

    @Override
    public TernaryOperator visitParenthesizedTernaryOperator(HTMLParser.ParenthesizedTernaryOperatorContext ctx) {
        return (TernaryOperator)visit(ctx.ternaryOperator());
    }

    /**
     * objectChainedMembers Rule
     */
    @Override
    public Expression visitObjectChainedMembers(HTMLParser.ObjectChainedMembersContext ctx) {
        List<ObjectMember> members =
                (List<ObjectMember>)getSequenceElements(ctx.objectMember());

        ((VariableSymbol)currentScope).handleNewPropertyDefinition(members.size()-1);

        for(int i = 0; i < members.size(); i++)
            currentScope = currentScope.getEnclosingScope();

        return new ObjectChainedMembers(members);
    }

    /**
     * accessedObjectMember Rule
     */
    @Override
    public Expression visitAccessedIdentifier(HTMLParser.AccessedIdentifierContext ctx) {
        Identifier identifier = new Identifier(ctx.IDENTIFIER().getText());

        identifier.setPosition(ctx.IDENTIFIER().getSymbol().getLine(),
                ctx.IDENTIFIER().getSymbol().getCharPositionInLine());

        Symbol symbol = new VariableSymbol(identifier.getSymbolName(), currentScope);
        currentScope.define(symbol);
        currentScope = (Scope)symbol;

        return identifier;
    }

    @Override
    public Expression visitAccessedArrayElement(HTMLParser.AccessedArrayElementContext ctx) {
        return (ArrayElement)visit(ctx.arrayElement());
    }

    @Override
    public Expression visitAccessedFunctionCall(HTMLParser.AccessedFunctionCallContext ctx) {
        return (FunctionCall)visit(ctx.functionCall());
    }

    /**
     * arrayElement Rule
     */
    @Override
    public Expression visitArrayElement(HTMLParser.ArrayElementContext ctx) {
        ObjectMember arrayName =
                (ObjectMember)visit(ctx.arrayName());

        Scope objectScope, nearestNonSymbolScope;
        nearestNonSymbolScope = objectScope = currentScope;

        while(nearestNonSymbolScope instanceof VariableSymbol)
            nearestNonSymbolScope = nearestNonSymbolScope.getEnclosingScope();

        currentScope = nearestNonSymbolScope;

        List<ArithmeticExpression> indices =
                (List<ArithmeticExpression>)getSequenceElements(ctx.arrayElementIndex());

        currentScope = objectScope;

        return new ArrayElement(arrayName, indices);
    }

    /**
     * arrayName Rule
     */
    @Override
    public Expression visitDirectlyAccessedArray(HTMLParser.DirectlyAccessedArrayContext ctx) {
        Identifier identifier = new Identifier(ctx.IDENTIFIER().getText());

        identifier.setPosition(ctx.IDENTIFIER().getSymbol().getLine(),
                ctx.IDENTIFIER().getSymbol().getCharPositionInLine());

        Symbol symbol = new VariableSymbol(identifier.getSymbolName(), currentScope);
        currentScope.define(symbol);
        currentScope = (Scope)symbol;

        return identifier;
    }

    @Override
    public Expression visitReturnedArray(HTMLParser.ReturnedArrayContext ctx) {
        return (FunctionCall)visit(ctx.functionCall());
    }

    /**
     * arrayElementIndex Rule
     */
    public ArithmeticExpression visitArrayElementIndex(HTMLParser.ArrayElementIndexContext ctx) {
        return (ArithmeticExpression)visit(ctx.arithmeticExpression());
    }

    /**
     * functionCall Rule
     */
    @Override
    public Expression visitFunctionCall(HTMLParser.FunctionCallContext ctx) {
        Identifier identifier = new Identifier(ctx.IDENTIFIER().getText());

        identifier.setPosition(ctx.IDENTIFIER().getSymbol().getLine(),
                ctx.IDENTIFIER().getSymbol().getCharPositionInLine());

        Symbol symbol = new VariableSymbol(identifier.getSymbolName(), currentScope);
        currentScope.define(symbol);
        currentScope = (Scope)symbol;

        List<Expression> arguments = new ArrayList<>();
        if(ctx.functionArguments() != null) {
            Scope objectScope, nearestNonSymbolScope;
            nearestNonSymbolScope = objectScope = currentScope;

            while(nearestNonSymbolScope instanceof VariableSymbol)
                nearestNonSymbolScope = nearestNonSymbolScope.getEnclosingScope();

            currentScope = nearestNonSymbolScope;

            arguments = (List<Expression>)visit(ctx.functionArguments());

           currentScope = objectScope;
        }
        return new FunctionCall(identifier, arguments);
    }

    /**
     * functionArguments Rule
     */
    @Override
    public List<Expression> visitFunctionArguments(HTMLParser.FunctionArgumentsContext ctx) {
        return (List<Expression>)getSequenceElements(ctx.expression());
    }

    /**
     * forLoop Rule
     */
    @Override
    public Expression visitArrayForLoop(HTMLParser.ArrayForLoopContext ctx) {
        Identifier iterator = new Identifier(ctx.IDENTIFIER(0).getText());

        iterator.setPosition(ctx.IDENTIFIER(0).getSymbol().getLine(),
                ctx.IDENTIFIER(0).getSymbol().getCharPositionInLine());

        Symbol symbol = new VariableSymbol(iterator.getSymbolName(), currentScope);
        currentScope.define(symbol);

        Scope cp_forScope = currentScope;
        currentScope = appScope;

        Expression array = (Expression)visit(ctx.arrayDataSource());

        currentScope = cp_forScope;

        Identifier index = null;

        if(ctx.ASSIGNMENT() != null) {
            index = new Identifier(ctx.IDENTIFIER(1).getText());

            index.setPosition(ctx.IDENTIFIER(1).getSymbol().getLine(),
                    ctx.IDENTIFIER(1).getSymbol().getCharPositionInLine());

            symbol = new VariableSymbol(index.getSymbolName(), currentScope);
            currentScope.define(symbol);
        }
        return new ArrayForLoop(iterator, array, index);
    }

    @Override
    public Expression visitObjectForLoop(HTMLParser.ObjectForLoopContext ctx) {
        Identifier key = new Identifier(ctx.IDENTIFIER(0).getText());

        key.setPosition(ctx.IDENTIFIER(0).getSymbol().getLine(),
                ctx.IDENTIFIER(0).getSymbol().getCharPositionInLine());

        Symbol symbol = new VariableSymbol(key.getSymbolName(), currentScope);
        currentScope.define(symbol);

        Identifier value = new Identifier(ctx.IDENTIFIER(1).getText());

        value.setPosition(ctx.IDENTIFIER(1).getSymbol().getLine(),
                ctx.IDENTIFIER(1).getSymbol().getCharPositionInLine());

        symbol = new VariableSymbol(value.getSymbolName(), currentScope);
        currentScope.define(symbol);

        Scope cp_forScope = currentScope;
        currentScope = currentScope.getEnclosingScope();

        Expression object = (Expression)visit(ctx.objectChainedMembers());

        currentScope = cp_forScope;

        return new ObjectForLoop(key, value, object);
    }

    /**
     * arrayDataSource Rule
     */
    @Override
    public Expression visitArrayLiteralDataSource(HTMLParser.ArrayLiteralDataSourceContext ctx) {
        return (Expression)visit(ctx.arrayLiteral());
    }

    @Override
    public Expression visitObjectChainedMembersDataSource(HTMLParser.ObjectChainedMembersDataSourceContext ctx) {
        return (Expression)visit(ctx.objectChainedMembers());
    }

    /**
     * switchE Rule
     */
    @Override
    public Content visitSwitchE(HTMLParser.SwitchEContext ctx) {
        String startTagName = ctx.COMPONENT_NAME(0).getText();
        String endTagName = ctx.COMPONENT_NAME(1).getText();

        List<Attribute> attributes = (List<Attribute>)getSequenceElements(ctx.attribute());
        attributes.add((Attribute)visit(ctx.switchAttribute()));
        if(!this.elementIdentified) {
            String uniqueID = this.generateIDRandomly();
            attributes.add(new Attribute("id", new StringLiteral("\"" + uniqueID + "\""),
                    false));
        }

        List<Content> contents = (List<Content>)getSequenceElements(ctx.switchCase());
        this.popStructuralDirectivesScopes(attributes);

        HTMLElement element = new HTMLElement(startTagName, endTagName,
                attributes, contents);

        element.setPosition(ctx.COMPONENT_NAME(0).getSymbol().getLine(),
                ctx.COMPONENT_NAME(0).getSymbol().getCharPositionInLine());

        this.elementIdentified = false;
        return element;
    }

    /**
     * switchAttribute Rule
     */
    @Override
    public Attribute visitSwitchAttribute(HTMLParser.SwitchAttributeContext ctx) {
        String name = ctx.CP_SWITCH().getText();
        Expression value = (Expression)visit(ctx.expression());

        Attribute attribute = new Attribute(name, value, false);
        attribute.setConstitutedScope(currentScope);

        attribute.setPosition(ctx.CP_SWITCH().getSymbol().getLine(),
                ctx.CP_SWITCH().getSymbol().getCharPositionInLine());

        return attribute;
    }

    /**
     * switchCase Rule
     */
    @Override
    public Content visitSwitchCase(HTMLParser.SwitchCaseContext ctx) {
        String startTagName = ctx.COMPONENT_NAME(0).getText();
        String endTagName = ctx.COMPONENT_NAME(1).getText();

        List<Attribute> attributes = (List<Attribute>)getSequenceElements(ctx.attribute());
        attributes.add((Attribute)visit(ctx.switchCaseAttribute()));
        if(!this.elementIdentified) {
            String uniqueID = this.generateIDRandomly();
            attributes.add(new Attribute("id", new StringLiteral("\"" + uniqueID + "\""),
                    false));
        }

        List<Content> contents = (List<Content>)getSequenceElements(ctx.content());
        this.popStructuralDirectivesScopes(attributes);

        HTMLElement element = new HTMLElement(startTagName, endTagName,
                attributes, contents);

        element.setPosition(ctx.COMPONENT_NAME(0).getSymbol().getLine(),
                ctx.COMPONENT_NAME(0).getSymbol().getCharPositionInLine());

        this.elementIdentified = false;
        return element;
    }

    /**
     * switchCaseAttribute Rule
     */
    @Override
    public Attribute visitNonDefaultSwitchCase(HTMLParser.NonDefaultSwitchCaseContext ctx) {
        String name = ctx.CP_SWITCH_CASE().getText();
        Expression value = (Expression)visit(ctx.expression());


        Attribute attribute = new Attribute(name, value, false);
        attribute.setConstitutedScope(currentScope);

        attribute.setPosition(ctx.CP_SWITCH_CASE().getSymbol().getLine(),
                ctx.CP_SWITCH_CASE().getSymbol().getCharPositionInLine());

        return attribute;
    }

    @Override
    public Attribute visitDefaultSwitchCase(HTMLParser.DefaultSwitchCaseContext ctx) {
        String name = ctx.CP_SWITCH_DEFAULT().getText();

        Attribute attribute = new Attribute(name, null, false);
        attribute.setConstitutedScope(currentScope);

        attribute.setPosition(ctx.CP_SWITCH_DEFAULT().getSymbol().getLine(),
                ctx.CP_SWITCH_DEFAULT().getSymbol().getCharPositionInLine());

        return attribute;
    }

    /**
     * content Rule
     */
    @Override
    public Content visitElementContent(HTMLParser.ElementContentContext ctx) {
        return (Content)visit(ctx.element());
    }

    @Override
    public Content visitTextContent(HTMLParser.TextContentContext ctx) {
        return (Text)visit(ctx.text());
    }

    @Override
    public Content visitDataContent(HTMLParser.DataContentContext ctx) {
        return (Content)visit(ctx.dataBindingExpression());
    }

    /**
     * text Rule
     */
    @Override
    public Content visitText(HTMLParser.TextContext ctx) {
        String seaText = "";
        for(int i = 0; i < ctx.getChildCount(); i++)
            seaText += ctx.SEA_TEXT(i) + " ";

        return new Text(seaText);
    }

    /**
     * dataBindingExpression Rule
     */
    @Override
    public Content visitDataBindingExpression(HTMLParser.DataBindingExpressionContext ctx) {
        return (Content)visit(ctx.interpolatedExpression());
    }

    /**
     * interpolatedExpression Rule
     */
    @Override
    public Content visitInterpolatedExpression(HTMLParser.InterpolatedExpressionContext ctx) {
        Expression expression = (Expression)visit(ctx.expression());

        List<Filter> filters = new ArrayList<>();
        if(ctx.filters() != null)
            filters = (List<Filter>)visit(ctx.filters());

        return new DataBindingExpression(expression, filters);
    }

    /**
     * filters Rule
     */
    @Override
    public List<Filter> visitFilters(HTMLParser.FiltersContext ctx) {
        return (List<Filter>)getSequenceElements(ctx.filter());
    }

    /**
     * filter Rule
     */
    @Override
    public Filter visitFilter(HTMLParser.FilterContext ctx) {
        Scope enclosingScope = currentScope;
        currentScope = appScope;

        ObjectChainedMembers filterName =
                (ObjectChainedMembers)visit(ctx.objectChainedMembers());
        List<Expression> arguments =
                (List<Expression>)getSequenceElements(ctx.expression());

        currentScope = enclosingScope;

        return new Filter(filterName, arguments);
    }

    private String generateIDRandomly() {
        String ID;
        do {
            ID = RandomStringGenerator.getAlphaNumericString();
        }
        while(!this.uniqueIDs.add(ID));
        return ID;
    }

    private void popStructuralDirectivesScopes(List<Attribute> attributes) {
        for(Attribute attribute: attributes) {
            if(attribute.isStructural())
                currentScope = currentScope.getEnclosingScope();
        }
    }

    // This method is used whenever a sequence pattern is recognized in parser rules (RuleNode*/RuleNode+)
    private Object getSequenceElements(Object ctxChildElements) {
        List<RuleNode> nodes = (List<RuleNode>)ctxChildElements;

        List<Object> structuredElements = new ArrayList<>();
        for(int i = 0; i < nodes.size(); i++)
            structuredElements.add(visit(nodes.get(i)));

        return structuredElements;
    }
}

