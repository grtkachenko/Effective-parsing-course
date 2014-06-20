grammar ArithmeticExpressions;
@header {
import java.util.*;
}

@members {
Map<String, Integer> memory = new HashMap<String, Integer>();
}

calc : calc statement | ;

statement : ID ASSIGN expr ENT_STMT ENDLINE { System.out.println($ID.text + "=" + $expr.value); memory.put($ID.text, $expr.value); }
     | expr ENT_STMT ENDLINE { System.out.println($expr.value); }
     ;

expr returns[int value]
  : term expr_prime[$term.value] {$value = $expr_prime.value;}
  ;

expr_prime[int i] returns[int value]
  : {$value = $i;}
  | PLUS term e1=expr_prime[$i + $term.value] {$value = $e1.value;}
  | MINUS term e2=expr_prime[$i - $term.value] {$value = $e2.value;}
  ;

term returns[int value]
  : factor term_prime[$factor.value] {$value = $term_prime.value;}
  ;

term_prime[int i] returns[int value]
  : {$value = $i;}
  | MUL factor e3=term_prime[$i * $factor.value] {$value = $e3.value;}
  | DIV factor e4=term_prime[$i / $factor.value] {$value = $e4.value;}
  ;

factor returns[int value]
  : INT {$value = Integer.parseInt($INT.text);}
  | ID {$value = memory.get($ID.text);}
  | LEFT_PAREN expr RIGHT_PAREN {$value = $expr.value;}
  ;

INT : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
ID : 'a' | 'b' | 'c' | 'd';
ENDLINE : '\r\n' | '\n';
ENT_STMT : ';';
ASSIGN : '=';
PLUS : '+';
MINUS : '-';
MUL : '*';
DIV : '/';
LEFT_PAREN : '(';
RIGHT_PAREN : ')';
WS : [ \t]+ -> skip ;
