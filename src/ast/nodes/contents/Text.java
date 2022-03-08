package ast.nodes.contents;

import ast.nodes.PrintUtil;

public class Text implements Content {
    private String text;

    public Text(String text) {
        this.text = text;
    }

    public String toString(int indentCount) {
        String indent = PrintUtil.getIndent(indentCount);
        return indent + this.text.replaceAll("\n", "\n" + indent) + "\n";
    }

    @Override
    public String toString() {
        return this.text;
    }
}
