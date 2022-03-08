package ast.nodes;

import ast.nodes.contents.Content;
import ast.nodes.elements.*;
import java.util.List;

public class Document {
    private XML XMLElement;
    private DTD DTDElement;
    private List<Scriptlet> scriptletElements;
    private List<Content> elements;

    public Document(XML XMLElement, DTD DTDElement,
                    List<Scriptlet> scriptletElements, List<Content> elements) {
        this.XMLElement = XMLElement;
        this.DTDElement = DTDElement;
        this.scriptletElements = scriptletElements;
        this.elements = elements;
    }

    public String toString(int indentCount) {
        String textRepresentation = "";
        for(Scriptlet scriptlet: this.scriptletElements)
            textRepresentation += scriptlet.toString(indentCount);

        textRepresentation += this.XMLElement.toString(indentCount);
        textRepresentation += this.DTDElement.toString(indentCount);

        for(Content element: this.elements)
            textRepresentation += element.toString(indentCount);

        return textRepresentation;
    }

    public List<Content> getElements() {
        return this.elements;
    }
}
