package semantic_analyzer;

public interface Validator {
    void validate();
    default void printErrorMessage(int line, int column, String errorMessage) {
        System.err.println("<" + line + ", " + column + ">" + " " + errorMessage);
    }
}
