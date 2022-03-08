package semantic_analyzer;

import ast.nodes.Document;
import ast.nodes.elements.HTMLElement;

public class ASTValidator implements Validator {
    private Document AST;
    private Validator topLevelElementValidator;

    public ASTValidator(Document AST) {
        this.AST = AST;
    }

    @Override
    public void validate() {
        for(int i = 0; i < this.AST.getElements().size(); i++) {
            HTMLElement element = (HTMLElement)this.AST.getElements().get(i);
            this.topLevelElementValidator =
                    new ElementValidator(element, "", i == 0);
            this.topLevelElementValidator.validate();
        }
    }
}
