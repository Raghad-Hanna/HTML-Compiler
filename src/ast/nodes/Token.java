package ast.nodes;

public class Token {
    protected int line;
    protected int column;

    public void setPosition(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }
}
