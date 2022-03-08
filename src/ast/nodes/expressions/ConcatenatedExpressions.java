package ast.nodes.expressions;

import java.util.List;

public class ConcatenatedExpressions implements Expression {
    private List<Expression> expressions;

    public ConcatenatedExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public String toString() {
        String textRepresentation = "";
        for(int i = 0; i < this.expressions.size(); i++)
                textRepresentation += this.expressions.get(i)
                        + ((i != this.expressions.size() - 1)? " + " : "");
        return textRepresentation;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }
}
