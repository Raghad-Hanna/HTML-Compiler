lexer grammar DateFormatLexer ;

SECOND
    : 's'
    | 'S'
    ;

MINUTE
    : 'm'
    | 'M'
    ;

HOUR
    : 'h'
    | 'H'
    ;

TWO_DIGIT_DAY
    : 'dd'
    | 'DD'
    ;

DAY
    : 'day'
    | 'DAY'
    ;

TWO_DIGIT_MONTH
    : 'mm'
    | 'MM'
    ;

MONTH
    : 'month'
    | 'MONTH'
    ;

TWO_DIGIT_YEAR
    : 'yy'
    | 'YY'
    ;

FOUR_DIGIT_YEAR
    : 'yyyy'
    | 'YYYY'
    ;

COLON_SEPARATOR : ':' ;
SLASH_SEPARATOR : '/' ;
DASH_SEPARATOR : '-' ;

SEA_WHITESPACE : [ \t\r\n] -> skip ;