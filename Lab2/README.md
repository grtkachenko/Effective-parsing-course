Lab #2 (variant №5)
====

###Грамматика

Прим. "and", "or", "xor" и "not" рассматриваются как один терминал.

BOOLEXP -> BOOLEXP (or | xor) TERM | TERM

TERM   -> TERM and FACTOR | FACTOR

FACTOR -> not FACTOR | '(' BOOLEXP ')' | OPERAND

OPERAND -> 'a'|'b'|...|'z'

* **BOOLEXP** - логическая формула
* **TERM** - правый операнд в логической операций or или xor (при этом в этом выражений приоритет следующей 
выполняемой операций не меньше приоритета операций and)
* **FACTOR** - правый операнд в логической операций and (при этом в этом выражений приоритет следующей 
выполняемой операций не меньше приоритета операций not или скобок)
* **OPERAND** - возможные операнды в логической формуле

###Устранение левой рекурсии 

BOOLEXP -> TERM BOOLEXP'        

BOOLEXP' -> eps | (xor | or) TERM BOOLEXP'

TERM   -> FACTOR TERM'

TERM' ->  eps | and FACTOR TERM'  

FACTOR -> not FACTOR         
        | (BOOLEXP) 
        | OPERAND

OPERAND -> 'a'|'b'|...|'z'

|             | FIRST      |     FOLLOW    |
|:------------|:----------:|:-------------:|
| BOOLEXP     |  nc(       | xo            |
| BOOLEXP'    |     e xo   |               |
| TERM        |  nc(       |               |
| TERM'       |     ea     |               |
| FACTOR      |  nc(       |               |
| OPERAND     |   c        |               |

e - epsilon    
c - a..z    
n - not    
a - and    
x - xor    
o - or    
