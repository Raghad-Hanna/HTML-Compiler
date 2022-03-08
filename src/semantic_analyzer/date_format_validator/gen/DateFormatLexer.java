// Generated from C:/Users/Raghad/Desktop/Compiler/html-compiler/src/semantic_analyzer/date_format_validator\DateFormatLexer.g4 by ANTLR 4.8
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DateFormatLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SECOND=1, MINUTE=2, HOUR=3, TWO_DIGIT_DAY=4, DAY=5, TWO_DIGIT_MONTH=6, 
		MONTH=7, TWO_DIGIT_YEAR=8, FOUR_DIGIT_YEAR=9, COLON_SEPARATOR=10, SLASH_SEPARATOR=11, 
		DASH_SEPARATOR=12, SEA_WHITESPACE=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SECOND", "MINUTE", "HOUR", "TWO_DIGIT_DAY", "DAY", "TWO_DIGIT_MONTH", 
			"MONTH", "TWO_DIGIT_YEAR", "FOUR_DIGIT_YEAR", "COLON_SEPARATOR", "SLASH_SEPARATOR", 
			"DASH_SEPARATOR", "SEA_WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "':'", "'/'", 
			"'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SECOND", "MINUTE", "HOUR", "TWO_DIGIT_DAY", "DAY", "TWO_DIGIT_MONTH", 
			"MONTH", "TWO_DIGIT_YEAR", "FOUR_DIGIT_YEAR", "COLON_SEPARATOR", "SLASH_SEPARATOR", 
			"DASH_SEPARATOR", "SEA_WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public DateFormatLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DateFormatLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17]\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\5\5(\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\60\n\6\3\7\3\7\3\7\3\7\5\7\66\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bB\n\b\3\t\3\t\3\t\3\t\5"+
		"\tH\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nR\n\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\3\2\6\4\2UUuu\4\2OOoo\4\2JJjj\5\2\13\f\17\17"+
		"\"\"\2b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7!\3\2\2\2"+
		"\t\'\3\2\2\2\13/\3\2\2\2\r\65\3\2\2\2\17A\3\2\2\2\21G\3\2\2\2\23Q\3\2"+
		"\2\2\25S\3\2\2\2\27U\3\2\2\2\31W\3\2\2\2\33Y\3\2\2\2\35\36\t\2\2\2\36"+
		"\4\3\2\2\2\37 \t\3\2\2 \6\3\2\2\2!\"\t\4\2\2\"\b\3\2\2\2#$\7f\2\2$(\7"+
		"f\2\2%&\7F\2\2&(\7F\2\2\'#\3\2\2\2\'%\3\2\2\2(\n\3\2\2\2)*\7f\2\2*+\7"+
		"c\2\2+\60\7{\2\2,-\7F\2\2-.\7C\2\2.\60\7[\2\2/)\3\2\2\2/,\3\2\2\2\60\f"+
		"\3\2\2\2\61\62\7o\2\2\62\66\7o\2\2\63\64\7O\2\2\64\66\7O\2\2\65\61\3\2"+
		"\2\2\65\63\3\2\2\2\66\16\3\2\2\2\678\7o\2\289\7q\2\29:\7p\2\2:;\7v\2\2"+
		";B\7j\2\2<=\7O\2\2=>\7Q\2\2>?\7P\2\2?@\7V\2\2@B\7J\2\2A\67\3\2\2\2A<\3"+
		"\2\2\2B\20\3\2\2\2CD\7{\2\2DH\7{\2\2EF\7[\2\2FH\7[\2\2GC\3\2\2\2GE\3\2"+
		"\2\2H\22\3\2\2\2IJ\7{\2\2JK\7{\2\2KL\7{\2\2LR\7{\2\2MN\7[\2\2NO\7[\2\2"+
		"OP\7[\2\2PR\7[\2\2QI\3\2\2\2QM\3\2\2\2R\24\3\2\2\2ST\7<\2\2T\26\3\2\2"+
		"\2UV\7\61\2\2V\30\3\2\2\2WX\7/\2\2X\32\3\2\2\2YZ\t\5\2\2Z[\3\2\2\2[\\"+
		"\b\16\2\2\\\34\3\2\2\2\t\2\'/\65AGQ\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}