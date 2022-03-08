package code_generation;

import java.io.FileWriter;
import java.io.Writer;
import java.util.List;

public class CodeGenerator {
    private String HTML;
    private List<Template> JS;
    private String generatedFilePath;

    public CodeGenerator(String HTML, List<Template> JS, String generatedFilePath) {
        this.HTML = HTML;
        this.JS = JS;
        this.generatedFilePath = generatedFilePath;
    }

    public void generateCode() {
        try {
            Writer writer = new FileWriter(this.generatedFilePath);

            StringBuilder sourceCode = new StringBuilder(this.HTML);
            int scriptIndex = sourceCode.lastIndexOf("</script>");

            String script = "\n\t\t<script>\n";

            script += "\t\t\tchanges = [];\n";
            script += "\t\t\trenders = [];\n";
            script += "\t\t\tcopiedElements = [];\n";
            script += "\t\t\tallCpIfStatements = [];\n";
            script += "\t\t\tallSwitchStatements = [];\n";
            script += "\t\t\tallElement = [];\n";
            script += "\t\t\tlet isFound;\n";
            script += "\t\t\tlet element;\n\n";

            for(Template template: this.JS)
                script += template;

            script += "\t\t\tfunction render() {\n" +
                    "\t\t\t\tsetInterval(() => {\n" +
                    "\t\t\t\t\tfor(let i = 0; i < copiedElements.length; i++)\n" +
                    "\t\t\t\t\t\tcopiedElements[i].remove();\n\n" +
                    "\t\t\t\t\tfor(var i = 0; i < changes.length; i++) {\n" +
                    "\t\t\t\t\t\tchanges[i]();\n" +
                    "\t\t\t\t\t}\n\n" +
                    "\t\t\t\t\tchanges = [];\n\n" +
                    "\t\t\t\t\tfor(var i = 0; i < renders.length; i++) {\n" +
                    "\t\t\t\t\t\trenders[i]();\n" +
                    "\t\t\t\t\t}\n" +
                    "\t\t\t\t}, 1000);\n" +
                    "\t\t\t};\n\n" +
                    "\t\t\trender();\n";

            script += "\t\t</script>\n";

            sourceCode.insert(scriptIndex + 10, script);

            writer.write(sourceCode.toString());
            writer.close();
        }
        catch(Exception e) {}
    }
}
