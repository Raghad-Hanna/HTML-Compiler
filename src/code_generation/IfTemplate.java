package code_generation;

public class IfTemplate implements Template {
    private String template;
    private String elementID;
    private String deletionCondition;

    public IfTemplate(String deletionCondition) {
        this.template = "";
        this.deletionCondition = deletionCondition;
    }

    public void generateTemplate() {
        StringBuilder elementID = new StringBuilder(this.elementID);
        elementID.deleteCharAt(0);
        elementID.deleteCharAt(elementID.length() - 1);

        String functionName = "ifTemplate" + elementID;

        this.template += "\t\t\tisFound += allCpIfStatements.find(el => el.id == "
                + this.elementID + ");\n";

        this.template += "\t\t\telement = document.getElementById(" + this.elementID + ")\n";
        this.template += "\t\t\tif(!isFound) {\n";
        this.template += "\t\t\t\tparentNode = document.getElementById(" + this.elementID +
                ").parentNode\n";

        this.template += "\t\t\t\tallCpIfStatements.push(" +
                "{ id:" + this.elementID + ", " +
                "copyEl: element.cloneNode(true), " +
                "parent: parentNode.id, " +
                "index: Array.prototype.indexOf.call(parentNode.childNodes, element), " +
                "isZero: false, " +
                "})\n";

        this.template += "\t\t\t\telement.hidden = true;\n";
        this.template += "\t\t\t\tcopiedElements.push(element);\n";

        this.template += "\t\t\t}\n";

        this.template += "\t\t\tvar " + functionName + " = function() {\n";
        this.template += "\t\t\t\tlet newEl = allCpIfStatements.find(el => el.id == " +
                this.elementID + ");\n";
        this.template += "\t\t\t\tlet indexEl = allCpIfStatements.findIndex(el => el.id == " +
                this.elementID + ");\n";

        this.template += "\t\t\t\tlet befor = 0;\n";
        this.template += "\t\t\t\tfor(let i = indexEl-1; i >= 0; i--) {\n";
        this.template += "\t\t\t\t\tif(allCpIfStatements[i].parent == allCpIfStatements[indexEl].parent&&allCpIfStatements[i].isZero)\n";
        this.template += "\t\t\t\t\t\tbefor++\n";
        this.template += "\t\t\t\t}\n";

        this.template += "\t\t\t\telement = newEl.copyEl.cloneNode(true);\n";
        this.template += "\t\t\t\tparentEl = document.getElementById(newEl.parent);\n";

        this.template += "\t\t\t\tif(parentEl) {\n";
        this.template += "\t\t\t\t\tif(" + this.deletionCondition + ") {\n";
        this.template += "\t\t\t\t\t\tallCpIfStatements[indexEl].isZero = false\n";
        this.template += "\t\t\t\t\t\tparentEl.insertBefore(element,parentEl.childNodes[(newEl.index - befor) + 1]);\n";
        this.template += "\t\t\t\t\t\tcopiedElements.push(element);\n";
        this.template += "\t\t\t\t\t}\n";

        this.template += "\t\t\t\t\telse\n";
        this.template += "\t\t\t\t\t\tallCpIfStatements[indexEl].isZero = true\n";
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

