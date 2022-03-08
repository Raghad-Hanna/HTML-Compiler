package ast.nodes.expressions;

import ast.nodes.arithmetic_expressions.ArithmeticExpression;
import ast.nodes.boolean_expressions.BooleanExpression;
import java.util.List;

public class FunctionCall implements BooleanExpression, ArithmeticExpression,
        ObjectMember {
    private Identifier identifier;
    private List<Expression> arguments;

    public FunctionCall(Identifier identifier, List<Expression> arguments) {
        this.identifier = identifier;
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        String textRepresentation = "";
        textRepresentation += this.identifier + "(";
            for(int i = 0; i < this.arguments.size(); i++)
                textRepresentation += this.arguments.get(i) + ((i != this.arguments.size() - 1)? ", " : "");
        textRepresentation += ")";
        return textRepresentation;
    }

    @Override
    public String getSymbolName() {
        return this.identifier.getSymbolName();
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public List<Expression> getArguments() {
        return arguments;
    }
}
