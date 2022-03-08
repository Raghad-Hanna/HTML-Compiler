package ast.nodes.elements;

import ast.nodes.PrintUtil;

public class DTD {
    private String definition = "";

    public String toString(int indentCount) {
        if(this.definition.equals(""))
            return "";
        String indent = PrintUtil.getIndent(indentCount);
        return indent + this.definition + "\n";
    }

    @Override
    public String toString() {
        if(this.definition.equals(""))
            return "";
        return this.definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
