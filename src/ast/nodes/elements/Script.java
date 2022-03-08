package ast.nodes.elements;

import ast.nodes.PrintUtil;
import ast.nodes.contents.Content;

public class Script implements Content {
    private String JavaScriptCode = "";

    public Script(String JavaScriptCode) {
        this.JavaScriptCode = JavaScriptCode;
    }

    public String toString(int indentCount) {
        if(this.JavaScriptCode.equals(""))
            return "";
        String indent = PrintUtil.getIndent(indentCount);
        return indent + this.JavaScriptCode + "\n";
    }

    @Override
    public String toString() {
        if(this.JavaScriptCode.equals(""))
            return "";
        return this.JavaScriptCode;
    }
}
