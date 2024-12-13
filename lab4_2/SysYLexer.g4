lexer grammar SysYLexer;

// Keywords
CONST : 'const';
INT : 'int';
VOID : 'void';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
BREAK : 'break';
CONTINUE : 'continue';
RETURN : 'return';

// Operators
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
MOD : '%';
ASSIGN : '=';
EQ : '==';
NEQ : '!=';
LT : '<';
GT : '>';
LE : '<=';
GE : '>=';
NOT : '!';
AND : '&&';
OR : '||';

// Delimiters
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';
COMMA : ',';
SEMI : ';';

// Constants
DECIMAL_CONST : [1-9][0-9]* | '0';

OCTAL_CONST : '0' [0-7]+ ;

HEXADECIMAL_CONST : ('0x'|'0X')[0-9a-fA-F]+ ;

// Identifiers
IDENT : [a-zA-Z_][a-zA-Z_0-9]*;

// Whitespace and comments
WS : [ \t\r\n]+ -> skip;
LINE_COMMENT : '//' .*? '\r'? '\n' -> skip;
BLOCK_COMMENT : '/*' .*? '*/' -> skip;

ERR_OCT : '0' [0-9]* {
    String txt = getText();
    if (!txt.matches("0[0-7]+")) {
        setType(ERROR_NUMBER);
    }
};

ERR_HEX : ('0x'|'0X')[0-9a-fA-F]*[g-zG-Z][0-9a-zA-Z]* {
    setType(ERROR_NUMBER);
};

// error process
ERROR_CHAR : . ;   
ERROR_NUMBER : . ; 