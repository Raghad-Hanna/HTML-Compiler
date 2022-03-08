package ast.nodes.boolean_expressions;

import ast.nodes.arithmetic_expressions.ArithmeticExpression;

public class BinaryComparisonExpression implements BooleanExpression {
    private ArithmeticExpression leftOperand;
    private String operator;
    private ArithmeticExpression rightOperand;

    public BinaryComparisonExpression(ArithmeticExpression leftOperand, String operator,
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
