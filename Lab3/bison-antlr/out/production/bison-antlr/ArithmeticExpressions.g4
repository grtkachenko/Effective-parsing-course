grammar ArithmeticExpressions;
prog: stat+ ;

stat: VAR '=' expr ';' NEWLINE # Assign;


expr:  expr op=(MUL|DIV) expr # MulDiv
    | expr op=(ADD|SUB) right_expr # AddSub
    | INT # Int
    | VAR # Var
    | '-'INT # SInt
    | '-'VAR # SVar
    | '(' expr ')' # Parens
    | '-(' expr ')' # SignParens;

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
