// Generated from C:/Users/Raghad/Desktop/Compiler/html-compiler/out/production/Compiler-project\HTMLLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, CONDITIONAL_COMMENT=2, XML=3, CDATA=4, DTD=5, SCRIPTLET=6, 
		SEA_WHITESPACE=7, SEA_TEXT=8, SEA_OPENING_CURLY_BRACE=9, SCRIPT_START_TAG=10, 
		STYLE_START_TAG=11, OPENING_TAG=12, DOUBLE_OPENING_CURLY_BRACES=13, SCRIPT_BODY=14, 
		SCRIPT_SHORT_BODY=15, STYLE_BODY=16, STYLE_SHORT_BODY=17, CP_APP=18, CP_SHOW=19, 
		CP_HIDE=20, CP_IF=21, EVENT_LISTENER=22, CP_MODEL=23, CP_FOR=24, CP_SWITCH=25, 
		CP_SWITCH_CASE=26, CP_SWITCH_DEFAULT=27, COMPONENT_NAME=28, HTML_ATTRIBUTE_EQUALS=29, 
		TAG_WHITESPACE=30, TAG_SLASH=31, CLOSING_TAG=32, DIRECTIVE_EQUALS=33, 
		TRANSITION_WHITESPACE=34, OPENING_DOUBLE_QUOTES=35, DOT=36, COMMA=37, 
		COLON=38, SEMICOLON=39, OPENING_PARENTHESES=40, CLOSING_PARENTHESES=41, 
		OPENING_BRACKET=42, CLOSING_BRACKET=43, OPENING_BRACE=44, CLOSING_BRACE=45, 
		QUESTION_MARK=46, PIPE=47, ASSIGNMENT=48, IN=49, TRUE=50, FALSE=51, INDEX=52, 
		AND=53, OR=54, XOR=55, NOT=56, PLUS=57, MINUS=58, MULTIPLICATION=59, DIVISION=60, 
		MODULUS=61, GREATER=62, SMALLER=63, GREATER_EQUALS=64, SMALLER_EQUALS=65, 
		EQUALITY=66, STRICT_EQUALITY=67, INEQUALITY=68, STRICT_INEQUALITY=69, 
		IDENTIFIER=70, NUMBER=71, STRING_LITERAL=72, IN_EXPRESSION_WHITESPACE=73, 
		CLOSING_DOUBLE_QUOTES=74, DOUBLE_CLOSING_CURLY_BRACES=75, ATTRIBUTE_VALUE=76, 
		VALUE=77;
	public static final int
		SCRIPT=1, STYLE=2, TAG=3, TRANSITION=4, EXPRESSION=5, HTML_ATTRIBUTE_VALUE=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "SCRIPT", "STYLE", "TAG", "TRANSITION", "EXPRESSION", 
		"HTML_ATTRIBUTE_VALUE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "CONDITIONAL_COMMENT", "XML", "CDATA", "DTD", "SCRIPTLET", 
			"SEA_WHITESPACE", "SEA_TEXT", "SEA_OPENING_CURLY_BRACE", "SCRIPT_START_TAG", 
			"STYLE_START_TAG", "OPENING_TAG", "DOUBLE_OPENING_CURLY_BRACES", "SCRIPT_BODY", 
			"SCRIPT_SHORT_BODY", "STYLE_BODY", "STYLE_SHORT_BODY", "CP_APP", "CP_SHOW", 
			"CP_HIDE", "CP_IF", "EVENT_LISTENER", "CP_MODEL", "CP_FOR", "CP_SWITCH", 
			"CP_SWITCH_CASE", "CP_SWITCH_DEFAULT", "COMPONENT_NAME", "HTML_ATTRIBUTE_EQUALS", 
			"TAG_WHITESPACE", "TAG_SLASH", "CLOSING_TAG", "COMPONENT_CHAR", "DIGIT", 
			"HEXDIGIT", "COMPONENT_FIRST_CHAR", "DIRECTIVE_EQUALS", "TRANSITION_WHITESPACE", 
			"OPENING_DOUBLE_QUOTES", "DOT", "COMMA", "COLON", "SEMICOLON", "OPENING_PARENTHESES", 
			"CLOSING_PARENTHESES", "OPENING_BRACKET", "CLOSING_BRACKET", "OPENING_BRACE", 
			"CLOSING_BRACE", "QUESTION_MARK", "PIPE", "ASSIGNMENT", "IN", "TRUE", 
			"FALSE", "INDEX", "AND", "OR", "XOR", "NOT", "PLUS", "MINUS", "MULTIPLICATION", 
			"DIVISION", "MODULUS", "GREATER", "SMALLER", "GREATER_EQUALS", "SMALLER_EQUALS", 
			"EQUALITY", "STRICT_EQUALITY", "INEQUALITY", "STRICT_INEQUALITY", "IDENTIFIER", 
			"NUMBER", "STRING_LITERAL", "IN_EXPRESSION_WHITESPACE", "CLOSING_DOUBLE_QUOTES", 
			"DOUBLE_CLOSING_CURLY_BRACES", "ESCAPE", "ID_CHAR", "ID_FIRST_CHAR", 
			"ATTRIBUTE_VALUE", "VALUE", "DOUBLE_QUOTE_STRING", "SINGLE_QUOTE_STRING", 
			"ATTCHARS", "ATTCHAR", "HEXCHARS", "DECCHARS", "CHARCACTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'{{'", null, null, null, null, "'cp-app'", "'cp-show'", "'cp-hide'", 
			"'cp-if'", null, "'cp-model'", "'cp-for'", "'cp-switch'", "'cp-switch-case'", 
			"'cp-switch-default'", null, null, null, null, null, null, null, null, 
			"'.'", "','", "':'", "';'", "'('", "')'", "'['", "']'", null, "'}'", 
			"'?'", "'|'", null, "'in'", "'true'", "'false'", "'index'", null, null, 
			null, null, "'+'", "'-'", "'*'", null, "'%'", null, null, "'>='", "'<='", 
			"'=='", "'==='", "'!='", "'!=='", null, null, null, null, null, "'}}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "CONDITIONAL_COMMENT", "XML", "CDATA", "DTD", "SCRIPTLET", 
			"SEA_WHITESPACE", "SEA_TEXT", "SEA_OPENING_CURLY_BRACE", "SCRIPT_START_TAG", 
			"STYLE_START_TAG", "OPENING_TAG", "DOUBLE_OPENING_CURLY_BRACES", "SCRIPT_BODY", 
			"SCRIPT_SHORT_BODY", "STYLE_BODY", "STYLE_SHORT_BODY", "CP_APP", "CP_SHOW", 
			"CP_HIDE", "CP_IF", "EVENT_LISTENER", "CP_MODEL", "CP_FOR", "CP_SWITCH", 
			"CP_SWITCH_CASE", "CP_SWITCH_DEFAULT", "COMPONENT_NAME", "HTML_ATTRIBUTE_EQUALS", 
			"TAG_WHITESPACE", "TAG_SLASH", "CLOSING_TAG", "DIRECTIVE_EQUALS", "TRANSITION_WHITESPACE", 
			"OPENING_DOUBLE_QUOTES", "DOT", "COMMA", "COLON", "SEMICOLON", "OPENING_PARENTHESES", 
			"CLOSING_PARENTHESES", "OPENING_BRACKET", "CLOSING_BRACKET", "OPENING_BRACE", 
			"CLOSING_BRACE", "QUESTION_MARK", "PIPE", "ASSIGNMENT", "IN", "TRUE", 
			"FALSE", "INDEX", "AND", "OR", "XOR", "NOT", "PLUS", "MINUS", "MULTIPLICATION", 
			"DIVISION", "MODULUS", "GREATER", "SMALLER", "GREATER_EQUALS", "SMALLER_EQUALS", 
			"EQUALITY", "STRICT_EQUALITY", "INEQUALITY", "STRICT_INEQUALITY", "IDENTIFIER", 
			"NUMBER", "STRING_LITERAL", "IN_EXPRESSION_WHITESPACE", "CLOSING_DOUBLE_QUOTES", 
			"DOUBLE_CLOSING_CURLY_BRACES", "ATTRIBUTE_VALUE", "VALUE"
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


	public HTMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HTMLLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2O\u0360\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\t"+
		"E\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4"+
		"Q\tQ\4R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t"+
		"\\\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u00c6\n\2\f\2\16\2\u00c9\13\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3\u00d6\n\3\f\3\16\3\u00d9\13\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00e7\n\4\f\4\16\4"+
		"\u00ea\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00f9"+
		"\n\5\f\5\16\5\u00fc\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u0106\n\6"+
		"\f\6\16\6\u0109\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u0111\n\7\f\7\16\7\u0114"+
		"\13\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u011c\n\7\f\7\16\7\u011f\13\7\3\7\3"+
		"\7\5\7\u0123\n\7\3\b\3\b\3\b\3\b\3\t\6\t\u012a\n\t\r\t\16\t\u012b\3\t"+
		"\5\t\u012f\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7"+
		"\13\u013c\n\13\f\13\16\13\u013f\13\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u014d\n\f\f\f\16\f\u0150\13\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\7\17\u0160\n\17\f\17\16"+
		"\17\u0163\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\7\20\u0172\n\20\f\20\16\20\u0175\13\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\7\21\u017e\n\21\f\21\16\21\u0181\13\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\7\22\u018f\n\22\f\22\16"+
		"\22\u0192\13\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u01f8\n\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\7\35\u0241\n\35\f\35\16"+
		"\35\u0244\13\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\5\"\u0258\n\"\3#\3#\3$\3$\3%\5%\u025f\n%\3&\3&\3"+
		"\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3"+
		"\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3"+
		"\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39\39\39\39\39\3:\3"+
		":\3:\3:\3:\3:\3:\3:\5:\u02a1\n:\3;\3;\3;\3;\3;\3;\5;\u02a9\n;\3<\3<\3"+
		"<\3<\3<\3<\3<\5<\u02b2\n<\3=\3=\3=\3=\3=\3=\3=\5=\u02bb\n=\3>\3>\3?\3"+
		"?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3"+
		"H\3I\3I\3I\3J\3J\3J\3J\3K\3K\7K\u02e1\nK\fK\16K\u02e4\13K\3L\6L\u02e7"+
		"\nL\rL\16L\u02e8\3L\3L\6L\u02ed\nL\rL\16L\u02ee\5L\u02f1\nL\3M\3M\3M\7"+
		"M\u02f6\nM\fM\16M\u02f9\13M\3M\3M\3M\3M\7M\u02ff\nM\fM\16M\u0302\13M\3"+
		"M\5M\u0305\nM\3N\3N\3N\3N\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3"+
		"Q\3Q\5Q\u031b\nQ\3R\3R\5R\u031f\nR\3S\3S\3T\7T\u0324\nT\fT\16T\u0327\13"+
		"T\3T\3T\3T\3T\3U\3U\3U\3U\3U\5U\u0332\nU\3V\3V\7V\u0336\nV\fV\16V\u0339"+
		"\13V\3V\3V\3W\3W\7W\u033f\nW\fW\16W\u0342\13W\3W\3W\3X\6X\u0347\nX\rX"+
		"\16X\u0348\3X\5X\u034c\nX\3Y\5Y\u034f\nY\3Z\3Z\6Z\u0353\nZ\rZ\16Z\u0354"+
		"\3[\6[\u0358\n[\r[\16[\u0359\3[\5[\u035d\n[\3\\\3\\\21\u00c7\u00d7\u00e8"+
		"\u00fa\u0107\u0112\u011d\u013d\u014e\u0161\u0173\u017f\u0190\u02f7\u0300"+
		"\2]\t\3\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20"+
		"%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67\329\33;\34=\35?\36A\37"+
		"C E!G\"I\2K\2M\2O\2Q#S$U%W&Y\'[(])_*a+c,e-g.i/k\60m\61o\62q\63s\64u\65"+
		"w\66y\67{8}9\177:\u0081;\u0083<\u0085=\u0087>\u0089?\u008b@\u008dA\u008f"+
		"B\u0091C\u0093D\u0095E\u0097F\u0099G\u009bH\u009dI\u009fJ\u00a1K\u00a3"+
		"L\u00a5M\u00a7\2\u00a9\2\u00ab\2\u00adN\u00afO\u00b1\2\u00b3\2\u00b5\2"+
		"\u00b7\2\u00b9\2\u00bb\2\u00bd\2\t\2\3\4\5\6\7\b\16\5\2\13\f\17\17\"\""+
		"\7\2\13\f\17\17\"\">>}}\4\2/\60aa\5\2\u00b9\u00b9\u0302\u0371\u2041\u2042"+
		"\3\2\62;\5\2\62;CHch\n\2<<C\\c|\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902"+
		"\ufdd1\ufdf2\uffff\4\2??}}\6\2&&C\\aac|\4\2$$>>\4\2))>>\t\2%%-=??AAC\\"+
		"aac|\2\u0385\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\3%\3\2\2\2\4\'\3\2"+
		"\2\2\4)\3\2\2\2\5+\3\2\2\2\5-\3\2\2\2\5/\3\2\2\2\5\61\3\2\2\2\5\63\3\2"+
		"\2\2\5\65\3\2\2\2\5\67\3\2\2\2\59\3\2\2\2\5;\3\2\2\2\5=\3\2\2\2\5?\3\2"+
		"\2\2\5A\3\2\2\2\5C\3\2\2\2\5E\3\2\2\2\5G\3\2\2\2\6Q\3\2\2\2\6S\3\2\2\2"+
		"\6U\3\2\2\2\7W\3\2\2\2\7Y\3\2\2\2\7[\3\2\2\2\7]\3\2\2\2\7_\3\2\2\2\7a"+
		"\3\2\2\2\7c\3\2\2\2\7e\3\2\2\2\7g\3\2\2\2\7i\3\2\2\2\7k\3\2\2\2\7m\3\2"+
		"\2\2\7o\3\2\2\2\7q\3\2\2\2\7s\3\2\2\2\7u\3\2\2\2\7w\3\2\2\2\7y\3\2\2\2"+
		"\7{\3\2\2\2\7}\3\2\2\2\7\177\3\2\2\2\7\u0081\3\2\2\2\7\u0083\3\2\2\2\7"+
		"\u0085\3\2\2\2\7\u0087\3\2\2\2\7\u0089\3\2\2\2\7\u008b\3\2\2\2\7\u008d"+
		"\3\2\2\2\7\u008f\3\2\2\2\7\u0091\3\2\2\2\7\u0093\3\2\2\2\7\u0095\3\2\2"+
		"\2\7\u0097\3\2\2\2\7\u0099\3\2\2\2\7\u009b\3\2\2\2\7\u009d\3\2\2\2\7\u009f"+
		"\3\2\2\2\7\u00a1\3\2\2\2\7\u00a3\3\2\2\2\7\u00a5\3\2\2\2\b\u00ad\3\2\2"+
		"\2\b\u00af\3\2\2\2\t\u00bf\3\2\2\2\13\u00d0\3\2\2\2\r\u00df\3\2\2\2\17"+
		"\u00ed\3\2\2\2\21\u0101\3\2\2\2\23\u0122\3\2\2\2\25\u0124\3\2\2\2\27\u012e"+
		"\3\2\2\2\31\u0130\3\2\2\2\33\u0132\3\2\2\2\35\u0144\3\2\2\2\37\u0155\3"+
		"\2\2\2!\u0159\3\2\2\2#\u0161\3\2\2\2%\u0173\3\2\2\2\'\u017f\3\2\2\2)\u0190"+
		"\3\2\2\2+\u0199\3\2\2\2-\u01a2\3\2\2\2/\u01ac\3\2\2\2\61\u01b6\3\2\2\2"+
		"\63\u01f7\3\2\2\2\65\u01fb\3\2\2\2\67\u0206\3\2\2\29\u020f\3\2\2\2;\u021b"+
		"\3\2\2\2=\u022c\3\2\2\2?\u023e\3\2\2\2A\u0245\3\2\2\2C\u0249\3\2\2\2E"+
		"\u024d\3\2\2\2G\u024f\3\2\2\2I\u0257\3\2\2\2K\u0259\3\2\2\2M\u025b\3\2"+
		"\2\2O\u025e\3\2\2\2Q\u0260\3\2\2\2S\u0262\3\2\2\2U\u0266\3\2\2\2W\u026a"+
		"\3\2\2\2Y\u026c\3\2\2\2[\u026e\3\2\2\2]\u0270\3\2\2\2_\u0272\3\2\2\2a"+
		"\u0274\3\2\2\2c\u0276\3\2\2\2e\u0278\3\2\2\2g\u027a\3\2\2\2i\u027c\3\2"+
		"\2\2k\u027e\3\2\2\2m\u0280\3\2\2\2o\u0282\3\2\2\2q\u0284\3\2\2\2s\u0287"+
		"\3\2\2\2u\u028c\3\2\2\2w\u0292\3\2\2\2y\u02a0\3\2\2\2{\u02a8\3\2\2\2}"+
		"\u02b1\3\2\2\2\177\u02ba\3\2\2\2\u0081\u02bc\3\2\2\2\u0083\u02be\3\2\2"+
		"\2\u0085\u02c0\3\2\2\2\u0087\u02c2\3\2\2\2\u0089\u02c4\3\2\2\2\u008b\u02c6"+
		"\3\2\2\2\u008d\u02c8\3\2\2\2\u008f\u02ca\3\2\2\2\u0091\u02cd\3\2\2\2\u0093"+
		"\u02d0\3\2\2\2\u0095\u02d3\3\2\2\2\u0097\u02d7\3\2\2\2\u0099\u02da\3\2"+
		"\2\2\u009b\u02de\3\2\2\2\u009d\u02e6\3\2\2\2\u009f\u0304\3\2\2\2\u00a1"+
		"\u0306\3\2\2\2\u00a3\u030a\3\2\2\2\u00a5\u030f\3\2\2\2\u00a7\u031a\3\2"+
		"\2\2\u00a9\u031e\3\2\2\2\u00ab\u0320\3\2\2\2\u00ad\u0325\3\2\2\2\u00af"+
		"\u0331\3\2\2\2\u00b1\u0333\3\2\2\2\u00b3\u033c\3\2\2\2\u00b5\u0346\3\2"+
		"\2\2\u00b7\u034e\3\2\2\2\u00b9\u0350\3\2\2\2\u00bb\u0357\3\2\2\2\u00bd"+
		"\u035e\3\2\2\2\u00bf\u00c0\7>\2\2\u00c0\u00c1\7#\2\2\u00c1\u00c2\7/\2"+
		"\2\u00c2\u00c3\7/\2\2\u00c3\u00c7\3\2\2\2\u00c4\u00c6\13\2\2\2\u00c5\u00c4"+
		"\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7/\2\2\u00cb\u00cc\7/\2"+
		"\2\u00cc\u00cd\7@\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\b\2\2\2\u00cf\n"+
		"\3\2\2\2\u00d0\u00d1\7>\2\2\u00d1\u00d2\7#\2\2\u00d2\u00d3\7]\2\2\u00d3"+
		"\u00d7\3\2\2\2\u00d4\u00d6\13\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3"+
		"\2\2\2\u00d7\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00db\7_\2\2\u00db\u00dc\7@\2\2\u00dc\u00dd\3\2\2"+
		"\2\u00dd\u00de\b\3\2\2\u00de\f\3\2\2\2\u00df\u00e0\7>\2\2\u00e0\u00e1"+
		"\7A\2\2\u00e1\u00e2\7z\2\2\u00e2\u00e3\7o\2\2\u00e3\u00e4\7n\2\2\u00e4"+
		"\u00e8\3\2\2\2\u00e5\u00e7\13\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3"+
		"\2\2\2\u00e8\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00ec\7@\2\2\u00ec\16\3\2\2\2\u00ed\u00ee\7>\2\2"+
		"\u00ee\u00ef\7#\2\2\u00ef\u00f0\7]\2\2\u00f0\u00f1\7E\2\2\u00f1\u00f2"+
		"\7F\2\2\u00f2\u00f3\7C\2\2\u00f3\u00f4\7V\2\2\u00f4\u00f5\7C\2\2\u00f5"+
		"\u00f6\7]\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00f9\13\2\2\2\u00f8\u00f7\3\2"+
		"\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7_\2\2\u00fe\u00ff\7_\2"+
		"\2\u00ff\u0100\7@\2\2\u0100\20\3\2\2\2\u0101\u0102\7>\2\2\u0102\u0103"+
		"\7#\2\2\u0103\u0107\3\2\2\2\u0104\u0106\13\2\2\2\u0105\u0104\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010a\3\2"+
		"\2\2\u0109\u0107\3\2\2\2\u010a\u010b\7@\2\2\u010b\22\3\2\2\2\u010c\u010d"+
		"\7>\2\2\u010d\u010e\7A\2\2\u010e\u0112\3\2\2\2\u010f\u0111\13\2\2\2\u0110"+
		"\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0113\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7A\2\2\u0116"+
		"\u0123\7@\2\2\u0117\u0118\7>\2\2\u0118\u0119\7\'\2\2\u0119\u011d\3\2\2"+
		"\2\u011a\u011c\13\2\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u0120\u0121\7\'\2\2\u0121\u0123\7@\2\2\u0122\u010c\3\2\2\2\u0122"+
		"\u0117\3\2\2\2\u0123\24\3\2\2\2\u0124\u0125\t\2\2\2\u0125\u0126\3\2\2"+
		"\2\u0126\u0127\b\b\3\2\u0127\26\3\2\2\2\u0128\u012a\n\3\2\2\u0129\u0128"+
		"\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012f\3\2\2\2\u012d\u012f\5\31\n\2\u012e\u0129\3\2\2\2\u012e\u012d\3"+
		"\2\2\2\u012f\30\3\2\2\2\u0130\u0131\7}\2\2\u0131\32\3\2\2\2\u0132\u0133"+
		"\7>\2\2\u0133\u0134\7u\2\2\u0134\u0135\7e\2\2\u0135\u0136\7t\2\2\u0136"+
		"\u0137\7k\2\2\u0137\u0138\7r\2\2\u0138\u0139\7v\2\2\u0139\u013d\3\2\2"+
		"\2\u013a\u013c\13\2\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u0140\u0141\7@\2\2\u0141\u0142\3\2\2\2\u0142\u0143\b\13\4\2\u0143"+
		"\34\3\2\2\2\u0144\u0145\7>\2\2\u0145\u0146\7u\2\2\u0146\u0147\7v\2\2\u0147"+
		"\u0148\7{\2\2\u0148\u0149\7n\2\2\u0149\u014a\7g\2\2\u014a\u014e\3\2\2"+
		"\2\u014b\u014d\13\2\2\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2"+
		"\2\2\u0151\u0152\7@\2\2\u0152\u0153\3\2\2\2\u0153\u0154\b\f\5\2\u0154"+
		"\36\3\2\2\2\u0155\u0156\7>\2\2\u0156\u0157\3\2\2\2\u0157\u0158\b\r\6\2"+
		"\u0158 \3\2\2\2\u0159\u015a\7}\2\2\u015a\u015b\7}\2\2\u015b\u015c\3\2"+
		"\2\2\u015c\u015d\b\16\7\2\u015d\"\3\2\2\2\u015e\u0160\13\2\2\2\u015f\u015e"+
		"\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162"+
		"\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\7>\2\2\u0165\u0166\7\61"+
		"\2\2\u0166\u0167\7u\2\2\u0167\u0168\7e\2\2\u0168\u0169\7t\2\2\u0169\u016a"+
		"\7k\2\2\u016a\u016b\7r\2\2\u016b\u016c\7v\2\2\u016c\u016d\7@\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u016f\b\17\b\2\u016f$\3\2\2\2\u0170\u0172\13\2\2"+
		"\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0174\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0177\7>\2\2\u0177"+
		"\u0178\7\61\2\2\u0178\u0179\7@\2\2\u0179\u017a\3\2\2\2\u017a\u017b\b\20"+
		"\b\2\u017b&\3\2\2\2\u017c\u017e\13\2\2\2\u017d\u017c\3\2\2\2\u017e\u0181"+
		"\3\2\2\2\u017f\u0180\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0182\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0182\u0183\7>\2\2\u0183\u0184\7\61\2\2\u0184\u0185\7u"+
		"\2\2\u0185\u0186\7v\2\2\u0186\u0187\7{\2\2\u0187\u0188\7n\2\2\u0188\u0189"+
		"\7g\2\2\u0189\u018a\7@\2\2\u018a\u018b\3\2\2\2\u018b\u018c\b\21\b\2\u018c"+
		"(\3\2\2\2\u018d\u018f\13\2\2\2\u018e\u018d\3\2\2\2\u018f\u0192\3\2\2\2"+
		"\u0190\u0191\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0190"+
		"\3\2\2\2\u0193\u0194\7>\2\2\u0194\u0195\7\61\2\2\u0195\u0196\7@\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u0198\b\22\b\2\u0198*\3\2\2\2\u0199\u019a\7e\2\2"+
		"\u019a\u019b\7r\2\2\u019b\u019c\7/\2\2\u019c\u019d\7c\2\2\u019d\u019e"+
		"\7r\2\2\u019e\u019f\7r\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\b\23\t\2\u01a1"+
		",\3\2\2\2\u01a2\u01a3\7e\2\2\u01a3\u01a4\7r\2\2\u01a4\u01a5\7/\2\2\u01a5"+
		"\u01a6\7u\2\2\u01a6\u01a7\7j\2\2\u01a7\u01a8\7q\2\2\u01a8\u01a9\7y\2\2"+
		"\u01a9\u01aa\3\2\2\2\u01aa\u01ab\b\24\t\2\u01ab.\3\2\2\2\u01ac\u01ad\7"+
		"e\2\2\u01ad\u01ae\7r\2\2\u01ae\u01af\7/\2\2\u01af\u01b0\7j\2\2\u01b0\u01b1"+
		"\7k\2\2\u01b1\u01b2\7f\2\2\u01b2\u01b3\7g\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"\u01b5\b\25\t\2\u01b5\60\3\2\2\2\u01b6\u01b7\7e\2\2\u01b7\u01b8\7r\2\2"+
		"\u01b8\u01b9\7/\2\2\u01b9\u01ba\7k\2\2\u01ba\u01bb\7h\2\2\u01bb\u01bc"+
		"\3\2\2\2\u01bc\u01bd\b\26\t\2\u01bd\62\3\2\2\2\u01be\u01bf\7B\2\2\u01bf"+
		"\u01c0\7e\2\2\u01c0\u01c1\7n\2\2\u01c1\u01c2\7k\2\2\u01c2\u01c3\7e\2\2"+
		"\u01c3\u01f8\7m\2\2\u01c4\u01c5\7B\2\2\u01c5\u01c6\7e\2\2\u01c6\u01c7"+
		"\7j\2\2\u01c7\u01c8\7c\2\2\u01c8\u01c9\7p\2\2\u01c9\u01ca\7i\2\2\u01ca"+
		"\u01f8\7g\2\2\u01cb\u01cc\7B\2\2\u01cc\u01cd\7h\2\2\u01cd\u01ce\7q\2\2"+
		"\u01ce\u01cf\7e\2\2\u01cf\u01d0\7w\2\2\u01d0\u01f8\7u\2\2\u01d1\u01d2"+
		"\7B\2\2\u01d2\u01d3\7o\2\2\u01d3\u01d4\7q\2\2\u01d4\u01d5\7w\2\2\u01d5"+
		"\u01d6\7u\2\2\u01d6\u01d7\7g\2\2\u01d7\u01d8\7q\2\2\u01d8\u01d9\7x\2\2"+
		"\u01d9\u01da\7g\2\2\u01da\u01f8\7t\2\2\u01db\u01dc\7B\2\2\u01dc\u01dd"+
		"\7o\2\2\u01dd\u01de\7q\2\2\u01de\u01df\7w\2\2\u01df\u01e0\7u\2\2\u01e0"+
		"\u01e1\7g\2\2\u01e1\u01e2\7f\2\2\u01e2\u01e3\7q\2\2\u01e3\u01e4\7y\2\2"+
		"\u01e4\u01f8\7p\2\2\u01e5\u01e6\7B\2\2\u01e6\u01e7\7o\2\2\u01e7\u01e8"+
		"\7q\2\2\u01e8\u01e9\7w\2\2\u01e9\u01ea\7u\2\2\u01ea\u01eb\7g\2\2\u01eb"+
		"\u01ec\7w\2\2\u01ec\u01f8\7r\2\2\u01ed\u01ee\7B\2\2\u01ee\u01ef\7o\2\2"+
		"\u01ef\u01f0\7q\2\2\u01f0\u01f1\7w\2\2\u01f1\u01f2\7u\2\2\u01f2\u01f3"+
		"\7g\2\2\u01f3\u01f4\7o\2\2\u01f4\u01f5\7q\2\2\u01f5\u01f6\7x\2\2\u01f6"+
		"\u01f8\7g\2\2\u01f7\u01be\3\2\2\2\u01f7\u01c4\3\2\2\2\u01f7\u01cb\3\2"+
		"\2\2\u01f7\u01d1\3\2\2\2\u01f7\u01db\3\2\2\2\u01f7\u01e5\3\2\2\2\u01f7"+
		"\u01ed\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\b\27\t\2\u01fa\64\3\2\2"+
		"\2\u01fb\u01fc\7e\2\2\u01fc\u01fd\7r\2\2\u01fd\u01fe\7/\2\2\u01fe\u01ff"+
		"\7o\2\2\u01ff\u0200\7q\2\2\u0200\u0201\7f\2\2\u0201\u0202\7g\2\2\u0202"+
		"\u0203\7n\2\2\u0203\u0204\3\2\2\2\u0204\u0205\b\30\t\2\u0205\66\3\2\2"+
		"\2\u0206\u0207\7e\2\2\u0207\u0208\7r\2\2\u0208\u0209\7/\2\2\u0209\u020a"+
		"\7h\2\2\u020a\u020b\7q\2\2\u020b\u020c\7t\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u020e\b\31\t\2\u020e8\3\2\2\2\u020f\u0210\7e\2\2\u0210\u0211\7r\2\2\u0211"+
		"\u0212\7/\2\2\u0212\u0213\7u\2\2\u0213\u0214\7y\2\2\u0214\u0215\7k\2\2"+
		"\u0215\u0216\7v\2\2\u0216\u0217\7e\2\2\u0217\u0218\7j\2\2\u0218\u0219"+
		"\3\2\2\2\u0219\u021a\b\32\t\2\u021a:\3\2\2\2\u021b\u021c\7e\2\2\u021c"+
		"\u021d\7r\2\2\u021d\u021e\7/\2\2\u021e\u021f\7u\2\2\u021f\u0220\7y\2\2"+
		"\u0220\u0221\7k\2\2\u0221\u0222\7v\2\2\u0222\u0223\7e\2\2\u0223\u0224"+
		"\7j\2\2\u0224\u0225\7/\2\2\u0225\u0226\7e\2\2\u0226\u0227\7c\2\2\u0227"+
		"\u0228\7u\2\2\u0228\u0229\7g\2\2\u0229\u022a\3\2\2\2\u022a\u022b\b\33"+
		"\t\2\u022b<\3\2\2\2\u022c\u022d\7e\2\2\u022d\u022e\7r\2\2\u022e\u022f"+
		"\7/\2\2\u022f\u0230\7u\2\2\u0230\u0231\7y\2\2\u0231\u0232\7k\2\2\u0232"+
		"\u0233\7v\2\2\u0233\u0234\7e\2\2\u0234\u0235\7j\2\2\u0235\u0236\7/\2\2"+
		"\u0236\u0237\7f\2\2\u0237\u0238\7g\2\2\u0238\u0239\7h\2\2\u0239\u023a"+
		"\7c\2\2\u023a\u023b\7w\2\2\u023b\u023c\7n\2\2\u023c\u023d\7v\2\2\u023d"+
		">\3\2\2\2\u023e\u0242\5O%\2\u023f\u0241\5I\"\2\u0240\u023f\3\2\2\2\u0241"+
		"\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243@\3\2\2\2"+
		"\u0244\u0242\3\2\2\2\u0245\u0246\7?\2\2\u0246\u0247\3\2\2\2\u0247\u0248"+
		"\b\36\n\2\u0248B\3\2\2\2\u0249\u024a\t\2\2\2\u024a\u024b\3\2\2\2\u024b"+
		"\u024c\b\37\3\2\u024cD\3\2\2\2\u024d\u024e\7\61\2\2\u024eF\3\2\2\2\u024f"+
		"\u0250\7@\2\2\u0250\u0251\3\2\2\2\u0251\u0252\b!\b\2\u0252H\3\2\2\2\u0253"+
		"\u0258\5O%\2\u0254\u0258\t\4\2\2\u0255\u0258\5K#\2\u0256\u0258\t\5\2\2"+
		"\u0257\u0253\3\2\2\2\u0257\u0254\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0256"+
		"\3\2\2\2\u0258J\3\2\2\2\u0259\u025a\t\6\2\2\u025aL\3\2\2\2\u025b\u025c"+
		"\t\7\2\2\u025cN\3\2\2\2\u025d\u025f\t\b\2\2\u025e\u025d\3\2\2\2\u025f"+
		"P\3\2\2\2\u0260\u0261\7?\2\2\u0261R\3\2\2\2\u0262\u0263\t\2\2\2\u0263"+
		"\u0264\3\2\2\2\u0264\u0265\b\'\3\2\u0265T\3\2\2\2\u0266\u0267\7$\2\2\u0267"+
		"\u0268\3\2\2\2\u0268\u0269\b(\7\2\u0269V\3\2\2\2\u026a\u026b\7\60\2\2"+
		"\u026bX\3\2\2\2\u026c\u026d\7.\2\2\u026dZ\3\2\2\2\u026e\u026f\7<\2\2\u026f"+
		"\\\3\2\2\2\u0270\u0271\7=\2\2\u0271^\3\2\2\2\u0272\u0273\7*\2\2\u0273"+
		"`\3\2\2\2\u0274\u0275\7+\2\2\u0275b\3\2\2\2\u0276\u0277\7]\2\2\u0277d"+
		"\3\2\2\2\u0278\u0279\7_\2\2\u0279f\3\2\2\2\u027a\u027b\7}\2\2\u027bh\3"+
		"\2\2\2\u027c\u027d\7\177\2\2\u027dj\3\2\2\2\u027e\u027f\7A\2\2\u027fl"+
		"\3\2\2\2\u0280\u0281\7~\2\2\u0281n\3\2\2\2\u0282\u0283\7?\2\2\u0283p\3"+
		"\2\2\2\u0284\u0285\7k\2\2\u0285\u0286\7p\2\2\u0286r\3\2\2\2\u0287\u0288"+
		"\7v\2\2\u0288\u0289\7t\2\2\u0289\u028a\7w\2\2\u028a\u028b\7g\2\2\u028b"+
		"t\3\2\2\2\u028c\u028d\7h\2\2\u028d\u028e\7c\2\2\u028e\u028f\7n\2\2\u028f"+
		"\u0290\7u\2\2\u0290\u0291\7g\2\2\u0291v\3\2\2\2\u0292\u0293\7k\2\2\u0293"+
		"\u0294\7p\2\2\u0294\u0295\7f\2\2\u0295\u0296\7g\2\2\u0296\u0297\7z\2\2"+
		"\u0297x\3\2\2\2\u0298\u0299\7C\2\2\u0299\u029a\7P\2\2\u029a\u02a1\7F\2"+
		"\2\u029b\u029c\7c\2\2\u029c\u029d\7p\2\2\u029d\u02a1\7f\2\2\u029e\u029f"+
		"\7(\2\2\u029f\u02a1\7(\2\2\u02a0\u0298\3\2\2\2\u02a0\u029b\3\2\2\2\u02a0"+
		"\u029e\3\2\2\2\u02a1z\3\2\2\2\u02a2\u02a3\7Q\2\2\u02a3\u02a9\7T\2\2\u02a4"+
		"\u02a5\7q\2\2\u02a5\u02a9\7t\2\2\u02a6\u02a7\7~\2\2\u02a7\u02a9\7~\2\2"+
		"\u02a8\u02a2\3\2\2\2\u02a8\u02a4\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9|\3"+
		"\2\2\2\u02aa\u02ab\7Z\2\2\u02ab\u02ac\7Q\2\2\u02ac\u02b2\7T\2\2\u02ad"+
		"\u02ae\7z\2\2\u02ae\u02af\7q\2\2\u02af\u02b2\7t\2\2\u02b0\u02b2\7`\2\2"+
		"\u02b1\u02aa\3\2\2\2\u02b1\u02ad\3\2\2\2\u02b1\u02b0\3\2\2\2\u02b2~\3"+
		"\2\2\2\u02b3\u02b4\7P\2\2\u02b4\u02b5\7Q\2\2\u02b5\u02bb\7V\2\2\u02b6"+
		"\u02b7\7p\2\2\u02b7\u02b8\7q\2\2\u02b8\u02bb\7v\2\2\u02b9\u02bb\7#\2\2"+
		"\u02ba\u02b3\3\2\2\2\u02ba\u02b6\3\2\2\2\u02ba\u02b9\3\2\2\2\u02bb\u0080"+
		"\3\2\2\2\u02bc\u02bd\7-\2\2\u02bd\u0082\3\2\2\2\u02be\u02bf\7/\2\2\u02bf"+
		"\u0084\3\2\2\2\u02c0\u02c1\7,\2\2\u02c1\u0086\3\2\2\2\u02c2\u02c3\7\61"+
		"\2\2\u02c3\u0088\3\2\2\2\u02c4\u02c5\7\'\2\2\u02c5\u008a\3\2\2\2\u02c6"+
		"\u02c7\7@\2\2\u02c7\u008c\3\2\2\2\u02c8\u02c9\7>\2\2\u02c9\u008e\3\2\2"+
		"\2\u02ca\u02cb\7@\2\2\u02cb\u02cc\7?\2\2\u02cc\u0090\3\2\2\2\u02cd\u02ce"+
		"\7>\2\2\u02ce\u02cf\7?\2\2\u02cf\u0092\3\2\2\2\u02d0\u02d1\7?\2\2\u02d1"+
		"\u02d2\7?\2\2\u02d2\u0094\3\2\2\2\u02d3\u02d4\7?\2\2\u02d4\u02d5\7?\2"+
		"\2\u02d5\u02d6\7?\2\2\u02d6\u0096\3\2\2\2\u02d7\u02d8\7#\2\2\u02d8\u02d9"+
		"\7?\2\2\u02d9\u0098\3\2\2\2\u02da\u02db\7#\2\2\u02db\u02dc\7?\2\2\u02dc"+
		"\u02dd\7?\2\2\u02dd\u009a\3\2\2\2\u02de\u02e2\5\u00abS\2\u02df\u02e1\5"+
		"\u00a9R\2\u02e0\u02df\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2"+
		"\u02e2\u02e3\3\2\2\2\u02e3\u009c\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02e7"+
		"\5K#\2\u02e6\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8"+
		"\u02e9\3\2\2\2\u02e9\u02f0\3\2\2\2\u02ea\u02ec\5W)\2\u02eb\u02ed\5K#\2"+
		"\u02ec\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef"+
		"\3\2\2\2\u02ef\u02f1\3\2\2\2\u02f0\u02ea\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1"+
		"\u009e\3\2\2\2\u02f2\u02f7\7)\2\2\u02f3\u02f6\5\u00a7Q\2\u02f4\u02f6\13"+
		"\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f4\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7"+
		"\u02f8\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u02fa\3\2\2\2\u02f9\u02f7\3\2"+
		"\2\2\u02fa\u0305\7)\2\2\u02fb\u0300\7$\2\2\u02fc\u02ff\5\u00a7Q\2\u02fd"+
		"\u02ff\n\t\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02fd\3\2\2\2\u02ff\u0302\3\2"+
		"\2\2\u0300\u0301\3\2\2\2\u0300\u02fe\3\2\2\2\u0301\u0303\3\2\2\2\u0302"+
		"\u0300\3\2\2\2\u0303\u0305\7$\2\2\u0304\u02f2\3\2\2\2\u0304\u02fb\3\2"+
		"\2\2\u0305\u00a0\3\2\2\2\u0306\u0307\t\2\2\2\u0307\u0308\3\2\2\2\u0308"+
		"\u0309\bN\3\2\u0309\u00a2\3\2\2\2\u030a\u030b\7$\2\2\u030b\u030c\3\2\2"+
		"\2\u030c\u030d\bO\b\2\u030d\u030e\bO\b\2\u030e\u00a4\3\2\2\2\u030f\u0310"+
		"\7\177\2\2\u0310\u0311\7\177\2\2\u0311\u0312\3\2\2\2\u0312\u0313\bP\b"+
		"\2\u0313\u00a6\3\2\2\2\u0314\u0315\7^\2\2\u0315\u031b\7)\2\2\u0316\u0317"+
		"\7^\2\2\u0317\u031b\7$\2\2\u0318\u0319\7^\2\2\u0319\u031b\7^\2\2\u031a"+
		"\u0314\3\2\2\2\u031a\u0316\3\2\2\2\u031a\u0318\3\2\2\2\u031b\u00a8\3\2"+
		"\2\2\u031c\u031f\5\u00abS\2\u031d\u031f\5K#\2\u031e\u031c\3\2\2\2\u031e"+
		"\u031d\3\2\2\2\u031f\u00aa\3\2\2\2\u0320\u0321\t\n\2\2\u0321\u00ac\3\2"+
		"\2\2\u0322\u0324\7\"\2\2\u0323\u0322\3\2\2\2\u0324\u0327\3\2\2\2\u0325"+
		"\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0328\3\2\2\2\u0327\u0325\3\2"+
		"\2\2\u0328\u0329\5\u00afU\2\u0329\u032a\3\2\2\2\u032a\u032b\bT\b\2\u032b"+
		"\u00ae\3\2\2\2\u032c\u0332\5\u00b1V\2\u032d\u0332\5\u00b3W\2\u032e\u0332"+
		"\5\u00b5X\2\u032f\u0332\5\u00b9Z\2\u0330\u0332\5\u00bb[\2\u0331\u032c"+
		"\3\2\2\2\u0331\u032d\3\2\2\2\u0331\u032e\3\2\2\2\u0331\u032f\3\2\2\2\u0331"+
		"\u0330\3\2\2\2\u0332\u00b0\3\2\2\2\u0333\u0337\7$\2\2\u0334\u0336\n\13"+
		"\2\2\u0335\u0334\3\2\2\2\u0336\u0339\3\2\2\2\u0337\u0335\3\2\2\2\u0337"+
		"\u0338\3\2\2\2\u0338\u033a\3\2\2\2\u0339\u0337\3\2\2\2\u033a\u033b\7$"+
		"\2\2\u033b\u00b2\3\2\2\2\u033c\u0340\7)\2\2\u033d\u033f\n\f\2\2\u033e"+
		"\u033d\3\2\2\2\u033f\u0342\3\2\2\2\u0340\u033e\3\2\2\2\u0340\u0341\3\2"+
		"\2\2\u0341\u0343\3\2\2\2\u0342\u0340\3\2\2\2\u0343\u0344\7)\2\2\u0344"+
		"\u00b4\3\2\2\2\u0345\u0347\5\u00b7Y\2\u0346\u0345\3\2\2\2\u0347\u0348"+
		"\3\2\2\2\u0348\u0346\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034b\3\2\2\2\u034a"+
		"\u034c\7\"\2\2\u034b\u034a\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u00b6\3\2"+
		"\2\2\u034d\u034f\t\r\2\2\u034e\u034d\3\2\2\2\u034f\u00b8\3\2\2\2\u0350"+
		"\u0352\7%\2\2\u0351\u0353\t\7\2\2\u0352\u0351\3\2\2\2\u0353\u0354\3\2"+
		"\2\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u00ba\3\2\2\2\u0356"+
		"\u0358\t\6\2\2\u0357\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u0357\3\2"+
		"\2\2\u0359\u035a\3\2\2\2\u035a\u035c\3\2\2\2\u035b\u035d\7\'\2\2\u035c"+
		"\u035b\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u00bc\3\2\2\2\u035e\u035f\13"+
		"\2\2\2\u035f\u00be\3\2\2\2\66\2\3\4\5\6\7\b\u00c7\u00d7\u00e8\u00fa\u0107"+
		"\u0112\u011d\u0122\u012b\u012e\u013d\u014e\u0161\u0173\u017f\u0190\u01f7"+
		"\u0242\u0257\u025e\u02a0\u02a8\u02b1\u02ba\u02e2\u02e8\u02ee\u02f0\u02f5"+
		"\u02f7\u02fe\u0300\u0304\u031a\u031e\u0325\u0331\u0337\u0340\u0348\u034b"+
		"\u034e\u0354\u0359\u035c\13\2\3\2\b\2\2\7\3\2\7\4\2\7\5\2\7\7\2\6\2\2"+
		"\7\6\2\7\b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}