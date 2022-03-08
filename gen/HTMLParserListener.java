// Generated from C:/Users/Raghad/Desktop/Compiler/html-compiler/src\HTMLParser.g4 by ANTLR 4.8
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(HTMLParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(HTMLParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonVoidElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterNonVoidElement(HTMLParser.NonVoidElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonVoidElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitNonVoidElement(HTMLParser.NonVoidElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterVoidElement(HTMLParser.VoidElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitVoidElement(HTMLParser.VoidElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switchElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterSwitchElement(HTMLParser.SwitchElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switchElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitSwitchElement(HTMLParser.SwitchElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scriptletElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterScriptletElement(HTMLParser.ScriptletElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scriptletElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitScriptletElement(HTMLParser.ScriptletElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scriptElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterScriptElement(HTMLParser.ScriptElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scriptElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitScriptElement(HTMLParser.ScriptElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code styleElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterStyleElement(HTMLParser.StyleElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code styleElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitStyleElement(HTMLParser.StyleElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code originalAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterOriginalAttribute(HTMLParser.OriginalAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code originalAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitOriginalAttribute(HTMLParser.OriginalAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extendedAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttribute(HTMLParser.ExtendedAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extendedAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttribute(HTMLParser.ExtendedAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cp_appDirective}
	 * labeled alternative in {@link HTMLParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterCp_appDirective(HTMLParser.Cp_appDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cp_appDirective}
	 * labeled alternative in {@link HTMLParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitCp_appDirective(HTMLParser.Cp_appDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cp_showDirective}
	 * labeled alternative in {@link HTMLParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterCp_showDirective(HTMLParser.Cp_showDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cp_showDirective}
	 * labeled alternative in {@link HTMLParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitCp_showDirective(HTMLParser.Cp_showDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cp_hideDirective}
	 * labeled alternative in {@link HTMLParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterCp_hideDirective(HTMLParser.Cp_hideDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cp_hideDirective}
	 * labeled alternative in {@link HTMLParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitCp_hideDirective(HTMLParser.Cp_hideDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cp_ifDirective}
	 * labeled alternative in {@link HTMLParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterCp_ifDirective(HTMLParser.Cp_ifDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cp_ifDirective}
	 * labeled alternative in {@link HTMLParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitCp_ifDirective(HTMLParser.Cp_ifDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eventListenerDirective}
	 * labeled alternative in {@link HTMLParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterEventListenerDirective(HTMLParser.EventListenerDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eventListenerDirective}
	 * labeled alternative in {@link HTMLParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitEventListenerDirective(HTMLParser.EventListenerDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cp_modelDirective}
	 * labeled alternative in {@link HTMLParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterCp_modelDirective(HTMLParser.Cp_modelDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cp_modelDirective}
	 * labeled alternative in {@link HTMLParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitCp_modelDirective(HTMLParser.Cp_modelDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cp_forDirective}
	 * labeled alternative in {@link HTMLParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterCp_forDirective(HTMLParser.Cp_forDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cp_forDirective}
	 * labeled alternative in {@link HTMLParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitCp_forDirective(HTMLParser.Cp_forDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectLiteralArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralArgument(HTMLParser.ObjectLiteralArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectLiteralArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralArgument(HTMLParser.ObjectLiteralArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpressionArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpressionArgument(HTMLParser.ParenthesizedExpressionArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpressionArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpressionArgument(HTMLParser.ParenthesizedExpressionArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryOperatorArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryOperatorArgument(HTMLParser.TernaryOperatorArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryOperatorArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryOperatorArgument(HTMLParser.TernaryOperatorArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLiteralArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralArgument(HTMLParser.ArrayLiteralArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLiteralArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralArgument(HTMLParser.ArrayLiteralArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteralArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralArgument(HTMLParser.StringLiteralArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteralArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralArgument(HTMLParser.StringLiteralArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticExpressionArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionArgument(HTMLParser.ArithmeticExpressionArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticExpressionArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionArgument(HTMLParser.ArithmeticExpressionArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpressionArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpressionArgument(HTMLParser.BooleanExpressionArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpressionArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpressionArgument(HTMLParser.BooleanExpressionArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentExpressionArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpressionArgument(HTMLParser.AssignmentExpressionArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentExpressionArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpressionArgument(HTMLParser.AssignmentExpressionArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concatenatedExpressionArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConcatenatedExpressionArgument(HTMLParser.ConcatenatedExpressionArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatenatedExpressionArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConcatenatedExpressionArgument(HTMLParser.ConcatenatedExpressionArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dataBindingExpressionArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDataBindingExpressionArgument(HTMLParser.DataBindingExpressionArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dataBindingExpressionArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDataBindingExpressionArgument(HTMLParser.DataBindingExpressionArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(HTMLParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(HTMLParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(HTMLParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(HTMLParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(HTMLParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(HTMLParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(HTMLParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(HTMLParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#arrayElements}.
	 * @param ctx the parse tree
	 */
	void enterArrayElements(HTMLParser.ArrayElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#arrayElements}.
	 * @param ctx the parse tree
	 */
	void exitArrayElements(HTMLParser.ArrayElementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveBooleanExpression}
	 * labeled alternative in {@link HTMLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveBooleanExpression(HTMLParser.PrimitiveBooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveBooleanExpression}
	 * labeled alternative in {@link HTMLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveBooleanExpression(HTMLParser.PrimitiveBooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryComparisonExpression}
	 * labeled alternative in {@link HTMLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryComparisonExpression(HTMLParser.BinaryComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryComparisonExpression}
	 * labeled alternative in {@link HTMLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryComparisonExpression(HTMLParser.BinaryComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedBooleanExpression}
	 * labeled alternative in {@link HTMLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedBooleanExpression(HTMLParser.ParenthesizedBooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedBooleanExpression}
	 * labeled alternative in {@link HTMLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedBooleanExpression(HTMLParser.ParenthesizedBooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryBooleanExpression}
	 * labeled alternative in {@link HTMLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryBooleanExpression(HTMLParser.BinaryBooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryBooleanExpression}
	 * labeled alternative in {@link HTMLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryBooleanExpression(HTMLParser.BinaryBooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryBooleanExpression}
	 * labeled alternative in {@link HTMLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryBooleanExpression(HTMLParser.UnaryBooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryBooleanExpression}
	 * labeled alternative in {@link HTMLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryBooleanExpression(HTMLParser.UnaryBooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link HTMLParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(HTMLParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link HTMLParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(HTMLParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanObjectAccessedMember}
	 * labeled alternative in {@link HTMLParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanObjectAccessedMember(HTMLParser.BooleanObjectAccessedMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanObjectAccessedMember}
	 * labeled alternative in {@link HTMLParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanObjectAccessedMember(HTMLParser.BooleanObjectAccessedMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#booleanOperator}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOperator(HTMLParser.BooleanOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#booleanOperator}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOperator(HTMLParser.BooleanOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void enterEqualityOperator(HTMLParser.EqualityOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void exitEqualityOperator(HTMLParser.EqualityOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(HTMLParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(HTMLParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveArithmeticExpression}
	 * labeled alternative in {@link HTMLParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveArithmeticExpression(HTMLParser.PrimitiveArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveArithmeticExpression}
	 * labeled alternative in {@link HTMLParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveArithmeticExpression(HTMLParser.PrimitiveArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryArithmeticExpression}
	 * labeled alternative in {@link HTMLParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryArithmeticExpression(HTMLParser.UnaryArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryArithmeticExpression}
	 * labeled alternative in {@link HTMLParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryArithmeticExpression(HTMLParser.UnaryArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedArithmeticExpression}
	 * labeled alternative in {@link HTMLParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedArithmeticExpression(HTMLParser.ParenthesizedArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedArithmeticExpression}
	 * labeled alternative in {@link HTMLParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedArithmeticExpression(HTMLParser.ParenthesizedArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryArithmeticExpression}
	 * labeled alternative in {@link HTMLParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryArithmeticExpression(HTMLParser.BinaryArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryArithmeticExpression}
	 * labeled alternative in {@link HTMLParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryArithmeticExpression(HTMLParser.BinaryArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link HTMLParser#numericValue}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(HTMLParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link HTMLParser#numericValue}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(HTMLParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericObjectAccessedMember}
	 * labeled alternative in {@link HTMLParser#numericValue}.
	 * @param ctx the parse tree
	 */
	void enterNumericObjectAccessedMember(HTMLParser.NumericObjectAccessedMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericObjectAccessedMember}
	 * labeled alternative in {@link HTMLParser#numericValue}.
	 * @param ctx the parse tree
	 */
	void exitNumericObjectAccessedMember(HTMLParser.NumericObjectAccessedMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(HTMLParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(HTMLParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(HTMLParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(HTMLParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code basicTernaryOperator}
	 * labeled alternative in {@link HTMLParser#ternaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBasicTernaryOperator(HTMLParser.BasicTernaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code basicTernaryOperator}
	 * labeled alternative in {@link HTMLParser#ternaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBasicTernaryOperator(HTMLParser.BasicTernaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedTernaryOperator}
	 * labeled alternative in {@link HTMLParser#ternaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedTernaryOperator(HTMLParser.ParenthesizedTernaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedTernaryOperator}
	 * labeled alternative in {@link HTMLParser#ternaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedTernaryOperator(HTMLParser.ParenthesizedTernaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#objectChainedMembers}.
	 * @param ctx the parse tree
	 */
	void enterObjectChainedMembers(HTMLParser.ObjectChainedMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#objectChainedMembers}.
	 * @param ctx the parse tree
	 */
	void exitObjectChainedMembers(HTMLParser.ObjectChainedMembersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accessedIdentifier}
	 * labeled alternative in {@link HTMLParser#objectMember}.
	 * @param ctx the parse tree
	 */
	void enterAccessedIdentifier(HTMLParser.AccessedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accessedIdentifier}
	 * labeled alternative in {@link HTMLParser#objectMember}.
	 * @param ctx the parse tree
	 */
	void exitAccessedIdentifier(HTMLParser.AccessedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accessedArrayElement}
	 * labeled alternative in {@link HTMLParser#objectMember}.
	 * @param ctx the parse tree
	 */
	void enterAccessedArrayElement(HTMLParser.AccessedArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accessedArrayElement}
	 * labeled alternative in {@link HTMLParser#objectMember}.
	 * @param ctx the parse tree
	 */
	void exitAccessedArrayElement(HTMLParser.AccessedArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accessedFunctionCall}
	 * labeled alternative in {@link HTMLParser#objectMember}.
	 * @param ctx the parse tree
	 */
	void enterAccessedFunctionCall(HTMLParser.AccessedFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accessedFunctionCall}
	 * labeled alternative in {@link HTMLParser#objectMember}.
	 * @param ctx the parse tree
	 */
	void exitAccessedFunctionCall(HTMLParser.AccessedFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(HTMLParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(HTMLParser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directlyAccessedArray}
	 * labeled alternative in {@link HTMLParser#arrayName}.
	 * @param ctx the parse tree
	 */
	void enterDirectlyAccessedArray(HTMLParser.DirectlyAccessedArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directlyAccessedArray}
	 * labeled alternative in {@link HTMLParser#arrayName}.
	 * @param ctx the parse tree
	 */
	void exitDirectlyAccessedArray(HTMLParser.DirectlyAccessedArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnedArray}
	 * labeled alternative in {@link HTMLParser#arrayName}.
	 * @param ctx the parse tree
	 */
	void enterReturnedArray(HTMLParser.ReturnedArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnedArray}
	 * labeled alternative in {@link HTMLParser#arrayName}.
	 * @param ctx the parse tree
	 */
	void exitReturnedArray(HTMLParser.ReturnedArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#arrayElementIndex}.
	 * @param ctx the parse tree
	 */
	void enterArrayElementIndex(HTMLParser.ArrayElementIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#arrayElementIndex}.
	 * @param ctx the parse tree
	 */
	void exitArrayElementIndex(HTMLParser.ArrayElementIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(HTMLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(HTMLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#functionArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArguments(HTMLParser.FunctionArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#functionArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArguments(HTMLParser.FunctionArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayForLoop}
	 * labeled alternative in {@link HTMLParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterArrayForLoop(HTMLParser.ArrayForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayForLoop}
	 * labeled alternative in {@link HTMLParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitArrayForLoop(HTMLParser.ArrayForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectForLoop}
	 * labeled alternative in {@link HTMLParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterObjectForLoop(HTMLParser.ObjectForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectForLoop}
	 * labeled alternative in {@link HTMLParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitObjectForLoop(HTMLParser.ObjectForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLiteralDataSource}
	 * labeled alternative in {@link HTMLParser#arrayDataSource}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralDataSource(HTMLParser.ArrayLiteralDataSourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLiteralDataSource}
	 * labeled alternative in {@link HTMLParser#arrayDataSource}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralDataSource(HTMLParser.ArrayLiteralDataSourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectChainedMembersDataSource}
	 * labeled alternative in {@link HTMLParser#arrayDataSource}.
	 * @param ctx the parse tree
	 */
	void enterObjectChainedMembersDataSource(HTMLParser.ObjectChainedMembersDataSourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectChainedMembersDataSource}
	 * labeled alternative in {@link HTMLParser#arrayDataSource}.
	 * @param ctx the parse tree
	 */
	void exitObjectChainedMembersDataSource(HTMLParser.ObjectChainedMembersDataSourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#switchE}.
	 * @param ctx the parse tree
	 */
	void enterSwitchE(HTMLParser.SwitchEContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#switchE}.
	 * @param ctx the parse tree
	 */
	void exitSwitchE(HTMLParser.SwitchEContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#switchAttribute}.
	 * @param ctx the parse tree
	 */
	void enterSwitchAttribute(HTMLParser.SwitchAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#switchAttribute}.
	 * @param ctx the parse tree
	 */
	void exitSwitchAttribute(HTMLParser.SwitchAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(HTMLParser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(HTMLParser.SwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonDefaultSwitchCase}
	 * labeled alternative in {@link HTMLParser#switchCaseAttribute}.
	 * @param ctx the parse tree
	 */
	void enterNonDefaultSwitchCase(HTMLParser.NonDefaultSwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonDefaultSwitchCase}
	 * labeled alternative in {@link HTMLParser#switchCaseAttribute}.
	 * @param ctx the parse tree
	 */
	void exitNonDefaultSwitchCase(HTMLParser.NonDefaultSwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultSwitchCase}
	 * labeled alternative in {@link HTMLParser#switchCaseAttribute}.
	 * @param ctx the parse tree
	 */
	void enterDefaultSwitchCase(HTMLParser.DefaultSwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultSwitchCase}
	 * labeled alternative in {@link HTMLParser#switchCaseAttribute}.
	 * @param ctx the parse tree
	 */
	void exitDefaultSwitchCase(HTMLParser.DefaultSwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementContent}
	 * labeled alternative in {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 */
	void enterElementContent(HTMLParser.ElementContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementContent}
	 * labeled alternative in {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 */
	void exitElementContent(HTMLParser.ElementContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textContent}
	 * labeled alternative in {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 */
	void enterTextContent(HTMLParser.TextContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textContent}
	 * labeled alternative in {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 */
	void exitTextContent(HTMLParser.TextContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dataContent}
	 * labeled alternative in {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 */
	void enterDataContent(HTMLParser.DataContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dataContent}
	 * labeled alternative in {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 */
	void exitDataContent(HTMLParser.DataContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(HTMLParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(HTMLParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#dataBindingExpression}.
	 * @param ctx the parse tree
	 */
	void enterDataBindingExpression(HTMLParser.DataBindingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#dataBindingExpression}.
	 * @param ctx the parse tree
	 */
	void exitDataBindingExpression(HTMLParser.DataBindingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#interpolatedExpression}.
	 * @param ctx the parse tree
	 */
	void enterInterpolatedExpression(HTMLParser.InterpolatedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#interpolatedExpression}.
	 * @param ctx the parse tree
	 */
	void exitInterpolatedExpression(HTMLParser.InterpolatedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#filters}.
	 * @param ctx the parse tree
	 */
	void enterFilters(HTMLParser.FiltersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#filters}.
	 * @param ctx the parse tree
	 */
	void exitFilters(HTMLParser.FiltersContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(HTMLParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(HTMLParser.FilterContext ctx);
}