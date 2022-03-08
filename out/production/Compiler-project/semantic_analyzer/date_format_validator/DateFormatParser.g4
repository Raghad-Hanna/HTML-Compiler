parser grammar DateFormatParser;

options { tokenVocab=DateFormatLexer; }

validDateFormat
    : DAY EOF            // Sunday
    | MONTH EOF          // November
    | timeWithHour EOF   // 03:15, 04:30:12
    | yearMonth EOF      // 1984-11, 1968
    | monthYear EOF      // 11-99, 01-1996
    | monthDayYear EOF   // 12-08-1968 03:69, 12/08/1968 06
    | dayMonthYear EOF   // 03-07-72, 03/07/1972 09:09:23
    | yearMonthDay EOF   // 22-01-01 12:00, 2022/01/01
    ;

timeWithHour
    : HOUR COLON_SEPARATOR MINUTE (COLON_SEPARATOR SECOND)?
    ;

yearMonth
    : FOUR_DIGIT_YEAR (DASH_SEPARATOR TWO_DIGIT_MONTH)?
    ;

monthYear
    : TWO_DIGIT_MONTH DASH_SEPARATOR (TWO_DIGIT_YEAR | FOUR_DIGIT_YEAR)
    ;

monthDayYear
    : monthDayYearSlashSeparated time?
    | monthDayYearDashSeparated time?
    ;

monthDayYearSlashSeparated
    : TWO_DIGIT_MONTH SLASH_SEPARATOR TWO_DIGIT_DAY SLASH_SEPARATOR (TWO_DIGIT_YEAR | FOUR_DIGIT_YEAR)
    ;

monthDayYearDashSeparated
    : TWO_DIGIT_MONTH DASH_SEPARATOR TWO_DIGIT_DAY DASH_SEPARATOR (TWO_DIGIT_YEAR | FOUR_DIGIT_YEAR)
    ;

dayMonthYear
    : dayMonthYearSlashSeparated time?
    | dayMonthYearDashSeparated time?
    ;

dayMonthYearSlashSeparated
    : TWO_DIGIT_DAY SLASH_SEPARATOR TWO_DIGIT_MONTH SLASH_SEPARATOR (TWO_DIGIT_YEAR | FOUR_DIGIT_YEAR)
    ;

dayMonthYearDashSeparated
    : TWO_DIGIT_DAY DASH_SEPARATOR TWO_DIGIT_MONTH DASH_SEPARATOR (TWO_DIGIT_YEAR | FOUR_DIGIT_YEAR)
    ;

yearMonthDay
    : yearMonthDaySlashSeparated time?
    | yearMonthDayDashSeparated time?
    ;

yearMonthDaySlashSeparated
    : (TWO_DIGIT_YEAR | FOUR_DIGIT_YEAR) SLASH_SEPARATOR TWO_DIGIT_MONTH SLASH_SEPARATOR TWO_DIGIT_DAY
    ;

yearMonthDayDashSeparated
    : (TWO_DIGIT_YEAR | FOUR_DIGIT_YEAR) DASH_SEPARATOR TWO_DIGIT_MONTH DASH_SEPARATOR TWO_DIGIT_DAY
    ;

time
    : HOUR (COLON_SEPARATOR MINUTE (COLON_SEPARATOR SECOND)?)?
    ;