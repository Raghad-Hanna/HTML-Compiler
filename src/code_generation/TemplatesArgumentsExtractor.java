package code_generation;

import ast.nodes.Document;
import ast.nodes.arithmetic_expressions.BinaryArithmeticExpression;
import ast.nodes.arithmetic_expressions.NumberLiteral;
import ast.nodes.arithmetic_expressions.UnaryArithmeticExpression;
import ast.nodes.attributes.Attribute;
import ast.nodes.boolean_expressions.*;
import ast.nodes.contents.Content;
import ast.nodes.contents.DataBindingExpression;
import ast.nodes.contents.Filter;
import ast.nodes.contents.Text;
import ast.nodes.elements.HTMLElement;
import ast.nodes.expressions.*;
import symbol_table_manager.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TemplatesArgumentsExtractor {
    private Document AST;
    private Scope globalScope;
    private List<Template> templates;

    public TemplatesArgumentsExtractor(Document AST, Scope globalScope) {
        this.AST = AST;
        this.globalScope = globalScope;
        this.templates = new ArrayList<>();
    }

    public void traverseTopLevelElements() {
        for(Content content: this.AST.getElements()) {
            if(!(content instanceof HTMLElement))
                continue;
            HTMLElement element = (HTMLElement)content;
            this.traverseElement(element);
        }
    }

    private void traverseElement(HTMLElement element) {
         this.traverseAttributes(element);
         for(Content content: element.getContents()) {
             if(content instanceof HTMLElement)
                 this.traverseElement((HTMLElement)content);
         }
    }

    public void traverseAttributes(HTMLElement element) {
        List<Template> elementTemplates = new ArrayList<>();
        String elementID = "";

        for(Attribute attribute: element.getAttributes()) {
            switch(attribute.getKey().toLowerCase()) {
                case "id":
                    elementID = attribute.getValue().toString();
                    break;
                case "cp-model":
                    Template modelTemplate = new ModelTemplate(this.getMemberAccessExpression(attribute.getValue()));
                    elementTemplates.add(modelTemplate);
                    break;
                case "cp-show":
                    elementTemplates.add(
                            new ShowHideTemplate(this.getMemberAccessExpression(attribute.getValue()),
                            true));
                    break;
                case "cp-hide":
                    elementTemplates.add(
                            new ShowHideTemplate(this.getMemberAccessExpression(attribute.getValue()),
                                    false));
                    break;
                case "cp-if":
                    elementTemplates.add(
                            new IfTemplate(this.getMemberAccessExpression(attribute.getValue()))
                    );
                    break;
                case "cp-switch-case":
                    elementTemplates.add(
                            new SwitchTemplate(this.getMemberAccessExpression(attribute.getValue()), false)
                    );
                    break;
                case "cp-switch-default":
                    elementTemplates.add(
                            new SwitchTemplate(this.getMemberAccessExpression(attribute.getValue()), true)
                    );
                    break;
                case "@click":
                case "@change":
                case "@focus":
                case "@mouseover":
                case "@mousedown":
                case "@mouseup":
                case "@mousemove":
                    elementTemplates.add(
                            new EventListenerTemplate(this.getMemberAccessExpression(attribute.getValue()),
                                    attribute.getKey()));
                    break;
                case "cp-for":
                    if(attribute.getValue() instanceof ArrayForLoop) {
                    ArrayForLoop expr = (ArrayForLoop)attribute.getValue();
                    String iterator, array, index = "";
                    iterator = expr.getIterator().toString();
                    array = this.getMemberAccessExpression(expr.getArray());
                    if(expr.getIndex() != null)
                    index = this.getMemberAccessExpression(expr.getIndex());
                        elementTemplates.add(
                            new ArrayForTemplate(iterator, array, index));
                    }
                    else {
                        ObjectForLoop expr = (ObjectForLoop)attribute.getValue();
                        String key, value, object;
                        key = expr.getKey().toString();
                        value = expr.getValue().toString();
                        object = this.getMemberAccessExpression(expr.getObject());
                        // TODO ObjectForTemplate Creation
                        //elementTemplates.add(null);
                    }
                    break;
            }
        }

        String textContent = "";
        String innerText = "";

        String filterName = "";
        List<String> filterArguments = new ArrayList<>();
        Map<String, List<String>> filters = new HashMap<>();

        for(Content content: element.getContents()) {
            if(content instanceof DataBindingExpression) {
                DataBindingExpression expr = (DataBindingExpression)content;
                textContent += this.getMemberAccessExpression(expr);
                innerText += expr.toString();

                for(int i = 0; i < expr.getFilters().size(); i++) {
                    Filter filter = expr.getFilters().get(i);
                    switch(filter.getName().toString()) {
                        case "lower":
                        case "upper":
                        case "date":
                        case "currency":
                           filterName = filter.getName().toString();
                           break;
                        default:
                            filterName = this.getMemberAccessExpression(filter.getName());
                            break;
                    }
                    for(int j = 0; j < filter.getArguments().size(); j++)
                        filterArguments.add(this.getMemberAccessExpression(filter.getArguments().get(j)));
                }
                if(!filterName.equals(""))
                    filters.put(filterName, filterArguments);
            }
        }

        if(!textContent.equals("")) {
            elementTemplates.add(
                    new ElementInnerTextTemplate(textContent, innerText, filters));
        }

        for(Template template: elementTemplates) {
            template.setElementID(elementID);
            template.generateTemplate();
        }

        this.templates.addAll(elementTemplates);
    }

    private String getMemberAccessExpression(Expression expression) {
        if(expression instanceof StringLiteral)
            return expression.toString();

        else if(expression instanceof Text)
            return expression.toString();

        else if(expression instanceof ObjectLiteral) {
            ObjectLiteral expr = (ObjectLiteral)expression;
            String memberAccessExpression = "{ ";
            List<Property> properties = expr.getProperties();
            for(int i = 0; i < properties.size(); i++)
                memberAccessExpression += this.getMemberAccessExpression(properties.get(i).getKey()) +
                        ": " + this.getMemberAccessExpression(properties.get(i).getValue())
                        + ((i != (properties.size()-1))? ", " : "");

            memberAccessExpression += " }";
            return memberAccessExpression;
        }

        else if(expression instanceof ArrayLiteral) {
            String memberAccessExpression = "[";
            ArrayLiteral expr = (ArrayLiteral)expression;
            List<Expression> elements = expr.getElements();

            for(int i = 0; i < elements.size(); i++)
                memberAccessExpression += this.getMemberAccessExpression(elements.get(i)) +
                        ((i != (elements.size()-1))? ", " : "");

            memberAccessExpression += "]";
            return memberAccessExpression;
        }

        else if(expression instanceof BooleanLiteral)
            return expression.toString();

        else if(expression instanceof NumberLiteral)
            return expression.toString();

        else if(expression instanceof Identifier) {
            return expression.toString();
        }

        else if(expression instanceof ArrayElement) {
            ArrayElement expr = (ArrayElement)expression;
            String memberAccessExpression = this.getMemberAccessExpression(expr.getArrayName());

            for(Expression index: expr.getIndices())
                memberAccessExpression += "[" + this.getMemberAccessExpression(index) + "]";

            return memberAccessExpression;
        }

        else if(expression instanceof FunctionCall) {
            FunctionCall expr = (FunctionCall)expression;
            String memberAccessExpression = this.getMemberAccessExpression(expr.getIdentifier()) + "(";
            List<Expression> arguments = expr.getArguments();

            for(int i = 0; i < arguments.size(); i++)
                memberAccessExpression += this.getMemberAccessExpression(arguments.get(i))
                        + ((i != (arguments.size()-1))? ", " : "");

            memberAccessExpression += ")";
            return memberAccessExpression;
        }

        else if(expression instanceof ObjectChainedMembers) {
            ObjectChainedMembers expr = (ObjectChainedMembers)expression;
            String memberAccessExpression = globalScope.getEnclosedScopes().get(0).getName() + ".";
            List<ObjectMember> members = expr.getMembers();

            for(int i = 0; i < members.size(); i++)
                memberAccessExpression += this.getMemberAccessExpression(members.get(i))
                        + ((i != (members.size()-1))? "." : "");
            return memberAccessExpression;
        }

        else if(expression instanceof BinaryBooleanExpression) {
            BinaryBooleanExpression expr = (BinaryBooleanExpression)expression;
            return this.getMemberAccessExpression(expr.getLeftOperand()) + " " + expr.getOperator() + " " +
                    this.getMemberAccessExpression(expr.getRightOperand());
        }

        else if(expression instanceof BinaryComparisonExpression) {
            BinaryComparisonExpression expr = (BinaryComparisonExpression)expression;
            return this.getMemberAccessExpression(expr.getLeftOperand()) + " " + expr.getOperator() + " " +
                    this.getMemberAccessExpression(expr.getRightOperand());
        }

        else if(expression instanceof UnaryBooleanExpression) {
            UnaryBooleanExpression expr = (UnaryBooleanExpression)expression;
            return (expr.getOperator() + " " + this.getMemberAccessExpression(expr.getOperand()));
        }

        else if(expression instanceof BinaryArithmeticExpression) {
            BinaryArithmeticExpression expr = (BinaryArithmeticExpression)expression;
            return this.getMemberAccessExpression(expr.getLeftOperand()) + " " + expr.getOperator() + " " +
                    this.getMemberAccessExpression(expr.getRightOperand());
        }

        else if(expression instanceof UnaryArithmeticExpression) {
            UnaryArithmeticExpression expr = (UnaryArithmeticExpression)expression;
            return (expr.getOperator() + " " + this.getMemberAccessExpression(expr.getOperand()));
        }

        else if(expression instanceof AssignmentExpression) {
            AssignmentExpression expr = (AssignmentExpression)expression;
            return this.getMemberAccessExpression(expr.getVariable()) + " = "
                    + this.getMemberAccessExpression(expr.getValue());
        }

        else if(expression instanceof ConcatenatedExpressions) {
            ConcatenatedExpressions expr = (ConcatenatedExpressions)expression;
            String memberAccessExpression = "";
            List<Expression> expressions = expr.getExpressions();

            for(int i = 0; i < expressions.size(); i++)
                memberAccessExpression += this.getMemberAccessExpression(expr.getExpressions().get(i))
                        + ((i != (expressions.size()-1))? " + " : "");

            return memberAccessExpression;
        }

        else if(expression instanceof DataBindingExpression) {
            DataBindingExpression expr = (DataBindingExpression)expression;
            String memberAccessExpression = "{{ " + this.getMemberAccessExpression(expr.getInterpolatedExpression()) + " }}";
            return memberAccessExpression;
        }

        return "";
    }

    public List<Template> getTemplates() {
        return this.templates;
    }
}

