package symbol_table_manager;

import java.util.List;
import java.util.Map;

/**
 * Every program entity that plays the role of a scope
 * implements this interface
 */

public interface Scope extends Entity {
    // Every scope knows its enclosing scope
    Scope getEnclosingScope();

    // Every scope knows its enclosing scope
    void setEnclosingScope(Scope enclosingScope);

    // Every scope knows its enclosed scopes
    List<Scope> getEnclosedScopes();

    // Every scope knows its symbols
    Map<String, Symbol> getSymbols();

    // Every scope knows if it has any enclosed scopes
    boolean hasEnclosedScopes();

    // Every scope can add an enclosed scope in its boundaries (nesting concept)
    void addEnclosedScope(Scope enclosedScope);

    // Every scope can define symbols in its boundaries
    void define(Symbol symbol);

    // Every scope can resolve the scope of its symbols(where they've been defined in the semantic context)
    Symbol resolve(String symbolName);

    // Every scope knows whether a given symbol is defined in it or not
    boolean symbolDefinedInScope(String symbolName);

    // Every scope has a textual representation
    String getTextRepresentation(int indentCount);
}
