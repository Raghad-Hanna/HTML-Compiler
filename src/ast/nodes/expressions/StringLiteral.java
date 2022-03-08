package ast.nodes.expressions;

import ast.nodes.Token;

public class StringLiteral extends Token implements Expression {
    private String text;

    public StringLiteral(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }

    public String getText() {
        return this.text;
    }
}
