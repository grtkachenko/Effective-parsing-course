grammar ArithmeticExpressions;
prog: stat+ ;

stat: VAR '=' expr ';' NEWLINE # assign;


expr:  expr op=MUL expr # Mul
    | expr op=(ADD|SUB) expr # AddSub
    | INT # int
    | VAR # var
    | '(' expr ')' # parens;

VAR : [a-zA-Z]+ ;
INT : [0-9]+ ;
NEWLINE:'\r'? '\n' ;
WS : [ \t]+ -> skip ;
MUL : '*' ;
ADD : '+' ;
SUB : '-' ;