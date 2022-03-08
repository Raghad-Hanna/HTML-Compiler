package ast.nodes.expressions;

public class ObjectForLoop implements Expression {
    private Identifier key;
    private Identifier value;
    private Expression object;

    public ObjectForLoop(Identifier key, Identifier value, Expression object) {
        this.key = key;
        this.value = value;
        this.object = object;
    }

    @Override
    public String toString() {
        String textRepresentation = "";
        textRepresentation += this.key;
        textRepresentation += ", " + this.value;
        textRepresentation += " in " + this.object;
        return textRepresentation;
    }

    public Identifier getKey() {
        return key;
    }

    public Identifier getValue() {
        return value;
    }

    public Expression getObject() {
        return object;
    }
}
