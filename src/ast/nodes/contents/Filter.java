package ast.nodes.contents;

import ast.nodes.expressions.Expression;
import ast.nodes.expressions.ObjectChainedMembers;
import java.util.List;

public class Filter {
    private ObjectChainedMembers name;
    private List<Expression> arguments;

    public Filter(ObjectChainedMembers name, List<Expression> arguments) {
        this.name = name;
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        String textRepresentation = this.name.toString();
        for(Expression argument: this.arguments)
            textRepresentation += ":" + argument;

        return textRepresentation;
    }

    public ObjectChainedMembers getName() {
        return this.name;
    }

    public List<Expression> getArguments() {
        return this.arguments;
    }
}
