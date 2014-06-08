grammar Prog;
prog : ((cur_rule ';' NEWLINE) | NEWLINE)*;

cur_rule  : NON_TERM_NAME ':' non_term_production ('|' non_term_production)*   # NonTermLabel
        | TERM_NAME ':' term_production ('|' term_production)* # TermLabel;

non_term_production : (node_non_term_production)*;
node_non_term_production : NON_TERM_NAME | TERM_NAME;
term_production : ('\'' (NON_TERM_NAME | LEFT_PAREN | RIGHT_PAREN) '\'')*;

NEWLINE:'\r'? '\n' ;
WS : [ \t]+ -> skip ;
NON_TERM_NAME : [_a-z]+;
TERM_NAME : [_A-Z]+;
LEFT_PAREN : '(';
RIGHT_PAREN : ')';
