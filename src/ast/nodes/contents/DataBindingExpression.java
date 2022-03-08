package ast.nodes.contents;

import ast.nodes.PrintUtil;
import ast.nodes.expressions.Expression;
import java.util.List;

/**
 * A Class That Represents An AngularJS Expression Which Consists Of JS-valid Expression
 * That Has The Ability To Be Formatted With The AngularJS Filters Concept.
 */

public class DataBindingExpression implements Expression, Content {
    private Expression interpolatedExpression;
    private List<Filter> filters;

    public DataBindingExpression(Expression interpolatedExpression, List<Filter> filters) {
        this.interpolatedExpression = interpolatedExpression;
        this.filters = filters;
    }

    public String toString(int indentCount) {
        String indent = PrintUtil.getIndent(indentCount);
        return indent + this.toString() + "\n";
    }

    @Override
    public String toString() {
        String textRepresentation = "";
        textRepresentation += "{{" + this.interpolatedExpression;
        for(int i = 0; i < this.filters.size(); i++)
            textRepresentation += " | " + this.filters.get(i);
        textRepresentation += "}}";
        return textRepresentation;
    }

    public Expression getInterpolatedExpression() {
        return interpolatedExpression;
    }

    public List<Filter> getFilters() {
        return this.filters;
    }
}
