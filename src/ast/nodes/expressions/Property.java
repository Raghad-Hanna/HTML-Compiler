package ast.nodes.expressions;

public class Property {
    private ObjectChainedMembers key;
    private Expression value;

    public Property(ObjectChainedMembers key, Expression value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return this.key + ": " + this.value;
    }

    public ObjectChainedMembers getKey() {
        return key;
    }

    public Expression getValue() {
        return value;
    }
}
