grammar ArithmeticExpressions;
prog: stat+ ;

stat: VAR '=' expr ';' NEWLINE # Assign
    | expr ';' NEWLINE # ExprOnly;

expr:  expr op=(ADD|SUB) term # AddSub
    | term # AddSubTerm;

term:  term op=(MUL|DIV) factor # MulDiv
    | factor # MulDivFactor;

factor: deg '^' factor # FactorDeg
    | deg # SimpleDeg;

deg:  INT # Int
    | (SUB|)VAR # Var
    | (SUB|)'(' expr ')' # Parens;


VAR : [a-zA-Z]+ ;
INT : [-]?[0-9]+ ;

NEWLINE:'\r'? '\n' ;
WS : [ \t]+ -> skip ;
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
