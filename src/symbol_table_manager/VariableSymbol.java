package symbol_table_manager;

/**
 * this class is for member access expressions(ex: x.y.z()); basically an object
 */

public class VariableSymbol extends SymbolTable implements Symbol {
    public VariableSymbol(String name, Scope enclosingScope) {
        super(name, enclosingScope);
    }

    @Override
    public void define(Symbol symbol) {
       this.insert(symbol);
       this.addEnclosedScope((Scope)symbol);
    }

    public void handleNewPropertyDefinition(int treeLevelsCount) {
        // treeLevelsCount = # of expression members - 1
        // if the expression consists of only 1 member,
        // then there are no properties to handle
        // and the method does not make sense anymore and so, return
        if(this.accessedPropertiesNotFound(treeLevelsCount))
            return;

        // give me the first member(node) of the expression(linked list tree) from the left
        Scope outerObject = this.getOuterObject(treeLevelsCount);
        // give me the outerObject parent
        Scope outerObjectParent = outerObject.getEnclosingScope();

        // look for the new property(that may be a complex property(object))
        // that's been defined as a child of its
        // fake(copy) parent in the linked list tree and define it as a child of its
        // original parent in the scope tree
        this.findFirstNewlyDefinedProperty(outerObject, outerObjectParent);
    }

    private boolean accessedPropertiesNotFound(int accessedPropertyCount) {
        // ex: x, there are no properties accessed in the expression (x) to be defined
        return (accessedPropertyCount == 0);
    }

    private Scope getOuterObject(int treeLevelsCount) {
        // this points to the deepest property accessed
        // ex: (x.y.z.s)
        // this -> s
        // outerObject -> x (after the loop executes)
        // treeLevelsCount = # of expression members(4) - 1 = 3
        Scope outerObject = this;
        for(int i = 0; i < treeLevelsCount; i++)
            outerObject = outerObject.getEnclosingScope();

        return outerObject;
    }

    private void findFirstNewlyDefinedProperty(Scope outerObject, Scope outerObjectParent) {
        Symbol scopeTreeSymbol = outerObjectParent.resolve(((VariableSymbol)outerObject).getName());

        // if the current outerObject is defined, we need to see its properties
        // (descend recursively through the linked list tree)
        // to see if there is any new properties that are not defined in the scope tree yet
        if(alreadyDefinedProperty(scopeTreeSymbol)) {

            // having the 2 pointers pointing to the same node
            // means the scopeTreeSymbol has been defined recently
            if(scopeTreeSymbol == outerObject)
                return;

            // avoiding the NullPointerException if the current outerObject is
            // the last member in the expression
            if(outerObject.hasEnclosedScopes()) {
                // give me the original parent that is defined in the scope tree
                outerObjectParent = (Scope)scopeTreeSymbol;
                // give me the outerObject only child (member access expression trees are linked lists)
                outerObject = outerObject.getEnclosedScopes().get(0);
                // try to find the newly defined property after descending one level in the 2 trees
                this.findFirstNewlyDefinedProperty(outerObject, outerObjectParent);
            }
        }

        // this is the case of newlyDefinedProperty
        // now we have found the new member(the difference between the outerObjectParent
        // children and the outerObject children) and we're gonna add it to the scope tree
        else {
            this.addPropertyToObject(outerObject, outerObjectParent);
            this.setOuterObjectOriginalEnclosingScope(outerObject, outerObjectParent);
        }
    }

    private boolean alreadyDefinedProperty(Symbol property) {
        return (property != null);
    }

    private void addPropertyToObject(Scope property, Scope object) {
        object.addEnclosedScope(property);
        ((SymbolTable)object).insert((Symbol)property);
    }

    private void setOuterObjectOriginalEnclosingScope(Scope outerObject,
                                                      Scope outerObjectOriginalEnclosingScope) {
        outerObject.setEnclosingScope(outerObjectOriginalEnclosingScope);
    }

    @Override
    public Symbol resolve(String symbolName) {
        return this.symbols.get(symbolName);
    }

    @Override
    public String getTextRepresentation(int indentCount) {
        String textRepresentation = this.getName();
        textRepresentation += super.getTextRepresentation(indentCount + 1);
        return textRepresentation;
    }
}
