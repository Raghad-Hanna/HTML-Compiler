package code_generation;

public class SwitchTemplate implements Template {
    private String template;
    private String elementID;
    private String deletionCondition;
    private Boolean isDefault;

    public SwitchTemplate(String deletionCondition, Boolean isDefault) {
        this.template = "";
        this.deletionCondition = deletionCondition;
        this.isDefault = isDefault;
    }

    public void generateTemplate() {
        StringBuilder elementID = new StringBuilder(this.elementID);
        elementID.deleteCharAt(0);
        elementID.deleteCharAt(elementID.length() - 1);

        String functionName = "switchTemplate" + elementID;

        this.template += "\t\t\tisFound += allSwitchStatements.find(el => el.id == " +
                this.elementID + ");\n";

        this.template += "\t\t\telement = document.getElementById(" + this.elementID + ")\n";

        this.template += "\t\t\tif(!isFound) {\n";
        this.template += "\t\t\t\tparentNode = document.getElementById(" + this.elementID +
                ").parentNode\n";

        this.template += "\t\t\t\tallSwitchStatements.push(" +
                "{id: " + this.elementID + ", " +
                "copyEl: element.cloneNode(true), " +
                "parent: parentNode.id, \n" +
                "isDefault: " + this.isDefault + ", " +
                "})\n";

        this.template += "\t\t\t\telement.hidden = true;\n";
        this.template += "\t\t\t\tcopiedElements.push(element);\n";
        this.template += "\t\t\t}\n\n";

        this.template += "\t\t\tvar " + functionName + " = function() {\n";
        this.template += "\t\t\t\tlet newEl = allSwitchStatements.find(el => el.id == " +
                this.elementID + ");\n";

        this.template += "\t\t\t\telement = newEl.copyEl.cloneNode(true);\n";
        this.template += "\t\t\t\tparentEl=document.getElementById(newEl.parent);\n";


        this.template += "\t\t\t\tif(parentEl) {\n";
        this.template += "\t\t\t\t\tlet switchVal = parentEl.getAttribute('cp-switch')\n";

        if(!this.isDefault) {
            this.template += "\t\t\t\t\tif(forthyear[switchVal] == " +
                    this.deletionCondition + ") {\n";
            this.template += "\t\t\t\t\t\tparentEl.appendChild(element);\n";
            this.template += "\t\t\t\t\t\tcopiedElements.push(element);\n";
            this.template += "\t\t\t\t\t}\n\n";
        }
        else {
            this.template += "\t\t\t\t\tif(parentEl.childElementCount === 0) {\n";
            this.template += "\t\t\t\t\t\tparentEl.appendChild(element);\n";
            this.template += "\t\t\t\t\t\tcopiedElements.push(element);\n";
            this.template += "\t\t\t\t\t};\n";
        }

        this.template += "\t\t\t\t}\n";
        this.template += "\t\t\t}\n\n";
        this.template += "renders.push(" + functionName + ");\n\n";
    }

    @Override
    public String toString() {
        return this.template;
    }

    @Override
    public void setElementID(String elementID) {
        this.elementID = elementID;
    }
}


