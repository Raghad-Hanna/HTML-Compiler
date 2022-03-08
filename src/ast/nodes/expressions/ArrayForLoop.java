package ast.nodes.expressions;

public class ArrayForLoop implements Expression {
    private Identifier iterator;
    private Expression array;
    private Identifier index;

    public ArrayForLoop(Identifier iterator, Expression array, Identifier index) {
       this.iterator = iterator;
       this.array = array;
       this.index = index;
    }

    @Override
    public String toString() {
        String textRepresentation = "";
        textRepresentation += this.iterator;
        textRepresentation += " in " + this.array;
        textRepresentation += ((this.index != null)? ";" + this.index + "=index" : "");
        return textRepresentation;
    }

    public Identifier getIterator() {
        return this.iterator;
    }

    public Expression getArray() {
        return array;
    }

    public Identifier getIndex() {
        return index;
    }
}
