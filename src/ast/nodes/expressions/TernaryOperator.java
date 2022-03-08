package ast.nodes.expressions;

import ast.nodes.boolean_expressions.BooleanExpression;

public class TernaryOperator implements Expression {
    private BooleanExpression leftOperand;
    private Expression middleOperand;
    private Expression rightOperand;

    public TernaryOperator(BooleanExpression leftOperand, Expression middleOperand,
                           Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.middleOperand = middleOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public String toString() {
        String textRepresentation = "";
        textRepresentation += this.leftOperand + "? ";
        textRepresentation += this.middleOperand + " : ";
        textRepresentation += this.rightOperand;
        return textRepresentation;
    }
}
