grammar calculadora;

prog:   stat+ ;

stat:   expr                        # printExpr
    |   ID '=' expr                 # assign
    ;

expr:   '-' expr                    # Negative
    |   expr op=('*'|'/') expr      # MulDiv 
    |   expr op=('+'|'-') expr      # AddSub
    |   ABS expr ABS                # Abs
    |   FLOAT                       # float
    |   INT                         # int
    |   ID                          # id
    |   '(' expr ')'                # parens
    ;

MUL     : '*' ;
DIV     : '/' ;
ADD     : '+' ;
SUB     : '-' ;
ABS     : '|' ;
FLOAT   : [0-9]+ '.' [0-9]* | '.' [0-9]+ ;  // match floating-point numbers
INT     : [0-9]+ ;                          // match integers
ID      : [a-zA-Z] [a-zA-Z0-9]* ;           // match variable names
WS      : [ \t]+ -> skip ;
