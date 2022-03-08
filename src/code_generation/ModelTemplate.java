package code_generation;

public class ModelTemplate implements Template {
    private String template;
    private String elementID;
    private String bindingVariable;

    public ModelTemplate(String bindingVariable) {
        this.template = "";
        this.bindingVariable = bindingVariable;
    }

    public void generateTemplate() {
        StringBuilder elementID = new StringBuilder(this.elementID);
        elementID.deleteCharAt(0);
        elementID.deleteCharAt(elementID.length() - 1);

        String functionName = "changeInput" + elementID + "Value";

        this.template += "\t\t\tdocument.getElementById(" + this.elementID + ").value = ";
        this.template += this.bindingVariable + ";\n\n";

        this.template += "\t\t\tvar " + functionName + " = function(event) {\n";
        this.template += "\t\t\t\t" + this.bindingVariable + " = document.getElementById(" +
                this.elementID + ").value;\n";

        this.template += "\t\t\t};\n\n";
        this.template += "\t\t\tdocument.getElementById(" + this.elementID + ").addEventListener(\"";
        this.template += "input\", function(event) {\n";
        this.template += "\t\t\t\tchanges.push(" + functionName + ");\n";
        this.template += "\t\t\t});\n\n";

        this.template += "\t\t\tchanges.push(" + functionName + ");\n\n";
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
