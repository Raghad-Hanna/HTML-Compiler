package semantic_analyzer;

import ast.nodes.contents.Filter;
import ast.nodes.expressions.Expression;
import ast.nodes.expressions.Identifier;
import ast.nodes.expressions.StringLiteral;
import gen.DateFormatLexer;
import gen.DateFormatParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import semantic_analyzer.date_format_validator.InvalidDateFormatErrorListener;
import java.util.List;

public class FilterValidator implements Validator {
    private List<Filter> filters;

    public FilterValidator(List<Filter> filters) {
        this.filters = filters;
    }

    @Override
    public void validate() {
        for(Filter filter: this.filters)
            this.validateFilter(filter);
    }

    private void validateFilter(Filter filter) {
        Identifier identifier = (Identifier)filter.getName().getMembers().get(0);

        switch(identifier.getSymbolName().toLowerCase()) {
            case "uppercase":
            case "lowercase":
                this.validateCase(filter);
                break;
            case "currency":
                this.validateCurrency(filter);
                break;
            case "date":
                this.validateDate(filter);
                break;
        }
    }

    private void validateCase(Filter stringLiteralCase) {
        Identifier identifier = (Identifier)stringLiteralCase.getName().getMembers().get(0);

        this.validateFilterArgumentsCount(identifier,
                0, stringLiteralCase.getArguments().size());
    }

    private void validateCurrency(Filter currency) {
        this.validateFilterArgumentsCount((Identifier)currency.getName().getMembers().get(0),
                1, currency.getArguments().size());

        if(currency.getArguments().size() != 0)
            this.validateCurrencyArgumentLength(currency.getArguments().get(0));
    }

    private void validateCurrencyArgumentLength(Expression argument) {
        if(!this.stringLiteralArgument(argument))
            return;
        StringLiteral stringArgument = (StringLiteral)argument;

        if(!this.assertArgumentLength(stringArgument.getText(), 3)) {
            this.printErrorMessage(stringArgument.getLine(), stringArgument.getColumn(),
                    "currency Filter Must Be Passed A 1 Character String Literal Argument Long");
        }
    }

    private boolean assertArgumentLength(String argument, int expectedLength) {
        return (argument.length() == expectedLength);
    }

    private void validateDate(Filter date) {
        this.validateFilterArgumentsCount((Identifier)date.getName().getMembers().get(0),
                1, date.getArguments().size());

        if(date.getArguments().size() != 0)
            this.validateDateArgumentFormat(date.getArguments().get(0));
    }

    private void validateDateArgumentFormat(Expression argument) {
        if(!this.stringLiteralArgument(argument))
            return;

        StringLiteral stringArgument = (StringLiteral)argument;
        String dateFormat = stringArgument.getText();

        CharStream cs = CharStreams.fromString(dateFormat);

        InvalidDateFormatErrorListener errorListener = new InvalidDateFormatErrorListener();

        DateFormatLexer lexer = new DateFormatLexer(cs);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);

        CommonTokenStream token = new CommonTokenStream(lexer);

        DateFormatParser parser = new DateFormatParser(token);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        parser.validDateFormat();

        if(errorListener.getErrorOccurred())
            this.printErrorMessage(stringArgument.getLine(), stringArgument.getColumn(),
                    "Invalid Date Format");
    }

    private void validateFilterArgumentsCount(Identifier filterName, int expectedArgumentsCount,
                                              int actualArgumentsCount) {
        if(actualArgumentsCount != expectedArgumentsCount)
            this.printErrorMessage(filterName.getLine(), filterName.getColumn(),
                    filterName.getSymbolName() + " Filter Argument Count, Expected: "
                            + expectedArgumentsCount + ", Found: " + actualArgumentsCount);
    }

    private boolean stringLiteralArgument(Expression argument) {
        return (argument instanceof StringLiteral);
    }
}
