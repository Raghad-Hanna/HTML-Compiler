package ast.nodes.expressions;

import ast.nodes.arithmetic_expressions.ArithmeticExpression;
import ast.nodes.boolean_expressions.BooleanExpression;
import java.util.List;

public class ArrayElement implements BooleanExpression, ArithmeticExpression,
        ObjectMember {
    private ObjectMember arrayName;
    private List<ArithmeticExpression> indices;

    public ArrayElement(ObjectMember arrayName, List<ArithmeticExpression> indices) {
        this.arrayName = arrayName;
        this.indices = indices;
    }

    @Override
    public String toString() {
        String textRepresentation = "";
        textRepresentation += this.arrayName;

        for(ArithmeticExpression index: this.indices)
            textRepresentation += "[" + index + "]";

        return textRepresentation;
    }

    @Override
    public String getSymbolName() {
        return this.arrayName.getSymbolName();
    }

    public ObjectMember getArrayName() {
        return arrayName;
    }

    public List<ArithmeticExpression> getIndices() {
        return indices;
    }
}
