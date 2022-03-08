package ast.nodes.contents;

/**
 * A Marker Interface To Treat All Kinds Of Element Content (Element, Script, Data BindingExpression, ..)
 * No Matter How Structurally Different They Are To Be Of The Same Type.
 */

public interface Content {
    String toString(int indentCount);
}
