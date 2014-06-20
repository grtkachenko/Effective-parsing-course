grammar BoolExpressions;
@header {import org.StructureGraphic.v1.DSTreeNode;

         import java.awt.*;
         import java.util.Arrays;
         import java.util.ArrayList;
         import java.util.List;}

@members {public class Tree implements DSTreeNode {
              private String nodeName;
              private List<Tree> children;

              public Tree(String nodeName, Tree... children) {
                  this.nodeName = nodeName;
                  this.children = Arrays.asList(children);
              }

              public Tree(String nodeName) {
                  this.nodeName = nodeName;
              }

              @Override
              public String toString() {
                  if (children == null) {
                      return nodeName;
                  }

                  StringBuilder builder = new StringBuilder();
                  builder.append("(" + nodeName);

                  for (Tree child : children) {
                      builder.append(" " + child);
                  }
                  builder.append(")");
                  return builder.toString();
              }

              @Override
              public DSTreeNode[] DSgetChildren() {
                  return children != null ? children.toArray(new DSTreeNode[children.size()]) : new DSTreeNode[0];
              }

              @Override
              public Object DSgetValue() {
                  return nodeName;
              }

              @Override
              public Color DSgetColor() {
                  return children == null ? Color.RED : null;
              }

          }
          List<Tree> trees = new ArrayList<Tree>();

}

pascal_exp returns [ Tree tree ] : boolexp NEWLINE{ $tree = new Tree("pascal_exp", $boolexp.tree); } ;

boolexp returns [ Tree tree ] : term boolexp_prime { $tree = new Tree("boolexp", $term.tree, $boolexp_prime.tree); } ;
boolexp_prime returns [ Tree tree ] : OR term boolexp_prime { $tree = new Tree("boolexp_prime", new Tree("OR"), $term.tree, $boolexp_prime.tree); }
    | XOR term boolexp_prime { $tree = new Tree("boolexp_prime", new Tree("XOR"), $term.tree, $boolexp_prime.tree); } | ;

term returns [ Tree tree ] : factor term_prime { $tree = new Tree("term", $factor.tree, $term_prime.tree); };
term_prime returns [ Tree tree ] : AND factor term_prime { $tree = new Tree("term_prime", new Tree("AND"), $factor.tree, $term_prime.tree); }| ;

factor returns [ Tree tree ] :  VAR  { $tree = new Tree("factor", new Tree("VAR")); }
    | NOT not_factor=factor { $tree = new Tree("factor", new Tree("NOT"), $not_factor.tree); }
    |  LEFT_PAREN boolexp RIGHT_PAREN { $tree = new Tree("factor", new Tree("("), $boolexp.tree, new Tree(")")); };

VAR : 'a' | 'b' | 'c' | 'd' ;
AND : 'and' ;
OR : 'or' ;
XOR : 'xor' ;
NOT : 'not' ;
LEFT_PAREN : '(';
RIGHT_PAREN : ')';
NEWLINE:'\r'? '\n' ;
WS : [ \t]+ -> skip ;
