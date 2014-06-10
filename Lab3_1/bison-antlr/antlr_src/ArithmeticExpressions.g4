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
  : term {$value = $term.value;}
  | e1=expr PLUS term {$value = $e1.value + $term.value;}
  | e2=expr MINUS term {$value = $e2.value - $term.value;}
  ;

term returns[int value]
  : power {$value = $power.value;}
  | t1=term MUL power {$value = $t1.value * $power.value;}
  | t2=term DIV power {$value = $t2.value / $power.value;}
  ;

power returns[int value]
  : minus {$value = $minus.value;}
  | minus POW p1=power {$value = (int) Math.pow($minus.value, $p1.value);}
  ;

minus returns[int value]
  : factor {$value = $factor.value;}
  | MINUS m1=minus {$value = -$m1.value;}
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
POW : '^';
LEFT_PAREN : '(';
RIGHT_PAREN : ')';
WS : [ \t]+ -> skip ;
