package code_generation;

import java.util.List;
import java.util.Map;

public class ElementInnerTextTemplate implements Template {
    private String template;
    private String elementID;
    private String content;
    private String innerText;
    private Map<String, List<String>> filters;

    public ElementInnerTextTemplate(String content, String innerText, Map<String, List<String>> filters) {
        this.template = "";
        this.content = content;
        this.innerText = innerText;
        this.filters = filters;
    }

    public void generateTemplate() {
        StringBuilder elementID = new StringBuilder(this.elementID);
        elementID.deleteCharAt(0);
        elementID.deleteCharAt(elementID.length() - 1);

        String functionName = "element" + elementID + "InnerText";

        StringBuilder content = new StringBuilder(this.content);
        content.deleteCharAt(0);
        content.deleteCharAt(0);
        content.deleteCharAt(content.length() - 1);
        content.deleteCharAt(content.length() - 1);

        this.template += "\t\t\telement = document.getElementById(" + this.elementID + ")\n";
        this.template += "\t\t\tallElement.push({";
        this.template += " originalText: element.innerText, " +
                "id: " + this.elementID + "})\n";

        this.template += "\t\t\tvar " + functionName + " = function() {\n";
        this.template += "\t\t\t\telement = document.getElementById(" + this.elementID + ")\n";
        this.template += "\t\t\t\tif(element) {\n";
        this.template += "\t\t\t\t\tvar value = " + content + "\n";

        if(this.filters.size() != 0) {
            for (Map.Entry<String, List<String>> entry : filters.entrySet()) {
                String filterName = entry.getKey();
                List<String> filterArguments = entry.getValue();

                if(filterName.equals("lower"))
                    this.template += "\t\t\t\t\tvalue = lower(value);\n";

                else if(filterName.equals("upper"))
                    this.template += "\t\t\t\t\tvalue = upper(value);\n";

                else if(filterName.equals("currency")) {
                    this.template += "\t\t\t\t\tlet arg = " + filterArguments.get(0) + ";\n";
                    this.template += "\t\t\t\t\tvalue = currency(value, arg);\n";
                }
                else {
                    String filterFunction = filterName + "(";
                    for(int i = 0; i < filterArguments.size(); i++)
                        filterFunction += filterArguments.get(i) + ((i != filterArguments.size() - 1) ? ", " : "");
                    filterFunction += ", value)";

                    this.template += "\t\t\t\t\tvalue = " + filterFunction + ";\n\n";
                }
            }
        }

        this.template += "\t\t\t\t\tdefaultText = allElement.find(el => el.id == "
                + this.elementID + ").originalText\n";

        this.template += "\t\t\t\t\tdefaultText = defaultText.replace(" + "\""
                + this.innerText + "\"" + ", value)\n";

        this.template += "\t\t\t\t\telement.innerText = defaultText\n";
        this.template += "\t\t\t\t}\n\n";

        this.template += "\t\t\t\tfunction lower(text) { return text.toLowerCase(); };\n";
        this.template += "\t\t\t\tfunction upper(text) { return text.toUpperCase(); };\n";
        this.template += "\t\t\t\tfunction currency(text, currencyArg) { return currencyArg + text; };\n";

        this.template += "\t\t\t}\n\n";

        this.template += "\t\t\trenders.push(" + functionName + ")\n\n";
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
