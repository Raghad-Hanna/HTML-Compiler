package code_generation;

/**
 * There is a template(JS code) for every HTML directive that provides its functionality
 */

public interface Template {
    // Every directive is applied to a specific element, ans so
    // every template knows that element ID to work properly
    void setElementID(String elementID);

    // Every template knows how to generate itself(putting the static JS code and its needed variants together)
    void generateTemplate();
}
