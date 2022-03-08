package symbol_table_manager;

import java.util.*;

/**
 * all of the program entities that constitute a scope handle most of the scope
 * functionalities the same way, these entities will extend this class
 */

public class SymbolTable implements Scope {
    protected String name;
    protected Scope enclosingScope;
    protected List<Scope> enclosedScopes;
    protected Map<String, Symbol> symbols;

    public SymbolTable(String name, Scope enclosingScope) {
        this.name = name;
        this.enclosingScope = enclosingScope;
        this.enclosedScopes = new ArrayList<>();
        this.symbols = new HashMap<>();
    }

    @Override
    public void define(Symbol symbol) {
        if(this.symbolInSemanticContext(symbol))
            return;
        this.insert(symbol);
        this.addEnclosedScope((Scope)symbol);
    }

    public boolean symbolInSemanticContext(Symbol symbol) {
        return (this.resolve(symbol.getName()) != null);
    }

    public Symbol resolve(String symbolName) {
        if(this.symbols.containsKey(symbolName))
            return this.symbols.get(symbolName);

        if(this.enclosingScope != null)
            return this.enclosingScope.resolve(symbolName);

        return null;
    }

    @Override
    public boolean symbolDefinedInScope(String symbolName) {
        return this.symbols.containsKey(symbolName);
    }

    protected void insert(Symbol symbol) {
        this.symbols.put(symbol.getName(), symbol);
    }

    @Override
    public boolean hasEnclosedScopes() {
        return (this.enclosedScopes.size() != 0);
    }

    @Override
    public void addEnclosedScope(Scope enclosedScope) {
        this.enclosedScopes.add(enclosedScope);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Scope getEnclosingScope() {
        return this.enclosingScope;
    }

    @Override
    public List<Scope> getEnclosedScopes() {
        return this.enclosedScopes;
    }

    @Override
    public Map<String, Symbol> getSymbols() {
        return this.symbols;
    }

    @Override
    public String getTextRepresentation(int indentCount) {
        String textRepresentation = "";

        if(!(this instanceof VariableSymbol))
            textRepresentation += this.getName();

        if(this.enclosedScopes.size() == 0 && this instanceof VariableSymbol) {
            return "\n";
        }

        if(this instanceof VariableSymbol && this.getSymbols().size() != 0)
            textRepresentation += " properties";

        textRepresentation += " {\n";
        textRepresentation += this.getIndent(indentCount);

        for(int i = 0; i < this.enclosedScopes.size(); i++) {
            textRepresentation +=
                    this.enclosedScopes.get(i).getTextRepresentation(indentCount + 1)
             + ((i == this.enclosedScopes.size() - 1)? "" : this.getIndent(indentCount));
        }

        textRepresentation += this.getIndent(indentCount - 1);
        textRepresentation += "}\n";

        return textRepresentation;
    }

    private String getIndent(int indentCount) {
        String indent = "";
        for(int i = 0; i < indentCount; i++)
            indent += "\t";
        return indent;
    }

    @Override
    public void setEnclosingScope(Scope enclosingScope) {
        this.enclosingScope = enclosingScope;
    }
}
