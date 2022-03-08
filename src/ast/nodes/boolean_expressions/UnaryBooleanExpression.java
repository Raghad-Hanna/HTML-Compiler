package ast.nodes.boolean_expressions;

public class UnaryBooleanExpression implements BooleanExpression {
    private String operator;
    private BooleanExpression operand;

    public UnaryBooleanExpression(String operator, BooleanExpression operand) {
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

    public BooleanExpression getOperand() {
        return operand;
    }
}
