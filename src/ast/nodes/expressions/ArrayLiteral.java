package ast.nodes.expressions;

import java.util.List;

public class ArrayLiteral implements Expression {
    private List<Expression> elements;

    public ArrayLiteral(List<Expression> elements) {
        this.elements = elements;
    }

    @Override
    public String toString () {
        String textRepresentation = "[";
        for(int i = 0; i < this.elements.size(); i++)
            textRepresentation += this.elements.get(i) + ((i != this.elements.size() - 1)? ", " : "");
        return textRepresentation + "]";
    }

    public List<Expression> getElements() {
        return elements;
    }
}
