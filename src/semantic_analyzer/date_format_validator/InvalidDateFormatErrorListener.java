package semantic_analyzer.date_format_validator;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class InvalidDateFormatErrorListener extends BaseErrorListener {
    private boolean errorOccurred = false;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        this.errorOccurred = true;
    }

    public boolean getErrorOccurred() {
        return this.errorOccurred;
    }
}
