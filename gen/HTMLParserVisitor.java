// Generated from C:/Users/Raghad/Desktop/Compiler/html-compiler/src\HTMLParser.g4 by ANTLR 4.8
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(HTMLParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonVoidElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonVoidElement(HTMLParser.NonVoidElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidElement(HTMLParser.VoidElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switchElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchElement(HTMLParser.SwitchElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scriptletElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptletElement(HTMLParser.ScriptletElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scriptElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptElement(HTMLParser.ScriptElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code styleElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElement(HTMLParser.StyleElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code originalAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOriginalAttribute(HTMLParser.OriginalAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extendedAttribute}
	 * labeled alternative in {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttribute(HTMLParser.ExtendedAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cp_appDirective}
	 * labeled alternative in {@link HTMLParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_appDirective(HTMLParser.Cp_appDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cp_showDirective}
	 * labeled alternative in {@link HTMLParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_showDirective(HTMLParser.Cp_showDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cp_hideDirective}
	 * labeled alternative in {@link HTMLParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_hideDirective(HTMLParser.Cp_hideDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cp_ifDirective}
	 * labeled alternative in {@link HTMLParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_ifDirective(HTMLParser.Cp_ifDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eventListenerDirective}
	 * labeled alternative in {@link HTMLParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventListenerDirective(HTMLParser.EventListenerDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cp_modelDirective}
	 * labeled alternative in {@link HTMLParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_modelDirective(HTMLParser.Cp_modelDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cp_forDirective}
	 * labeled alternative in {@link HTMLParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_forDirective(HTMLParser.Cp_forDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectLiteralArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralArgument(HTMLParser.ObjectLiteralArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpressionArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpressionArgument(HTMLParser.ParenthesizedExpressionArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryOperatorArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryOperatorArgument(HTMLParser.TernaryOperatorArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLiteralArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralArgument(HTMLParser.ArrayLiteralArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteralArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralArgument(HTMLParser.StringLiteralArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticExpressionArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionArgument(HTMLParser.ArithmeticExpressionArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanExpressionArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpressionArgument(HTMLParser.BooleanExpressionArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentExpressionArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpressionArgument(HTMLParser.AssignmentExpressionArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concatenatedExpressionArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenatedExpressionArgument(HTMLParser.ConcatenatedExpressionArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dataBindingExpressionArgument}
	 * labeled alternative in {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataBindingExpressionArgument(HTMLParser.DataBindingExpressionArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(HTMLParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(HTMLParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(HTMLParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(HTMLParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#arrayElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElements(HTMLParser.ArrayElementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveBooleanExpression}
	 * labeled alternative in {@link HTMLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveBooleanExpression(HTMLParser.PrimitiveBooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryComparisonExpression}
	 * labeled alternative in {@link HTMLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryComparisonExpression(HTMLParser.BinaryComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedBooleanExpression}
	 * labeled alternative in {@link HTMLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedBooleanExpression(HTMLParser.ParenthesizedBooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryBooleanExpression}
	 * labeled alternative in {@link HTMLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryBooleanExpression(HTMLParser.BinaryBooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryBooleanExpression}
	 * labeled alternative in {@link HTMLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryBooleanExpression(HTMLParser.UnaryBooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link HTMLParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(HTMLParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanObjectAccessedMember}
	 * labeled alternative in {@link HTMLParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanObjectAccessedMember(HTMLParser.BooleanObjectAccessedMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#booleanOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOperator(HTMLParser.BooleanOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#equalityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityOperator(HTMLParser.EqualityOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(HTMLParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveArithmeticExpression}
	 * labeled alternative in {@link HTMLParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveArithmeticExpression(HTMLParser.PrimitiveArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryArithmeticExpression}
	 * labeled alternative in {@link HTMLParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryArithmeticExpression(HTMLParser.UnaryArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedArithmeticExpression}
	 * labeled alternative in {@link HTMLParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedArithmeticExpression(HTMLParser.ParenthesizedArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryArithmeticExpression}
	 * labeled alternative in {@link HTMLParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryArithmeticExpression(HTMLParser.BinaryArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link HTMLParser#numericValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(HTMLParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericObjectAccessedMember}
	 * labeled alternative in {@link HTMLParser#numericValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericObjectAccessedMember(HTMLParser.NumericObjectAccessedMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperator(HTMLParser.ArithmeticOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(HTMLParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basicTernaryOperator}
	 * labeled alternative in {@link HTMLParser#ternaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicTernaryOperator(HTMLParser.BasicTernaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedTernaryOperator}
	 * labeled alternative in {@link HTMLParser#ternaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedTernaryOperator(HTMLParser.ParenthesizedTernaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#objectChainedMembers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectChainedMembers(HTMLParser.ObjectChainedMembersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accessedIdentifier}
	 * labeled alternative in {@link HTMLParser#objectMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessedIdentifier(HTMLParser.AccessedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accessedArrayElement}
	 * labeled alternative in {@link HTMLParser#objectMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessedArrayElement(HTMLParser.AccessedArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accessedFunctionCall}
	 * labeled alternative in {@link HTMLParser#objectMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessedFunctionCall(HTMLParser.AccessedFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(HTMLParser.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directlyAccessedArray}
	 * labeled alternative in {@link HTMLParser#arrayName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectlyAccessedArray(HTMLParser.DirectlyAccessedArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnedArray}
	 * labeled alternative in {@link HTMLParser#arrayName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnedArray(HTMLParser.ReturnedArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#arrayElementIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElementIndex(HTMLParser.ArrayElementIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(HTMLParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#functionArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArguments(HTMLParser.FunctionArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayForLoop}
	 * labeled alternative in {@link HTMLParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayForLoop(HTMLParser.ArrayForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectForLoop}
	 * labeled alternative in {@link HTMLParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectForLoop(HTMLParser.ObjectForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLiteralDataSource}
	 * labeled alternative in {@link HTMLParser#arrayDataSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralDataSource(HTMLParser.ArrayLiteralDataSourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectChainedMembersDataSource}
	 * labeled alternative in {@link HTMLParser#arrayDataSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectChainedMembersDataSource(HTMLParser.ObjectChainedMembersDataSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#switchE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchE(HTMLParser.SwitchEContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#switchAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchAttribute(HTMLParser.SwitchAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#switchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCase(HTMLParser.SwitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonDefaultSwitchCase}
	 * labeled alternative in {@link HTMLParser#switchCaseAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonDefaultSwitchCase(HTMLParser.NonDefaultSwitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defaultSwitchCase}
	 * labeled alternative in {@link HTMLParser#switchCaseAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultSwitchCase(HTMLParser.DefaultSwitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementContent}
	 * labeled alternative in {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementContent(HTMLParser.ElementContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textContent}
	 * labeled alternative in {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextContent(HTMLParser.TextContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dataContent}
	 * labeled alternative in {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataContent(HTMLParser.DataContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(HTMLParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#dataBindingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataBindingExpression(HTMLParser.DataBindingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#interpolatedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolatedExpression(HTMLParser.InterpolatedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#filters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilters(HTMLParser.FiltersContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(HTMLParser.FilterContext ctx);
}