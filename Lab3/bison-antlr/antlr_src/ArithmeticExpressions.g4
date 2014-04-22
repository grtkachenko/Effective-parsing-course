grammar ArithmeticExpressions;
prog: stat+ ;

stat: VAR '=' expr ';' NEWLINE # Assign;


expr:  expr op=(MUL|DIV) expr # MulDiv
    | expr op=(ADD|SUB) right_expr # AddSub
    | (SUB|)INT # Int
    | (SUB|)VAR # Var
    | (SUB|)'(' expr ')' # Parens;

right_expr:  right_expr op=(MUL|DIV) expr # RightMulDiv
    | right_expr op=(ADD|SUB) right_expr # RightAddSub
    | INT # RightInt
    | VAR # RightVar
    | '(' expr ')' # RightParens;

VAR : [a-zA-Z]+ ;
INT : [0-9]+ ;

NEWLINE:'\r'? '\n' ;
WS : [ \t]+ -> skip ;
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
