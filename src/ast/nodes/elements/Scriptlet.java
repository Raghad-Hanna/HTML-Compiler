package ast.nodes.elements;

import ast.nodes.PrintUtil;
import ast.nodes.contents.Content;

public class Scriptlet implements Content {
    private String JavaCode = "";

    public Scriptlet(String JavaCode) {
        this.JavaCode = JavaCode;
    }

    public String toString(int indentCount) {
        if(this.JavaCode.equals(""))
            return "";
        String indent = PrintUtil.getIndent(indentCount);
        return indent + this.JavaCode + "\n";
    }

    @Override
    public String toString() {
        if(this.JavaCode.equals(""))
            return "";
        return this.JavaCode;
    }
}
