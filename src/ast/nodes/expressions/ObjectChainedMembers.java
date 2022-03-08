package ast.nodes.expressions;

import ast.nodes.arithmetic_expressions.ArithmeticExpression;
import ast.nodes.boolean_expressions.BooleanExpression;
import java.util.List;

public class ObjectChainedMembers implements BooleanExpression, ArithmeticExpression {
    private List<ObjectMember> members;

    public ObjectChainedMembers(List<ObjectMember> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        String textRepresentation = "";
        for(int i = 0; i < this.members.size(); i++)
            textRepresentation +=
                    this.members.get(i) + ((i != this.members.size() - 1)? "." : "");
        return textRepresentation;
    }

    public List<ObjectMember> getMembers() {
        return members;
    }
}
