package ast.nodes.elements;

import ast.nodes.Token;
import ast.nodes.PrintUtil;
import ast.nodes.attributes.Attribute;
import ast.nodes.contents.Content;
import java.util.List;

public class HTMLElement extends Token implements Content {
    private String startTagName;
    private String endTagName;
    private List<Attribute> attributes;
    private List<Content> contents;

    public HTMLElement(String startTagName, String endTagName,
                       List<Attribute> attributes, List<Content> contents) {
        this.startTagName = startTagName;
        this.endTagName = endTagName;
        this.attributes = attributes;
        this.contents = contents;
    }

    public String toString(int indentCount) {
        String textRepresentation = "";
        String indent = PrintUtil.getIndent(indentCount);

        textRepresentation += indent + "<" + this.startTagName;

        for(Attribute attribute: this.attributes)
            textRepresentation += " " + attribute;

        textRepresentation += ((!this.endTagName.equals(""))? ">\n" : "/>\n");

        for(Content content: this.contents)
            textRepresentation +=
                    content.toString(indentCount + 1);

        if(!this.endTagName.equals(""))
            textRepresentation +=
                    (indent + "</" + this.endTagName + ">\n");
        return textRepresentation;
    }

    public String getStartTagName() {
        return this.startTagName;
    }

    public String getEndTagName() {
        return this.endTagName;
    }

    public List<Attribute> getAttributes() {
        return this.attributes;
    }

    public List<Content> getContents() {
        return this.contents;
    }
}
