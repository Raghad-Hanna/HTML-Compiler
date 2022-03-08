package ast.nodes.arithmetic_expressions;

public class BinaryArithmeticExpression implements ArithmeticExpression {
    private ArithmeticExpression leftOperand;
    private String operator;
    private ArithmeticExpression rightOperand;

    public BinaryArithmeticExpression(ArithmeticExpression leftOperand, String operator,
                                      ArithmeticExpression rightOperand) {
        this.leftOperand = leftOperand;
        this.operator = operator;
        this.rightOperand = rightOperand;
    }

    @Override
    public String toString() {
        String textRepresentation = "";
        textRepresentation += this.leftOperand;
        textRepresentation += " " + this.operator + " ";
        textRepresentation += this.rightOperand;
        return textRepresentation;
    }

    public ArithmeticExpression getLeftOperand() {
        return leftOperand;
    }

    public String getOperator() {
        return operator;
    }

    public ArithmeticExpression getRightOperand() {
        return rightOperand;
    }
}
