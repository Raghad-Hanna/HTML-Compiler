package code_generation;

public class ArrayForTemplate implements Template {
    private String template;
    private String elementID;
    private String iterator;
    private String array;
    private String index;

    public ArrayForTemplate(String iterator, String array, String index) {
        this.template = "";
        this.iterator = iterator;
        this.array = array;
        this.index = index;
    }

    @Override
    public void generateTemplate() {
        StringBuilder elementID = new StringBuilder(this.elementID);
        elementID.deleteCharAt(0);
        elementID.deleteCharAt(elementID.length() - 1);

        String functionName = "copyElement" + elementID;

        this.template += "\t\t\tvar " + functionName + " = function(event) {\n";
        this.template += "\t\t\t\tlet originalElement = document.getElementById(" + this.elementID + ");\n";
        this.template += "\t\t\t\tlet parentElement = originalElement.parentElement;\n\n";
        this.template += "\t\t\t\tlet defaultText = originalElement.innerText;\n";
        this.template += "\t\t\t\tfor(var " + this.iterator + " in " + this.array + ") {\n";
        this.template += "\t\t\t\t\tlet newElement = originalElement.cloneNode(true);\n";
        this.template += "\t\t\t\t\tnewElement.id = " + this.elementID + " + " + this.iterator + ";\n";
        this.template += "\t\t\t\t\tnewElement.innerText = defaultText;\n";
        this.template += "\t\t\t\t\tnewElement.hidden = false;\n";
        this.template += "\t\t\t\t\tparentElement.appendChild(newElement);\n";
        this.template += "\t\t\t\t\tcopiedElements.push(newElement);\n";
        this.template += "\t\t\t\t}\n\n";
        this.template += "\t\t\t\toriginalElement.hidden = true;\n";
        this.template += "\t\t\t}\n";
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
