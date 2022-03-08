package ast.nodes.expressions;

import ast.nodes.Token;
import ast.nodes.arithmetic_expressions.ArithmeticExpression;
import ast.nodes.boolean_expressions.BooleanExpression;

public class Identifier extends Token implements BooleanExpression, ArithmeticExpression,
        ObjectMember {
    private String name;

    public Identifier(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
       return this.name;
    }

    @Override
    public String getSymbolName() {
        return this.name;
    }
}
