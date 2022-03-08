package ast.nodes.arithmetic_expressions;

public class UnaryArithmeticExpression implements ArithmeticExpression {
    private String operator;
    private ArithmeticExpression operand;

    public UnaryArithmeticExpression(String operator, ArithmeticExpression operand) {
        this.operator = operator;
        this.operand = operand;
    }

    @Override
    public String toString() {
        String textRepresentation = "";
        textRepresentation += this.operator;
        textRepresentation += this.operand;
        return textRepresentation;
    }

    public String getOperator() {
        return operator;
    }

    public ArithmeticExpression getOperand() {
        return operand;
    }
}
