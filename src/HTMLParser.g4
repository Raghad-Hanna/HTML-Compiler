parser grammar HTMLParser;

options { tokenVocab=HTMLLexer; }

document : SCRIPTLET* XML? SCRIPTLET* DTD? SCRIPTLET* element* ;

element
    : OPENING_TAG COMPONENT_NAME attribute* CLOSING_TAG content* OPENING_TAG TAG_SLASH COMPONENT_NAME CLOSING_TAG #nonVoidElement
    | OPENING_TAG COMPONENT_NAME attribute* TAG_SLASH CLOSING_TAG           #voidElement
    | switchE /* special case => separated in its own rule */               #switchElement
    | SCRIPTLET                                                             #scriptletElement
    | SCRIPT_START_TAG (SCRIPT_BODY | SCRIPT_SHORT_BODY)                    #scriptElement
    | STYLE_START_TAG (STYLE_BODY | STYLE_SHORT_BODY)                       #styleElement
    ;

attribute
    : htmlAttribute   #originalAttribute
    | directive       #extendedAttribute
    ;

htmlAttribute : COMPONENT_NAME (HTML_ATTRIBUTE_EQUALS ATTRIBUTE_VALUE)? ;

directive
    : CP_APP          DIRECTIVE_EQUALS  OPENING_DOUBLE_QUOTES  IDENTIFIER           CLOSING_DOUBLE_QUOTES  #cp_appDirective
    | CP_SHOW         DIRECTIVE_EQUALS  OPENING_DOUBLE_QUOTES  expression           CLOSING_DOUBLE_QUOTES  #cp_showDirective
    | CP_HIDE         DIRECTIVE_EQUALS  OPENING_DOUBLE_QUOTES  expression           CLOSING_DOUBLE_QUOTES  #cp_hideDirective
    | CP_IF           DIRECTIVE_EQUALS  OPENING_DOUBLE_QUOTES  expression           CLOSING_DOUBLE_QUOTES  #cp_ifDirective
    | EVENT_LISTENER  DIRECTIVE_EQUALS  OPENING_DOUBLE_QUOTES  expression           CLOSING_DOUBLE_QUOTES  #eventListenerDirective
    // It doesn't make sense to pass a function to cp-model, but the parser will not throw an error
    // If we try to dsiplay it in the view, Angular will display the function definition
    | CP_MODEL        DIRECTIVE_EQUALS  OPENING_DOUBLE_QUOTES  objectChainedMembers CLOSING_DOUBLE_QUOTES  #cp_modelDirective
    | CP_FOR          DIRECTIVE_EQUALS  OPENING_DOUBLE_QUOTES  forLoop              CLOSING_DOUBLE_QUOTES  #cp_forDirective
    ;

expression
    : STRING_LITERAL                                       #stringLiteralArgument
    | objectLiteral                                        #objectLiteralArgument
    | arrayLiteral                                         #arrayLiteralArgument
    | booleanExpression                                    #booleanExpressionArgument
    | arithmeticExpression                                 #arithmeticExpressionArgument
    | assignmentExpression                                 #assignmentExpressionArgument
    | ternaryOperator                                      #ternaryOperatorArgument
    // TODO an issue occurs where the parser could be communicating false info to the above layers
    // TODO (ex: x + y is recognized & built as an arithmetic expression but it really could be a concatenated expression)
    // TODO maybe the expression classifications should be eliminated since JS is liberal about types and the above layers
    // TODO should handle the type coercion compatibility issue, this is the first time i prefer strict over liberal :|
    | dataBindingExpression                                #dataBindingExpressionArgument
    | expression (PLUS expression)+                        #concatenatedExpressionArgument
    | OPENING_PARENTHESES expression CLOSING_PARENTHESES   #parenthesizedExpressionArgument
    ;

objectLiteral : OPENING_BRACE properties? CLOSING_BRACE ;

properties : property (COMMA property)* ;

property : (objectChainedMembers COLON expression) ;

arrayLiteral : OPENING_BRACKET arrayElements? CLOSING_BRACKET ;

arrayElements : expression (COMMA expression)* ;

booleanExpression
    : booleanValue                                                                       #primitiveBooleanExpression
    | booleanExpression (booleanOperator | equalityOperator) booleanExpression           #binaryBooleanExpression
    | arithmeticExpression (comparisonOperator | equalityOperator) arithmeticExpression  #binaryComparisonExpression
    | NOT booleanExpression                                                              #unaryBooleanExpression
    | OPENING_PARENTHESES booleanExpression CLOSING_PARENTHESES                          #parenthesizedBooleanExpression
    ;

