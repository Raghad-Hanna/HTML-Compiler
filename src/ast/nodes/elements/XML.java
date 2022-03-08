package ast.nodes.elements;

import ast.nodes.PrintUtil;

public class XML {
    private String document = "";

    public String toString(int indentCount) {
        if(this.document.equals(""))
            return "";
        String indent = PrintUtil.getIndent(indentCount);
        return indent + this.document + "\n";
    }

    @Override
    public String toString() {
        if(this.document.equals(""))
            return "";
        return this.document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
