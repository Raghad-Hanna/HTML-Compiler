package semantic_analyzer;

import ast.nodes.attributes.Attribute;
import ast.nodes.expressions.ArrayForLoop;
import ast.nodes.expressions.Identifier;
import symbol_table_manager.Scope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AttributeValidator implements AttributesValidator {
    private static HashSet<String> uniqueIDs;
    private static int appCountInPath;

    private final String elementName;
    private final int line;
    private final int column;

    private Attribute attribute;

    private HashSet<String> uniqueAttributes;
    private List<String> requiredAttributes;
    private int structuralAttributeCount;

    static {
       uniqueIDs = new HashSet<>();
       appCountInPath = 0;
    }

    public AttributeValidator(String elementName, int line, int column) {
        this.elementName = elementName;
        this.line = line;
        this.column = column;
        this.uniqueAttributes = new HashSet<>();
        this.setRequiredAttributes();
        this.structuralAttributeCount = 0;
    }

    @Override
    public void validate() {
        boolean attributeUnique = this.validateAttributeUniqueness();
        if(!attributeUnique)
            return;

        this.checkRequiredAttributeExistence();
        this.checkIfAttributeIsStructural();

        switch(this.attribute.getKey()) {
            case "id":
            case "ID":
                this.validateIDUniqueness();
                break;
            case "cp-app":
                this.validateAppLegality();
                break;
            case "cp-for":
                this.validateIteratorRepetition();
            default:
                break;
        }
    }

    private boolean validateAttributeUniqueness() {
        boolean unique = this.uniqueAttributes.add(this.attribute.getKey().toLowerCase());
        if(!unique)
            this.printErrorMessage(this.attribute.getLine(), this.attribute.getColumn(),
                    "A Duplicate Of " + this.attribute.getKey() + " Attribute Was Found");
        return unique;
    }

    private void checkRequiredAttributeExistence() {
        this.requiredAttributes.remove(this.attribute.getKey().toLowerCase());
    }

    private void checkIfAttributeIsStructural() {
        if(this.attribute.isStructural())
            this.structuralAttributeCount++;
    }

    private void validateIDUniqueness() {
        if(!uniqueIDs.add(this.attribute.getValue().toString()))
            printErrorMessage(this.attribute.getLine(), this.attribute.getColumn(),
                    "A Duplicate ID Was Found");
    }

    private void validateAppLegality() {
        if(++appCountInPath > 1)
            this.printErrorMessage(this.attribute.getLine(), this.attribute.getColumn(),
                    "An Illegal Nested cp-app Was Found");
    }

    private void validateIteratorRepetition() {
        if(!(this.attribute.getValue() instanceof ArrayForLoop))
            return;

        ArrayForLoop value = (ArrayForLoop)this.attribute.getValue();
        Identifier iterator = value.getIterator();
        Scope constitutedScope = this.attribute.getConstitutedScope();

        if(!constitutedScope.symbolDefinedInScope(iterator.getSymbolName()))
            this.printErrorMessage(iterator.getLine(), iterator.getColumn(),
                    iterator.getSymbolName() + " Iterator Repeated");
    }
    
    @Override
    public void validateRequiredAttributesExistence() {
        for(String attribute: this.requiredAttributes)
            this.printErrorMessage(this.line, this.column,
                    "Element " + this.elementName + " Is Missing Required Attribute " + attribute);
    }

    @Override
    public void validateStructuralAttributeCount() {
        if(this.structuralAttributeCount > 1)
            this.printErrorMessage(line, column, elementName
                    + " Element Has More Than 1 Structural Directive");
    }

    @Override
    public void forgetElementAppIfFound() {
        if(this.uniqueAttributes.contains("cp-app"))
            appCountInPath--;
    }

    @Override
    public boolean hasAttribute(String attributeName) {
        return this.uniqueAttributes.contains(attributeName);
    }

    @Override
    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    private void setRequiredAttributes() {
        this.requiredAttributes = new ArrayList<>();

        switch(this.elementName.toLowerCase()) {
            case "img":
                this.requiredAttributes.add("src");
                this.requiredAttributes.add("alt");
                break;
            case "a":
                this.requiredAttributes.add("href");
                break;
            default:
                break;
        }
    }
}
