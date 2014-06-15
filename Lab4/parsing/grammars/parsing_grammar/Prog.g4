grammar Prog;
WS : [ \t]+ -> skip ;

prog : (NEWLINE* header NEWLINE*) (NEWLINE* members NEWLINE*) (((cur_rule ';' NEWLINE) | NEWLINE)*);

header : '@header' JAVACODE NEWLINE #HeaderLabel;

members : '@members' JAVACODE  NEWLINE #MembersLabel;

cur_rule  : NON_TERM_NAME decl_synth? ':' non_term_production ('|' non_term_production)*   # NonTermLabel
        | TERM_NAME ':' term_production ('|' term_production)* # TermLabel;

non_term_production : (node_non_term_production)* JAVACODE?;
node_non_term_production : NON_TERM_NAME | TERM_NAME;
term_production : ('\'' (NON_TERM_NAME | LEFT_PAREN | RIGHT_PAREN) '\'')*;


decl_synth : 'returns' '[' type ']';
type : NON_TERM_NAME | TERM_NAME | MIX_CASE_NAME;

NEWLINE:'\r'? '\n' ;
NON_TERM_NAME : [_a-z]+;
TERM_NAME : [_A-Z]+;
MIX_CASE_NAME : [_a-zA-Z]+;
JAVACODE : '{' (~('}'|'{')+ JAVACODE?)* '}';
LEFT_PAREN : '(';
RIGHT_PAREN : ')';
