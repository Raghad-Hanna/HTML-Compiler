package code_generation;

public class ShowHideTemplate implements Template {
    private String template;
    private String elementID;
    private String displayCondition;
    private boolean show;

    public ShowHideTemplate(String displayCondition, boolean show) {
        this.template = "";
        this.displayCondition = displayCondition;
        this.show = show;
    }

    @Override
    public void generateTemplate() {
        StringBuilder elementID = new StringBuilder(this.elementID);
        elementID.deleteCharAt(0);
        elementID.deleteCharAt(elementID.length() - 1);

        String functionName = "changeElement" + elementID + "Display";

        this.template += "\t\t\tvar " + functionName + " = function() {\n";
        this.template += "\t\t\t\telement = document.getElementById(" + this.elementID + ");\n";

        if(this.show)
            this.template += "\t\t\t\tif(" + this.displayCondition + ") {\n";
        else
            this.template += "\t\t\t\tif(!" + this.displayCondition + ") {\n";

        this.template += "\t\t\t\t\telement.style.display='block';\n";
        this.template += "\t\t\t\t}\n";

        this.template += "\t\t\t\telse {\n";
        this.template += "\t\t\t\t\telement.style.display='none';\n";
        this.template += "\t\t\t\t}\n";

        this.template += "\t\t\t};\n\n";

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
