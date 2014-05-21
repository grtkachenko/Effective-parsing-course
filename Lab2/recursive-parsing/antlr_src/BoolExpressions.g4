grammar BoolExpressions;
prog : boolexp NEWLINE;

boolexp: term boolexp_prime;

boolexp_prime : (OR|XOR) term boolexp_prime |;

term : factor term_prime;

term_prime:  AND factor term_prime |;

factor:  VAR
    | INT
    | NOT factor
    | '(' boolexp ')';

VAR : [a-z] ;
INT : [01] ;

NEWLINE:'\r'? '\n' ;
WS : [ \t]+ -> skip ;
AND : 'and' ;
OR : 'or' ;
XOR : 'xor' ;
NOT : 'not' ;
