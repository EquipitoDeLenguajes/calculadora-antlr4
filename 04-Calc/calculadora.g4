grammar calculadora; // Always the same as the filename

prog:   stat+ ;

stat:   expr NEWLINE                # printExpr
    |   NEWLINE                     # blank
    ;

expr:   expr op=('*'|'/') expr      # MulDiv
    |   expr op=('+'|'-') expr      # AddSub
    |   ABS expr ABS                # Abs
    |   INT                         # int
    |   FLOAT                       # float
    |   '(' expr ')'                # parens
    ;

MUL :   '*' ;
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
ABS :   '|' ;
INT :   [-]?[0-9]+ ;
FLOAT : [0-9]+ '.' [0-9]+ | '.' [0-9]+ ;        
NEWLINE:'\r'? '\n' ;     
WS  :   [ \t]+ -> skip ; 
