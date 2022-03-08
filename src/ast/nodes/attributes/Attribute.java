package ast.nodes.attributes;

import ast.nodes.Token;
import ast.nodes.expressions.Expression;
import ast.nodes.expressions.StringLiteral;
import symbol_table_manager.Scope;

/**
 * Every attribute whether it's built-in HTML
 * or a directive has a key and a value
 */

public class Attribute extends Token {
    private String key;
    private Expression value;
    // this field indicates whether the attribute constitutes a scope or not
    // HTML attributes & non-structural directives do not, structural directives do
    private boolean structural;
    private Scope constitutedScope;

    public Attribute(String key, Expression value, boolean structural) {
        this.key = key;
        this.value = value;
        this.structural = structural;
    }

    public String toString() {
        boolean valueIsStringLiteral = (this.value instanceof StringLiteral);
        String textRepresentation = this.key;
        if(this.value != null) {
            textRepresentation += "=" + (!valueIsStringLiteral ? "\"" : "")
                    + this.value + ((!valueIsStringLiteral) ? "\"" : "");
        }
        return textRepresentation;
    }

    public void setConstitutedScope(Scope constitutedScope) {
        this.constitutedScope = constitutedScope;
    }

    public String getKey() {
        return this.key;
    }

    public Expression getValue() {
        return this.value;
    }

    public boolean isStructural() {
        return this.structural;
    }

    public Scope getConstitutedScope() {
        return this.constitutedScope;
    }
}
