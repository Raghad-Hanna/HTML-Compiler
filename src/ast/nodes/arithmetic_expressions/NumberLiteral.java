package ast.nodes.arithmetic_expressions;

import ast.nodes.Token;

public class NumberLiteral extends Token implements ArithmeticExpression {
    private double number;

    public NumberLiteral(String number) {
        this.number = Double.valueOf(number);
    }

    @Override
    public String toString() {
        if(this.number == Math.floor(this.number))
            return String.valueOf((int)this.number);
        return String.valueOf(this.number);
    }

    public double getNumber() {
        return number;
    }
}
