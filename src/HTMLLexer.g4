lexer grammar HTMLLexer ;

COMMENT : '<!--' .*? '-->' -> channel(HIDDEN) ;

CONDITIONAL_COMMENT : '<![' .*? ']>' -> channel(HIDDEN) ;

XML : '<?xml' .*? '>' ;

CDATA : '<![CDATA[' .*? ']]>' ;

DTD : '<!' .*? '>' ;

SCRIPTLET : '<?' .*? '?>' | '<%' .*? '%>' ;

SEA_WHITESPACE : [ \t\r\n] -> skip ;

SEA_TEXT : (~[<{ \t\r\n]+ | SEA_OPENING_CURLY_BRACE);

SEA_OPENING_CURLY_BRACE : '{' ;

SCRIPT_START_TAG : '<script' .*? '>' -> pushMode(SCRIPT) ;

STYLE_START_TAG : '<style' .*? '>' -> pushMode(STYLE) ;

OPENING_TAG : '<' -> pushMode(TAG) ;

DOUBLE_OPENING_CURLY_BRACES : '{{' -> pushMode(EXPRESSION) ;

mode SCRIPT ;

SCRIPT_BODY : .*? '</script>' -> popMode ;

SCRIPT_SHORT_BODY : .*? '</>' -> popMode ;

mode STYLE ;

STYLE_BODY : .*? '</style>' -> popMode ;

STYLE_SHORT_BODY : .*? '</>' -> popMode ;

mode TAG ;

CP_APP : 'cp-app' -> pushMode(TRANSITION) ;

CP_SHOW : 'cp-show' -> pushMode(TRANSITION) ;

CP_HIDE : 'cp-hide' -> pushMode(TRANSITION) ;

CP_IF : 'cp-if' -> pushMode(TRANSITION) ;

EVENT_LISTENER
    : ('@click'
    |  '@change'
    |  '@focus'
    |  '@mouseover'
    |  '@mousedown'
    |  '@mouseup'
    |  '@mousemove')
    -> pushMode(TRANSITION)
    ;

CP_MODEL : 'cp-model' -> pushMode(TRANSITION) ;

CP_FOR : 'cp-for' -> pushMode(TRANSITION) ;

CP_SWITCH : 'cp-switch' -> pushMode(TRANSITION) ;

CP_SWITCH_CASE : 'cp-switch-case' -> pushMode(TRANSITION) ;

CP_SWITCH_DEFAULT : 'cp-switch-default' ;

// The component could be an element name or an HTML attribue name,
// Their naming rules are identical,
// They will be validated in the Semantic Analysis phase later.
COMPONENT_NAME : COMPONENT_FIRST_CHAR COMPONENT_CHAR* ;

HTML_ATTRIBUTE_EQUALS : '=' -> pushMode(HTML_ATTRIBUTE_VALUE) ;

TAG_WHITESPACE : [ \t\r\n] -> skip ;

TAG_SLASH : '/' ;

CLOSING_TAG : '>' -> popMode ;

fragment COMPONENT_CHAR
    : COMPONENT_FIRST_CHAR
    | '-'
    | '_'
    | '.'
    | DIGIT
    | '\u00B7'
    | '\u0300'..'\u036F'
    | '\u203F'..'\u2040'
    ;

fragment DIGIT : [0-9] ;

fragment HEXDIGIT : [a-fA-F0-9] ;

fragment COMPONENT_FIRST_CHAR
    : [:a-zA-Z]
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD'
    ;

// The mode that moves us from the TAG mode where the parsed directive name is
// to the PARSED_EXPRESSION mode where the parsed directive value is
mode TRANSITION ;

DIRECTIVE_EQUALS : '=' ;

TRANSITION_WHITESPACE : [ \t\r\n] -> skip ;

OPENING_DOUBLE_QUOTES : '"' -> pushMode(EXPRESSION) ;

mode EXPRESSION ;

DOT : '.' ;
COMMA : ',' ;
COLON : ':' ;
SEMICOLON : ';' ;
OPENING_PARENTHESES : '(' ;
CLOSING_PARENTHESES : ')' ;
OPENING_BRACKET : '[' ;
CLOSING_BRACKET : ']' ;
OPENING_BRACE : '{' ;
CLOSING_BRACE : '}' ;
QUESTION_MARK : '?' ;
PIPE : '|' ;
ASSIGNMENT : '=' ;

IN : 'in' ;
TRUE : 'true' ;
FALSE : 'false';
INDEX : 'index' ;

AND : 'AND' | 'and' | '&&' ;
OR : 'OR'  | 'or'  | '||' ;
XOR : 'XOR' | 'xor' | '^' ;
NOT : 'NOT' | 'not' | '!' ;

PLUS : '+' ;
MINUS : '-' ;
MULTIPLICATION : '*' ;
DIVISION : '/' ;
MODULUS : '%' ;

GREATER : '>' ;
SMALLER : '<' ;
GREATER_EQUALS : '>=' ;
SMALLER_EQUALS : '<=' ;
EQUALITY : '==' ;
STRICT_EQUALITY : '===' ;
INEQUALITY : '!=' ;
STRICT_INEQUALITY : '!==' ;

IDENTIFIER : ID_FIRST_CHAR ID_CHAR* ;

NUMBER : DIGIT+ (DOT DIGIT+)? ;

STRING_LITERAL
    : '\'' (ESCAPE | .)*? '\''
    | '"' (ESCAPE | ~('=' | '{'))*? '"'
    ;

IN_EXPRESSION_WHITESPACE : [ \t\r\n] -> skip ;

CLOSING_DOUBLE_QUOTES : '"' -> popMode, popMode ;

DOUBLE_CLOSING_CURLY_BRACES : '}}' -> popMode ;

fragment ESCAPE
    : '\\\''
    | '\\"'
    | '\\\\'
    ;

fragment ID_CHAR
    : ID_FIRST_CHAR
    | DIGIT
    ;

fragment ID_FIRST_CHAR : [a-zA-Z$_] ;

mode HTML_ATTRIBUTE_VALUE ;

// An directive value may have spaces b/t the '=' and the value
ATTRIBUTE_VALUE : ' '* VALUE -> popMode ;

VALUE
    : DOUBLE_QUOTE_STRING
    | SINGLE_QUOTE_STRING
    | ATTCHARS
    | HEXCHARS
    | DECCHARS
    ;

fragment DOUBLE_QUOTE_STRING : '"' ~[<"]* '"' ;

fragment SINGLE_QUOTE_STRING : '\'' ~[<']* '\'' ;

fragment ATTCHARS : ATTCHAR+ ' '? ;

fragment ATTCHAR
    : '-'
    | '_'
    | '.'
    | '/'
    | '+'
    | ','
    | '?'
    | '='
    | ':'
    | ';'
    | '#'
    | [0-9a-zA-Z]
    ;

fragment HEXCHARS : '#' [0-9a-fA-F]+ ;

fragment DECCHARS : [0-9]+ '%'? ;

fragment CHARCACTER : .;
