package ast.nodes.boolean_expressions;

public class BooleanLiteral implements BooleanExpression {
    private String booleanLiteral;

    public BooleanLiteral(String booleanLiteral) {
        this.booleanLiteral = booleanLiteral;
    }

    @Override
    public String toString() {
        return this.booleanLiteral;
    }
}
