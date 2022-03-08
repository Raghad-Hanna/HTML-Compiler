package semantic_analyzer;

import ast.nodes.attributes.Attribute;

public interface AttributesValidator extends Validator {
    void setAttribute(Attribute attribute);
    void validateRequiredAttributesExistence();
    void validateStructuralAttributeCount();
    void forgetElementAppIfFound();
    boolean hasAttribute(String attributeName);
}
