import ast.nodes.Document;
import ast.visitor.ASTBuilder;
import code_generation.*;
import gen.HTMLLexer;
import gen.HTMLParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import semantic_analyzer.ASTValidator;
import symbol_table_manager.Scope;
import symbol_table_manager.SymbolTable;
import java.io.*;
import java.util.List;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) {
        try {
            String source = "input_samples//MySamples.txt";
            CharStream cs = fromFileName(source);
            HTMLLexer lexer = new HTMLLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            HTMLParser parser = new HTMLParser(token);
            ParseTree CSTTree = parser.document();

            Scope currentScope = new SymbolTable("Global", null);

            Document ASTTree = (Document)new ASTBuilder(currentScope).visit(CSTTree);

            System.out.println("Abstract Syntax Tree:");
            System.out.println(ASTTree.toString(0));

            System.out.println("Symbol Table:");
            System.out.println(currentScope.getTextRepresentation(1));

            System.out.println("Semantic Errors:");
            new ASTValidator(ASTTree).validate();

            TemplatesArgumentsExtractor extractor = new TemplatesArgumentsExtractor(ASTTree, currentScope);
            extractor.traverseTopLevelElements();
            List<Template> templates = extractor.getTemplates();

            new CodeGenerator(ASTTree.toString(0), templates,
                    "C:\\Users\\Raghad\\Desktop\\Compiler\\html-compiler\\code_generation_output\\index.html").generateCode();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

