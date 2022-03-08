package semantic_analyzer;

import ast.nodes.attributes.Attribute;
import ast.nodes.contents.Content;
import ast.nodes.contents.DataBindingExpression;
import ast.nodes.elements.HTMLElement;
import ast.nodes.expressions.Expression;
import java.util.ArrayList;
import java.util.List;

public class ElementValidator implements Validator {
    private HTMLElement element;
    private ElementType expectedElementType;

    private String actualParentElementName;
    private List<String> expectedParentElementNames;

    private boolean responsibleForBootstrapping;

    private AttributesValidator attributeValidator;

    public ElementValidator(HTMLElement element, String actualParentElementName,
                            boolean responsibleForBootstrapping) {
        this.element = element;
        this.setExpectedElementType();

        this.actualParentElementName = actualParentElementName;
        this.setExpectedParentElementNames();

        this.responsibleForBootstrapping = responsibleForBootstrapping;

        this.attributeValidator = new AttributeValidator(this.element.getStartTagName(),
                this.element.getLine(), this.element.getColumn());
    }

    @Override
    public void validate() {
        this.validateElementType();
        this.validateElementTagsMatch();
        this.validateParentChildRelationshipLegality();
        this.validateAttributes();
        this.validateBootstrapping();
        this.validateContents();

        if(this.actualParentElementName.equals(""))
            this.attributeValidator.forgetElementAppIfFound();
    }

    private void validateElementType() {
        if(this.nonVoidElement() && this.expectedElementType == ElementType.VOID)
            this.printErrorMessage(this.element.getLine(), this.element.getColumn(),
                    "End Tag Syntax Used On A Void Element");

        else if(!this.nonVoidElement() && this.expectedElementType == ElementType.NON_VOID)
            this.printErrorMessage(this.element.getLine(), this.element.getColumn(),
                    "Self-closing Syntax (/>) Used On a Non-void Element");
    }

    private void validateElementTagsMatch() {
        if(nonVoidElement() && tagsMatchFailed())
            this.printErrorMessage(element.getLine(), element.getColumn(),
                    element.getStartTagName() + " Element Tags Must Match");
    }

    private boolean nonVoidElement() {
        return !element.getEndTagName().equals("");
    }

    private boolean tagsMatchFailed() {
        return !element.getStartTagName().equalsIgnoreCase(element.getEndTagName());
    }

    private void validateParentChildRelationshipLegality() {
        if(!this.expectedParentElementNames.contains(this.actualParentElementName.toLowerCase()))
            this.printErrorMessage(this.element.getLine(), this.element.getColumn(),
                    this.element.getStartTagName() + " Element Must Be A Child Of "
                            + ((!this.expectedParentElementNames.contains(""))? this.expectedParentElementNames : "No")
                            + " Element");
    }

    private void validateAttributes() {
        for(Attribute attribute: this.element.getAttributes()) {
            this.attributeValidator.setAttribute(attribute);
            this.attributeValidator.validate();
        }
        this.attributeValidator.validateRequiredAttributesExistence();
        this.attributeValidator.validateStructuralAttributeCount();
    }

    private void validateBootstrapping() {
        if(this.responsibleForBootstrapping && !this.attributeValidator.hasAttribute("cp-app"))
            this.printErrorMessage(this.element.getLine(), this.element.getColumn(),
                    "The Framework Must Bootstrap At The Beginning With A cp-app Directive");
    }

    private void validateContents() {
        for(Content content: this.element.getContents()) {
            if(content instanceof HTMLElement) {
                ElementValidator childElementValidator =
                        new ElementValidator((HTMLElement)content, this.element.getStartTagName(),
                                false);
                childElementValidator.validate();
                childElementValidator.attributeValidator.forgetElementAppIfFound();
            }
            else if(content instanceof Expression)
                new FilterValidator(((DataBindingExpression)content).getFilters()).validate();
        }
    }

    private void setExpectedElementType() {
        switch(this.element.getStartTagName().toLowerCase()) {
            case "br":
            case "hr":
            case "img":
            case "input":
            case "link":
            case "meta":
            case "col":
            case "area":
            case "base":
            case "command":
            case "embed":
            case "keygen":
            case "param":
            case "source":
            case "track":
            case "wbr":
                this.expectedElementType = ElementType.VOID;
                break;
            default:
                this.expectedElementType = ElementType.NON_VOID;
                break;
        }
    }

    private void setExpectedParentElementNames() {
        this.expectedParentElementNames = new ArrayList<>();

        switch(this.element.getStartTagName().toLowerCase()) {
            case "html":
                this.expectedParentElementNames.add("");
                break;
            case "head":
            case "body":
                this.expectedParentElementNames.add("html");
                break;
            case "title":
                this.expectedParentElementNames.add("head");
                break;
            case "li":
                this.expectedParentElementNames.add("ol");
                this.expectedParentElementNames.add("ul");
                break;
            case "td":
                this.expectedParentElementNames.add("tr");
                break;
            default:
                this.expectedParentElementNames.add(this.actualParentElementName.toLowerCase());
                break;
        }
    }
}
