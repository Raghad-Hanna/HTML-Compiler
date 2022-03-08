package ast.nodes.expressions;

import java.util.List;

public class ObjectLiteral implements Expression {
    private List<Property> properties;

    public ObjectLiteral(List<Property> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        String textRepresentation = "";
        textRepresentation += "{ ";

        for(int i = 0; i < this.properties.size(); i++)
            textRepresentation += this.properties.get(i) + ((i != (this.properties.size()-1))? ", " : "");

        textRepresentation += "}";
        return textRepresentation;
    }

    public List<Property> getProperties() {
        return properties;
    }
}
