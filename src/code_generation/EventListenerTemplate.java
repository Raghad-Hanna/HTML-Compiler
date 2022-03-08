package code_generation;

public class EventListenerTemplate implements Template {
    private String template;
    private String elementID;
    private String actionToBeExecuted;
    private String eventListenerType;

    public EventListenerTemplate(String actionToBeExecuted, String eventListenerType) {
        this.template = "";
        this.actionToBeExecuted = actionToBeExecuted;
        this.eventListenerType = eventListenerType;
    }

    @Override
    public void generateTemplate() {
        StringBuilder eventListenerType = new StringBuilder(this.eventListenerType);
        eventListenerType.deleteCharAt(0);

        this.template += "\t\t\telement = document.getElementById(" + this.elementID
                + ");\n";

        this.template += "\t\t\telement.addEventListener(\"" + eventListenerType + "\", () => "
                + this.actionToBeExecuted + ");\n\n";
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
