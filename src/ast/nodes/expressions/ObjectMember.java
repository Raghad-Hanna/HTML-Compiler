package ast.nodes.expressions;

/**
 * A Marker Interface To Treat All Kinds Of Accessed Object Members
 * (Identifier, ArrayElement, FunctionCall) To Be Of The Same Type.
 */

public interface ObjectMember extends Expression {
    String getSymbolName();
}
