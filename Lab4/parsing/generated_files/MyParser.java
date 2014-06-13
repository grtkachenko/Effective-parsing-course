import org.StructureGraphic.v1.DSTreeNode;

import java.awt.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.io.InputStream;
import java.text.ParseException;
import java.util.*;

public class MyParser{
    public class Tree implements DSTreeNode {
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

    private LexicalAnalyzer lex;

    public Tree parse(InputStream is) throws ParseException {
        lex = new LexicalAnalyzer(is);
        lex.nextToken();
        return pascal_exp();
    }

    private Tree term_prime() throws ParseException {
        HashMap<String, Object> results = new HashMap<String, Object>();
        switch (lex.getCurToken()) {

            case LEFT_PAREN:
            case RIGHT_PAREN:
                return null;

            case VAR:
            case XOR:
                return null;

            case NOT:
            case END:
                return null;

            case AND:
                if (lex.getCurToken() != Token.AND) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }
                lex.nextToken();
                results.put("factor", factor());
                results.put("term_prime", term_prime());
                 return new Tree("term_prime", new Tree("AND"), (Tree) results.get("factor"), (Tree) results.get("term_prime")); 
            case OR:
                return null;

            default:
                throw new AssertionError();
        }
    }
    private Tree pascal_exp() throws ParseException {
        HashMap<String, Object> results = new HashMap<String, Object>();
        switch (lex.getCurToken()) {

            case LEFT_PAREN:
                results.put("boolexp", boolexp());
                 return new Tree("pascal_exp", (Tree) results.get("boolexp")); 
            case RIGHT_PAREN:
            case VAR:
                results.put("boolexp", boolexp());
                 return new Tree("pascal_exp", (Tree) results.get("boolexp")); 
            case XOR:
            case NOT:
                results.put("boolexp", boolexp());
                 return new Tree("pascal_exp", (Tree) results.get("boolexp")); 
            case END:
            case AND:
            case OR:
            default:
                throw new AssertionError();
        }
    }
    private Tree term() throws ParseException {
        HashMap<String, Object> results = new HashMap<String, Object>();
        switch (lex.getCurToken()) {

            case LEFT_PAREN:
                results.put("factor", factor());
                results.put("term_prime", term_prime());
                 return new Tree("term", (Tree) results.get("factor"), (Tree) results.get("term_prime")); 
            case RIGHT_PAREN:
            case VAR:
                results.put("factor", factor());
                results.put("term_prime", term_prime());
                 return new Tree("term", (Tree) results.get("factor"), (Tree) results.get("term_prime")); 
            case XOR:
            case NOT:
                results.put("factor", factor());
                results.put("term_prime", term_prime());
                 return new Tree("term", (Tree) results.get("factor"), (Tree) results.get("term_prime")); 
            case END:
            case AND:
            case OR:
            default:
                throw new AssertionError();
        }
    }
    private Tree boolexp() throws ParseException {
        HashMap<String, Object> results = new HashMap<String, Object>();
        switch (lex.getCurToken()) {

            case LEFT_PAREN:
                results.put("term", term());
                results.put("boolexp_prime", boolexp_prime());
                 return new Tree("boolexp", (Tree) results.get("term"), (Tree) results.get("boolexp_prime")); 
            case RIGHT_PAREN:
            case VAR:
                results.put("term", term());
                results.put("boolexp_prime", boolexp_prime());
                 return new Tree("boolexp", (Tree) results.get("term"), (Tree) results.get("boolexp_prime")); 
            case XOR:
            case NOT:
                results.put("term", term());
                results.put("boolexp_prime", boolexp_prime());
                 return new Tree("boolexp", (Tree) results.get("term"), (Tree) results.get("boolexp_prime")); 
            case END:
            case AND:
            case OR:
            default:
                throw new AssertionError();
        }
    }
    private Tree factor() throws ParseException {
        HashMap<String, Object> results = new HashMap<String, Object>();
        switch (lex.getCurToken()) {

            case LEFT_PAREN:
                if (lex.getCurToken() != Token.LEFT_PAREN) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }
                lex.nextToken();
                results.put("boolexp", boolexp());
                if (lex.getCurToken() != Token.RIGHT_PAREN) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }
                lex.nextToken();
                 return new Tree("factor", new Tree("("), (Tree) results.get("boolexp"), new Tree(")")); 
            case RIGHT_PAREN:
            case VAR:
                if (lex.getCurToken() != Token.VAR) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }
                lex.nextToken();
                 return new Tree("factor", new Tree("VAR")); 
            case XOR:
            case NOT:
                if (lex.getCurToken() != Token.NOT) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }
                lex.nextToken();
                results.put("factor", factor());
                 return new Tree("factor", new Tree("NOT"), (Tree) results.get("factor")); 
            case END:
            case AND:
            case OR:
            default:
                throw new AssertionError();
        }
    }
    private Tree boolexp_prime() throws ParseException {
        HashMap<String, Object> results = new HashMap<String, Object>();
        switch (lex.getCurToken()) {

            case LEFT_PAREN:
            case RIGHT_PAREN:
                return null;

            case VAR:
            case XOR:
                if (lex.getCurToken() != Token.XOR) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }
                lex.nextToken();
                results.put("term", term());
                results.put("boolexp_prime", boolexp_prime());
                 return new Tree("boolexp_prime", new Tree("XOR"), (Tree) results.get("term"), (Tree) results.get("boolexp_prime")); 
            case NOT:
            case END:
                return null;

            case AND:
            case OR:
                if (lex.getCurToken() != Token.OR) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }
                lex.nextToken();
                results.put("term", term());
                results.put("boolexp_prime", boolexp_prime());
                 return new Tree("boolexp_prime", new Tree("OR"), (Tree) results.get("term"), (Tree) results.get("boolexp_prime")); 
            default:
                throw new AssertionError();
        }
    }
}
