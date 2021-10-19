grammar lambda;

expression
    : identifier | constant | function_ | application
    ;
identifier:VARIABLE;
function_
    : '(' 'L' identifier+  scope ')'
    ;

application
    : '(' expression+  expression ')'
    ;
scope
    : expression
    ;
constant: NUM |  EXP ;
NUM : [0-9] ;
EXP : 'add' | 'sub' | 'sqr' ;
VARIABLE
    : [a-z] [a-zA-Z0-9]*
    ;

WS
   : [ \t\r\n] -> skip
   ;