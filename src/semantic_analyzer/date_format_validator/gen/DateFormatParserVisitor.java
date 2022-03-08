// Generated from C:/Users/Raghad/Desktop/Compiler/html-compiler/src/semantic_analyzer/date_format_validator\DateFormatParser.g4 by ANTLR 4.8
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DateFormatParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DateFormatParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DateFormatParser#validDateFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidDateFormat(DateFormatParser.ValidDateFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateFormatParser#timeWithHour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeWithHour(DateFormatParser.TimeWithHourContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateFormatParser#yearMonth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYearMonth(DateFormatParser.YearMonthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateFormatParser#monthYear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonthYear(DateFormatParser.MonthYearContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateFormatParser#monthDayYear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonthDayYear(DateFormatParser.MonthDayYearContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateFormatParser#monthDayYearSlashSeparated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonthDayYearSlashSeparated(DateFormatParser.MonthDayYearSlashSeparatedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateFormatParser#monthDayYearDashSeparated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonthDayYearDashSeparated(DateFormatParser.MonthDayYearDashSeparatedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateFormatParser#dayMonthYear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDayMonthYear(DateFormatParser.DayMonthYearContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateFormatParser#dayMonthYearSlashSeparated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDayMonthYearSlashSeparated(DateFormatParser.DayMonthYearSlashSeparatedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateFormatParser#dayMonthYearDashSeparated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDayMonthYearDashSeparated(DateFormatParser.DayMonthYearDashSeparatedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateFormatParser#yearMonthDay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYearMonthDay(DateFormatParser.YearMonthDayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateFormatParser#yearMonthDaySlashSeparated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYearMonthDaySlashSeparated(DateFormatParser.YearMonthDaySlashSeparatedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateFormatParser#yearMonthDayDashSeparated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYearMonthDayDashSeparated(DateFormatParser.YearMonthDayDashSeparatedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateFormatParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(DateFormatParser.TimeContext ctx);
}