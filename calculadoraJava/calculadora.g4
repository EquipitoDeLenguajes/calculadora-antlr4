grammar calculadora;

prog:   stat+ ;

stat:   expr NEWLINE                # printExpr
    |   NEWLINE                     # blank
    ;

expr:   '-' expr                    # Negative
    |   expr op=('*'|'/') expr      # MulDiv 
    |   expr op=('+'|'-') expr      # AddSub
    |   ABS expr ABS                # Abs
    |   FLOAT                       # float
    |   INT                         # int
    |   '(' expr ')'                # parens
    ;

MUL :   '*' ;
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
ABS :   '|' ;
FLOAT : [0-9]+ '.' [0-9]* | '.' [0-9]+ ;  // match floating-point numbers
INT :   [0-9]+ ;                          // match integers
NEWLINE:'\r'? '\n' ;
WS  :   [ \t]+ -> skip ;
