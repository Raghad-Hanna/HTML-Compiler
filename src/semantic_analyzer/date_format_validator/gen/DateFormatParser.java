// Generated from C:/Users/Raghad/Desktop/Compiler/html-compiler/src/semantic_analyzer/date_format_validator\DateFormatParser.g4 by ANTLR 4.8
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DateFormatParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SECOND=1, MINUTE=2, HOUR=3, TWO_DIGIT_DAY=4, DAY=5, TWO_DIGIT_MONTH=6, 
		MONTH=7, TWO_DIGIT_YEAR=8, FOUR_DIGIT_YEAR=9, COLON_SEPARATOR=10, SLASH_SEPARATOR=11, 
		DASH_SEPARATOR=12, SEA_WHITESPACE=13;
	public static final int
		RULE_validDateFormat = 0, RULE_timeWithHour = 1, RULE_yearMonth = 2, RULE_monthYear = 3, 
		RULE_monthDayYear = 4, RULE_monthDayYearSlashSeparated = 5, RULE_monthDayYearDashSeparated = 6, 
		RULE_dayMonthYear = 7, RULE_dayMonthYearSlashSeparated = 8, RULE_dayMonthYearDashSeparated = 9, 
		RULE_yearMonthDay = 10, RULE_yearMonthDaySlashSeparated = 11, RULE_yearMonthDayDashSeparated = 12, 
		RULE_time = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"validDateFormat", "timeWithHour", "yearMonth", "monthYear", "monthDayYear", 
			"monthDayYearSlashSeparated", "monthDayYearDashSeparated", "dayMonthYear", 
			"dayMonthYearSlashSeparated", "dayMonthYearDashSeparated", "yearMonthDay", 
			"yearMonthDaySlashSeparated", "yearMonthDayDashSeparated", "time"
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

	@Override
	public String getGrammarFileName() { return "DateFormatParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DateFormatParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ValidDateFormatContext extends ParserRuleContext {
		public TerminalNode DAY() { return getToken(DateFormatParser.DAY, 0); }
		public TerminalNode EOF() { return getToken(DateFormatParser.EOF, 0); }
		public TerminalNode MONTH() { return getToken(DateFormatParser.MONTH, 0); }
		public TimeWithHourContext timeWithHour() {
			return getRuleContext(TimeWithHourContext.class,0);
		}
		public YearMonthContext yearMonth() {
			return getRuleContext(YearMonthContext.class,0);
		}
		public MonthYearContext monthYear() {
			return getRuleContext(MonthYearContext.class,0);
		}
		public MonthDayYearContext monthDayYear() {
			return getRuleContext(MonthDayYearContext.class,0);
		}
		public DayMonthYearContext dayMonthYear() {
			return getRuleContext(DayMonthYearContext.class,0);
		}
		public YearMonthDayContext yearMonthDay() {
			return getRuleContext(YearMonthDayContext.class,0);
		}
		public ValidDateFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validDateFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).enterValidDateFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).exitValidDateFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateFormatParserVisitor ) return ((DateFormatParserVisitor<? extends T>)visitor).visitValidDateFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValidDateFormatContext validDateFormat() throws RecognitionException {
		ValidDateFormatContext _localctx = new ValidDateFormatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_validDateFormat);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(DAY);
				setState(29);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(MONTH);
				setState(31);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				timeWithHour();
				setState(33);
				match(EOF);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				yearMonth();
				setState(36);
				match(EOF);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				monthYear();
				setState(39);
				match(EOF);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(41);
				monthDayYear();
				setState(42);
				match(EOF);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
				dayMonthYear();
				setState(45);
				match(EOF);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(47);
				yearMonthDay();
				setState(48);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeWithHourContext extends ParserRuleContext {
		public TerminalNode HOUR() { return getToken(DateFormatParser.HOUR, 0); }
		public List<TerminalNode> COLON_SEPARATOR() { return getTokens(DateFormatParser.COLON_SEPARATOR); }
		public TerminalNode COLON_SEPARATOR(int i) {
			return getToken(DateFormatParser.COLON_SEPARATOR, i);
		}
		public TerminalNode MINUTE() { return getToken(DateFormatParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(DateFormatParser.SECOND, 0); }
		public TimeWithHourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeWithHour; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).enterTimeWithHour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).exitTimeWithHour(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateFormatParserVisitor ) return ((DateFormatParserVisitor<? extends T>)visitor).visitTimeWithHour(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeWithHourContext timeWithHour() throws RecognitionException {
		TimeWithHourContext _localctx = new TimeWithHourContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_timeWithHour);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(HOUR);
			setState(53);
			match(COLON_SEPARATOR);
			setState(54);
			match(MINUTE);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON_SEPARATOR) {
				{
				setState(55);
				match(COLON_SEPARATOR);
				setState(56);
				match(SECOND);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YearMonthContext extends ParserRuleContext {
		public TerminalNode FOUR_DIGIT_YEAR() { return getToken(DateFormatParser.FOUR_DIGIT_YEAR, 0); }
		public TerminalNode DASH_SEPARATOR() { return getToken(DateFormatParser.DASH_SEPARATOR, 0); }
		public TerminalNode TWO_DIGIT_MONTH() { return getToken(DateFormatParser.TWO_DIGIT_MONTH, 0); }
		public YearMonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yearMonth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).enterYearMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).exitYearMonth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateFormatParserVisitor ) return ((DateFormatParserVisitor<? extends T>)visitor).visitYearMonth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YearMonthContext yearMonth() throws RecognitionException {
		YearMonthContext _localctx = new YearMonthContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_yearMonth);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(FOUR_DIGIT_YEAR);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DASH_SEPARATOR) {
				{
				setState(60);
				match(DASH_SEPARATOR);
				setState(61);
				match(TWO_DIGIT_MONTH);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MonthYearContext extends ParserRuleContext {
		public TerminalNode TWO_DIGIT_MONTH() { return getToken(DateFormatParser.TWO_DIGIT_MONTH, 0); }
		public TerminalNode DASH_SEPARATOR() { return getToken(DateFormatParser.DASH_SEPARATOR, 0); }
		public TerminalNode TWO_DIGIT_YEAR() { return getToken(DateFormatParser.TWO_DIGIT_YEAR, 0); }
		public TerminalNode FOUR_DIGIT_YEAR() { return getToken(DateFormatParser.FOUR_DIGIT_YEAR, 0); }
		public MonthYearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monthYear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).enterMonthYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).exitMonthYear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateFormatParserVisitor ) return ((DateFormatParserVisitor<? extends T>)visitor).visitMonthYear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonthYearContext monthYear() throws RecognitionException {
		MonthYearContext _localctx = new MonthYearContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_monthYear);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(TWO_DIGIT_MONTH);
			setState(65);
			match(DASH_SEPARATOR);
			setState(66);
			_la = _input.LA(1);
			if ( !(_la==TWO_DIGIT_YEAR || _la==FOUR_DIGIT_YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MonthDayYearContext extends ParserRuleContext {
		public MonthDayYearSlashSeparatedContext monthDayYearSlashSeparated() {
			return getRuleContext(MonthDayYearSlashSeparatedContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public MonthDayYearDashSeparatedContext monthDayYearDashSeparated() {
			return getRuleContext(MonthDayYearDashSeparatedContext.class,0);
		}
		public MonthDayYearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monthDayYear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).enterMonthDayYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).exitMonthDayYear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateFormatParserVisitor ) return ((DateFormatParserVisitor<? extends T>)visitor).visitMonthDayYear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonthDayYearContext monthDayYear() throws RecognitionException {
		MonthDayYearContext _localctx = new MonthDayYearContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_monthDayYear);
		int _la;
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				monthDayYearSlashSeparated();
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HOUR) {
					{
					setState(69);
					time();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				monthDayYearDashSeparated();
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HOUR) {
					{
					setState(73);
					time();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MonthDayYearSlashSeparatedContext extends ParserRuleContext {
		public TerminalNode TWO_DIGIT_MONTH() { return getToken(DateFormatParser.TWO_DIGIT_MONTH, 0); }
		public List<TerminalNode> SLASH_SEPARATOR() { return getTokens(DateFormatParser.SLASH_SEPARATOR); }
		public TerminalNode SLASH_SEPARATOR(int i) {
			return getToken(DateFormatParser.SLASH_SEPARATOR, i);
		}
		public TerminalNode TWO_DIGIT_DAY() { return getToken(DateFormatParser.TWO_DIGIT_DAY, 0); }
		public TerminalNode TWO_DIGIT_YEAR() { return getToken(DateFormatParser.TWO_DIGIT_YEAR, 0); }
		public TerminalNode FOUR_DIGIT_YEAR() { return getToken(DateFormatParser.FOUR_DIGIT_YEAR, 0); }
		public MonthDayYearSlashSeparatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monthDayYearSlashSeparated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).enterMonthDayYearSlashSeparated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).exitMonthDayYearSlashSeparated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateFormatParserVisitor ) return ((DateFormatParserVisitor<? extends T>)visitor).visitMonthDayYearSlashSeparated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonthDayYearSlashSeparatedContext monthDayYearSlashSeparated() throws RecognitionException {
		MonthDayYearSlashSeparatedContext _localctx = new MonthDayYearSlashSeparatedContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_monthDayYearSlashSeparated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(TWO_DIGIT_MONTH);
			setState(79);
			match(SLASH_SEPARATOR);
			setState(80);
			match(TWO_DIGIT_DAY);
			setState(81);
			match(SLASH_SEPARATOR);
			setState(82);
			_la = _input.LA(1);
			if ( !(_la==TWO_DIGIT_YEAR || _la==FOUR_DIGIT_YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MonthDayYearDashSeparatedContext extends ParserRuleContext {
		public TerminalNode TWO_DIGIT_MONTH() { return getToken(DateFormatParser.TWO_DIGIT_MONTH, 0); }
		public List<TerminalNode> DASH_SEPARATOR() { return getTokens(DateFormatParser.DASH_SEPARATOR); }
		public TerminalNode DASH_SEPARATOR(int i) {
			return getToken(DateFormatParser.DASH_SEPARATOR, i);
		}
		public TerminalNode TWO_DIGIT_DAY() { return getToken(DateFormatParser.TWO_DIGIT_DAY, 0); }
		public TerminalNode TWO_DIGIT_YEAR() { return getToken(DateFormatParser.TWO_DIGIT_YEAR, 0); }
		public TerminalNode FOUR_DIGIT_YEAR() { return getToken(DateFormatParser.FOUR_DIGIT_YEAR, 0); }
		public MonthDayYearDashSeparatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monthDayYearDashSeparated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).enterMonthDayYearDashSeparated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).exitMonthDayYearDashSeparated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateFormatParserVisitor ) return ((DateFormatParserVisitor<? extends T>)visitor).visitMonthDayYearDashSeparated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonthDayYearDashSeparatedContext monthDayYearDashSeparated() throws RecognitionException {
		MonthDayYearDashSeparatedContext _localctx = new MonthDayYearDashSeparatedContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_monthDayYearDashSeparated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(TWO_DIGIT_MONTH);
			setState(85);
			match(DASH_SEPARATOR);
			setState(86);
			match(TWO_DIGIT_DAY);
			setState(87);
			match(DASH_SEPARATOR);
			setState(88);
			_la = _input.LA(1);
			if ( !(_la==TWO_DIGIT_YEAR || _la==FOUR_DIGIT_YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DayMonthYearContext extends ParserRuleContext {
		public DayMonthYearSlashSeparatedContext dayMonthYearSlashSeparated() {
			return getRuleContext(DayMonthYearSlashSeparatedContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public DayMonthYearDashSeparatedContext dayMonthYearDashSeparated() {
			return getRuleContext(DayMonthYearDashSeparatedContext.class,0);
		}
		public DayMonthYearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dayMonthYear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).enterDayMonthYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).exitDayMonthYear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateFormatParserVisitor ) return ((DateFormatParserVisitor<? extends T>)visitor).visitDayMonthYear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DayMonthYearContext dayMonthYear() throws RecognitionException {
		DayMonthYearContext _localctx = new DayMonthYearContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dayMonthYear);
		int _la;
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				dayMonthYearSlashSeparated();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HOUR) {
					{
					setState(91);
					time();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				dayMonthYearDashSeparated();
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HOUR) {
					{
					setState(95);
					time();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DayMonthYearSlashSeparatedContext extends ParserRuleContext {
		public TerminalNode TWO_DIGIT_DAY() { return getToken(DateFormatParser.TWO_DIGIT_DAY, 0); }
		public List<TerminalNode> SLASH_SEPARATOR() { return getTokens(DateFormatParser.SLASH_SEPARATOR); }
		public TerminalNode SLASH_SEPARATOR(int i) {
			return getToken(DateFormatParser.SLASH_SEPARATOR, i);
		}
		public TerminalNode TWO_DIGIT_MONTH() { return getToken(DateFormatParser.TWO_DIGIT_MONTH, 0); }
		public TerminalNode TWO_DIGIT_YEAR() { return getToken(DateFormatParser.TWO_DIGIT_YEAR, 0); }
		public TerminalNode FOUR_DIGIT_YEAR() { return getToken(DateFormatParser.FOUR_DIGIT_YEAR, 0); }
		public DayMonthYearSlashSeparatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dayMonthYearSlashSeparated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).enterDayMonthYearSlashSeparated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).exitDayMonthYearSlashSeparated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateFormatParserVisitor ) return ((DateFormatParserVisitor<? extends T>)visitor).visitDayMonthYearSlashSeparated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DayMonthYearSlashSeparatedContext dayMonthYearSlashSeparated() throws RecognitionException {
		DayMonthYearSlashSeparatedContext _localctx = new DayMonthYearSlashSeparatedContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dayMonthYearSlashSeparated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(TWO_DIGIT_DAY);
			setState(101);
			match(SLASH_SEPARATOR);
			setState(102);
			match(TWO_DIGIT_MONTH);
			setState(103);
			match(SLASH_SEPARATOR);
			setState(104);
			_la = _input.LA(1);
			if ( !(_la==TWO_DIGIT_YEAR || _la==FOUR_DIGIT_YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DayMonthYearDashSeparatedContext extends ParserRuleContext {
		public TerminalNode TWO_DIGIT_DAY() { return getToken(DateFormatParser.TWO_DIGIT_DAY, 0); }
		public List<TerminalNode> DASH_SEPARATOR() { return getTokens(DateFormatParser.DASH_SEPARATOR); }
		public TerminalNode DASH_SEPARATOR(int i) {
			return getToken(DateFormatParser.DASH_SEPARATOR, i);
		}
		public TerminalNode TWO_DIGIT_MONTH() { return getToken(DateFormatParser.TWO_DIGIT_MONTH, 0); }
		public TerminalNode TWO_DIGIT_YEAR() { return getToken(DateFormatParser.TWO_DIGIT_YEAR, 0); }
		public TerminalNode FOUR_DIGIT_YEAR() { return getToken(DateFormatParser.FOUR_DIGIT_YEAR, 0); }
		public DayMonthYearDashSeparatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dayMonthYearDashSeparated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).enterDayMonthYearDashSeparated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).exitDayMonthYearDashSeparated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateFormatParserVisitor ) return ((DateFormatParserVisitor<? extends T>)visitor).visitDayMonthYearDashSeparated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DayMonthYearDashSeparatedContext dayMonthYearDashSeparated() throws RecognitionException {
		DayMonthYearDashSeparatedContext _localctx = new DayMonthYearDashSeparatedContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dayMonthYearDashSeparated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(TWO_DIGIT_DAY);
			setState(107);
			match(DASH_SEPARATOR);
			setState(108);
			match(TWO_DIGIT_MONTH);
			setState(109);
			match(DASH_SEPARATOR);
			setState(110);
			_la = _input.LA(1);
			if ( !(_la==TWO_DIGIT_YEAR || _la==FOUR_DIGIT_YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YearMonthDayContext extends ParserRuleContext {
		public YearMonthDaySlashSeparatedContext yearMonthDaySlashSeparated() {
			return getRuleContext(YearMonthDaySlashSeparatedContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public YearMonthDayDashSeparatedContext yearMonthDayDashSeparated() {
			return getRuleContext(YearMonthDayDashSeparatedContext.class,0);
		}
		public YearMonthDayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yearMonthDay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).enterYearMonthDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).exitYearMonthDay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateFormatParserVisitor ) return ((DateFormatParserVisitor<? extends T>)visitor).visitYearMonthDay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YearMonthDayContext yearMonthDay() throws RecognitionException {
		YearMonthDayContext _localctx = new YearMonthDayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_yearMonthDay);
		int _la;
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				yearMonthDaySlashSeparated();
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HOUR) {
					{
					setState(113);
					time();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				yearMonthDayDashSeparated();
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HOUR) {
					{
					setState(117);
					time();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YearMonthDaySlashSeparatedContext extends ParserRuleContext {
		public List<TerminalNode> SLASH_SEPARATOR() { return getTokens(DateFormatParser.SLASH_SEPARATOR); }
		public TerminalNode SLASH_SEPARATOR(int i) {
			return getToken(DateFormatParser.SLASH_SEPARATOR, i);
		}
		public TerminalNode TWO_DIGIT_MONTH() { return getToken(DateFormatParser.TWO_DIGIT_MONTH, 0); }
		public TerminalNode TWO_DIGIT_DAY() { return getToken(DateFormatParser.TWO_DIGIT_DAY, 0); }
		public TerminalNode TWO_DIGIT_YEAR() { return getToken(DateFormatParser.TWO_DIGIT_YEAR, 0); }
		public TerminalNode FOUR_DIGIT_YEAR() { return getToken(DateFormatParser.FOUR_DIGIT_YEAR, 0); }
		public YearMonthDaySlashSeparatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yearMonthDaySlashSeparated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).enterYearMonthDaySlashSeparated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).exitYearMonthDaySlashSeparated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateFormatParserVisitor ) return ((DateFormatParserVisitor<? extends T>)visitor).visitYearMonthDaySlashSeparated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YearMonthDaySlashSeparatedContext yearMonthDaySlashSeparated() throws RecognitionException {
		YearMonthDaySlashSeparatedContext _localctx = new YearMonthDaySlashSeparatedContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_yearMonthDaySlashSeparated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !(_la==TWO_DIGIT_YEAR || _la==FOUR_DIGIT_YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(123);
			match(SLASH_SEPARATOR);
			setState(124);
			match(TWO_DIGIT_MONTH);
			setState(125);
			match(SLASH_SEPARATOR);
			setState(126);
			match(TWO_DIGIT_DAY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YearMonthDayDashSeparatedContext extends ParserRuleContext {
		public List<TerminalNode> DASH_SEPARATOR() { return getTokens(DateFormatParser.DASH_SEPARATOR); }
		public TerminalNode DASH_SEPARATOR(int i) {
			return getToken(DateFormatParser.DASH_SEPARATOR, i);
		}
		public TerminalNode TWO_DIGIT_MONTH() { return getToken(DateFormatParser.TWO_DIGIT_MONTH, 0); }
		public TerminalNode TWO_DIGIT_DAY() { return getToken(DateFormatParser.TWO_DIGIT_DAY, 0); }
		public TerminalNode TWO_DIGIT_YEAR() { return getToken(DateFormatParser.TWO_DIGIT_YEAR, 0); }
		public TerminalNode FOUR_DIGIT_YEAR() { return getToken(DateFormatParser.FOUR_DIGIT_YEAR, 0); }
		public YearMonthDayDashSeparatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yearMonthDayDashSeparated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).enterYearMonthDayDashSeparated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).exitYearMonthDayDashSeparated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateFormatParserVisitor ) return ((DateFormatParserVisitor<? extends T>)visitor).visitYearMonthDayDashSeparated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YearMonthDayDashSeparatedContext yearMonthDayDashSeparated() throws RecognitionException {
		YearMonthDayDashSeparatedContext _localctx = new YearMonthDayDashSeparatedContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_yearMonthDayDashSeparated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !(_la==TWO_DIGIT_YEAR || _la==FOUR_DIGIT_YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(129);
			match(DASH_SEPARATOR);
			setState(130);
			match(TWO_DIGIT_MONTH);
			setState(131);
			match(DASH_SEPARATOR);
			setState(132);
			match(TWO_DIGIT_DAY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeContext extends ParserRuleContext {
		public TerminalNode HOUR() { return getToken(DateFormatParser.HOUR, 0); }
		public List<TerminalNode> COLON_SEPARATOR() { return getTokens(DateFormatParser.COLON_SEPARATOR); }
		public TerminalNode COLON_SEPARATOR(int i) {
			return getToken(DateFormatParser.COLON_SEPARATOR, i);
		}
		public TerminalNode MINUTE() { return getToken(DateFormatParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(DateFormatParser.SECOND, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateFormatParserListener ) ((DateFormatParserListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DateFormatParserVisitor ) return ((DateFormatParserVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(HOUR);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON_SEPARATOR) {
				{
				setState(135);
				match(COLON_SEPARATOR);
				setState(136);
				match(MINUTE);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON_SEPARATOR) {
					{
					setState(137);
					match(COLON_SEPARATOR);
					setState(138);
					match(SECOND);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17\u0092\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\65\n"+
		"\2\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\5\4A\n\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\5\6I\n\6\3\6\3\6\5\6M\n\6\5\6O\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t_\n\t\3\t\3\t\5\tc\n\t\5\te\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\fu\n\f\3\f"+
		"\3\f\5\fy\n\f\5\f{\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u008e\n\17\5\17\u0090\n\17\3\17\2"+
		"\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\3\2\n\13\2\u0097\2\64\3"+
		"\2\2\2\4\66\3\2\2\2\6=\3\2\2\2\bB\3\2\2\2\nN\3\2\2\2\fP\3\2\2\2\16V\3"+
		"\2\2\2\20d\3\2\2\2\22f\3\2\2\2\24l\3\2\2\2\26z\3\2\2\2\30|\3\2\2\2\32"+
		"\u0082\3\2\2\2\34\u0088\3\2\2\2\36\37\7\7\2\2\37\65\7\2\2\3 !\7\t\2\2"+
		"!\65\7\2\2\3\"#\5\4\3\2#$\7\2\2\3$\65\3\2\2\2%&\5\6\4\2&\'\7\2\2\3\'\65"+
		"\3\2\2\2()\5\b\5\2)*\7\2\2\3*\65\3\2\2\2+,\5\n\6\2,-\7\2\2\3-\65\3\2\2"+
		"\2./\5\20\t\2/\60\7\2\2\3\60\65\3\2\2\2\61\62\5\26\f\2\62\63\7\2\2\3\63"+
		"\65\3\2\2\2\64\36\3\2\2\2\64 \3\2\2\2\64\"\3\2\2\2\64%\3\2\2\2\64(\3\2"+
		"\2\2\64+\3\2\2\2\64.\3\2\2\2\64\61\3\2\2\2\65\3\3\2\2\2\66\67\7\5\2\2"+
		"\678\7\f\2\28;\7\4\2\29:\7\f\2\2:<\7\3\2\2;9\3\2\2\2;<\3\2\2\2<\5\3\2"+
		"\2\2=@\7\13\2\2>?\7\16\2\2?A\7\b\2\2@>\3\2\2\2@A\3\2\2\2A\7\3\2\2\2BC"+
		"\7\b\2\2CD\7\16\2\2DE\t\2\2\2E\t\3\2\2\2FH\5\f\7\2GI\5\34\17\2HG\3\2\2"+
		"\2HI\3\2\2\2IO\3\2\2\2JL\5\16\b\2KM\5\34\17\2LK\3\2\2\2LM\3\2\2\2MO\3"+
		"\2\2\2NF\3\2\2\2NJ\3\2\2\2O\13\3\2\2\2PQ\7\b\2\2QR\7\r\2\2RS\7\6\2\2S"+
		"T\7\r\2\2TU\t\2\2\2U\r\3\2\2\2VW\7\b\2\2WX\7\16\2\2XY\7\6\2\2YZ\7\16\2"+
		"\2Z[\t\2\2\2[\17\3\2\2\2\\^\5\22\n\2]_\5\34\17\2^]\3\2\2\2^_\3\2\2\2_"+
		"e\3\2\2\2`b\5\24\13\2ac\5\34\17\2ba\3\2\2\2bc\3\2\2\2ce\3\2\2\2d\\\3\2"+
		"\2\2d`\3\2\2\2e\21\3\2\2\2fg\7\6\2\2gh\7\r\2\2hi\7\b\2\2ij\7\r\2\2jk\t"+
		"\2\2\2k\23\3\2\2\2lm\7\6\2\2mn\7\16\2\2no\7\b\2\2op\7\16\2\2pq\t\2\2\2"+
		"q\25\3\2\2\2rt\5\30\r\2su\5\34\17\2ts\3\2\2\2tu\3\2\2\2u{\3\2\2\2vx\5"+
		"\32\16\2wy\5\34\17\2xw\3\2\2\2xy\3\2\2\2y{\3\2\2\2zr\3\2\2\2zv\3\2\2\2"+
		"{\27\3\2\2\2|}\t\2\2\2}~\7\r\2\2~\177\7\b\2\2\177\u0080\7\r\2\2\u0080"+
		"\u0081\7\6\2\2\u0081\31\3\2\2\2\u0082\u0083\t\2\2\2\u0083\u0084\7\16\2"+
		"\2\u0084\u0085\7\b\2\2\u0085\u0086\7\16\2\2\u0086\u0087\7\6\2\2\u0087"+
		"\33\3\2\2\2\u0088\u008f\7\5\2\2\u0089\u008a\7\f\2\2\u008a\u008d\7\4\2"+
		"\2\u008b\u008c\7\f\2\2\u008c\u008e\7\3\2\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u0089\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\35\3\2\2\2\20\64;@HLN^bdtxz\u008d\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}