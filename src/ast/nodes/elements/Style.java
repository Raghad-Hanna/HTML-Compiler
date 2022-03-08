package ast.nodes.elements;

import ast.nodes.PrintUtil;
import ast.nodes.contents.Content;

public class Style implements Content {
    private String CSSCode = "";

    public Style(String CSSCode) {
        this.CSSCode = CSSCode;
    }

    public String toString(int indentCount) {
        if(this.CSSCode.equals(""))
            return "";
        String indent = PrintUtil.getIndent(indentCount);
        return indent + this.CSSCode + "\n";
    }

    @Override
    public String toString() {
        if(this.CSSCode.equals(""))
            return "";
        return this.CSSCode;
    }
}