// TRUE & FALSE are boolean literals & we prevent their use in places where a number is expected
// like (11 > true).
booleanValue
    : TRUE                   #booleanLiteral
    | FALSE                  #booleanLiteral
    | objectChainedMembers   #booleanObjectAccessedMember
    ;

booleanOperator
    : AND
    | OR
    | XOR
    ;

equalityOperator
    : EQUALITY
    | STRICT_EQUALITY
    | INEQUALITY
    | STRICT_INEQUALITY
    ;

comparisonOperator
    : GREATER
    | SMALLER
    | GREATER_EQUALS
    | SMALLER_EQUALS
    ;

arithmeticExpression
    : numericValue                                                  #primitiveArithmeticExpression
    | arithmeticExpression arithmeticOperator arithmeticExpression  #binaryArithmeticExpression
    | (PLUS | MINUS) arithmeticExpression                           #unaryArithmeticExpression
    | OPENING_PARENTHESES arithmeticExpression CLOSING_PARENTHESES  #parenthesizedArithmeticExpression
    ;

// Number is a numeric literal & we prevent its use in places where a boolean is expected
// like (2 && 3).
numericValue
    : NUMBER                 #numericLiteral
    | objectChainedMembers   #numericObjectAccessedMember
    ;

arithmeticOperator
    : PLUS
    | MINUS
    | MULTIPLICATION
    | DIVISION
    | MODULUS
    ;

assignmentExpression : objectChainedMembers ASSIGNMENT expression ;

ternaryOperator
    : booleanExpression QUESTION_MARK expression COLON expression   #basicTernaryOperator
    | OPENING_PARENTHESES ternaryOperator CLOSING_PARENTHESES       #parenthesizedTernaryOperator
    ;

objectChainedMembers : objectMember (DOT objectMember)* ;

// IDENTIFIER, arrayElement & functionCall
// are the only kind of expressions that can
// boil down to a boolean value or a numeric value
// (while TRUE, FALSE & NUMBER cannot).
objectMember
    : IDENTIFIER             #accessedIdentifier
    | arrayElement           #accessedArrayElement
    | functionCall           #accessedFunctionCall
    ;

arrayElement : arrayName arrayElementIndex+ ;

arrayName
    : IDENTIFIER      #directlyAccessedArray
    | functionCall    #returnedArray
    ;

arrayElementIndex : OPENING_BRACKET arithmeticExpression CLOSING_BRACKET ;

functionCall : IDENTIFIER OPENING_PARENTHESES functionArguments? CLOSING_PARENTHESES ;

functionArguments : expression (COMMA expression)* ;

forLoop
    : IDENTIFIER IN arrayDataSource (SEMICOLON IDENTIFIER ASSIGNMENT INDEX)?   #arrayForLoop
    | IDENTIFIER COMMA IDENTIFIER IN objectChainedMembers                      #objectForLoop
    ;

arrayDataSource
    : arrayLiteral            #arrayLiteralDataSource
    | objectChainedMembers    #objectChainedMembersDataSource
    ;

// Do not erase the 'E', switch means something special to ANTLR, so things are getting mixed up ..
switchE
    : OPENING_TAG COMPONENT_NAME attribute* switchAttribute attribute* CLOSING_TAG
      switchCase*
      OPENING_TAG TAG_SLASH COMPONENT_NAME CLOSING_TAG
    ;

switchAttribute
    : CP_SWITCH DIRECTIVE_EQUALS
      OPENING_DOUBLE_QUOTES expression CLOSING_DOUBLE_QUOTES
    ;

switchCase
    : OPENING_TAG COMPONENT_NAME attribute* switchCaseAttribute attribute* CLOSING_TAG
      content*
      OPENING_TAG TAG_SLASH COMPONENT_NAME CLOSING_TAG
    ;

switchCaseAttribute
    : CP_SWITCH_CASE DIRECTIVE_EQUALS OPENING_DOUBLE_QUOTES expression CLOSING_DOUBLE_QUOTES  #nonDefaultSwitchCase
    | CP_SWITCH_DEFAULT                                                                       #defaultSwitchCase
    ;

content
    : element                    #elementContent
    | text                       #textContent
    | dataBindingExpression      #dataContent
    ;

text : SEA_TEXT+ ;

dataBindingExpression : DOUBLE_OPENING_CURLY_BRACES interpolatedExpression DOUBLE_CLOSING_CURLY_BRACES ;

interpolatedExpression : expression filters? ;

filters : (PIPE filter)+ ;

filter : objectChainedMembers (COLON expression)* ;