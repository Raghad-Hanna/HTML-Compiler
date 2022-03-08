package ast.nodes;

public class PrintUtil {
    public static String getIndent(int indentCount) {
        String indent = "";
        for(int i = 0; i < indentCount; i++)
            indent += "\t";
        return indent;
    }
}
