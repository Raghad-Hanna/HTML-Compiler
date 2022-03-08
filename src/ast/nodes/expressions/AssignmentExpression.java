package ast.nodes.expressions;

public class AssignmentExpression implements Expression {
    private ObjectChainedMembers variable;
    private Expression value;

    public AssignmentExpression(ObjectChainedMembers variable, Expression value) {
        this.variable = variable;
        this.value = value;
    }

    @Override
    public String toString() {
        return this.variable + " = " + this.value;
    }

    public ObjectChainedMembers getVariable() {
        return variable;
    }

    public Expression getValue() {
        return value;
    }
}
