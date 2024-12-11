lexer grammar SysYLexer;

// Operators
ASSIGN      : '=';
ADD         : '+';
SUB         : '-';
MUL         : '*';
DIV         : '/';
MOD         : '%';
LT          : '<';
GT          : '>';
LEQ         : '<=';
GEQ         : '>=';
EQ          : '==';
NEQ         : '!=';
INC         : '++';
DEC         : '--';
// Logic
NOT         : '!';
AND         : '&&';
OR          : '||';

// Separators
LPAREN      : '(';
RPAREN      : ')';
LBRACE      : '{';
RBRACE      : '}';
LBRACKET    : '[';
RBRACKET    : ']';
COMMA       : ',';
SEMI        : ';';

// Keywords
CONST : 'const';
VOID : 'void';
INT : 'int';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
BREAK : 'break';
CONTINUE : 'continue';
RETURN : 'return';

// Identifiers and constants
IDent : (LETTER | '_') (LETTER | DIGIT | '_')*;

// Numbers
DECI:    [1-9][0-9]*;
OCT :   '0' [0-7]+;
HEX :   '0x' [0-9a-fA-F]+ | '0X' [0-9a-fA-F]+;
FLOAT_CONST : ('+' | '-')? (DECI '.' DIGIT* | '.' DIGIT+) (('e' | 'E') ('+' | '-')? DECI)?;

// Arrays
ARRAY : ('[' DECI ']'* | '[' FLOAT_CONST ']');

// Comments
SL_COMMENT: '//' ~[\r\n]* -> skip;
ML_COMMENT: '/*' .*? '*/' -> skip;
DOCS_COMMENT: '/**' .*? '*/' -> skip;

// Whitespace
WS : [ \t\r\n]+ -> skip;

// Fragments
fragment LETTER : [a-zA-Z_];
fragment DIGIT : [0-9];

// 捕获非法字符并将其送入到一个错误通道
ILLEGAL_CHAR : . -> channel(HIDDEN);
