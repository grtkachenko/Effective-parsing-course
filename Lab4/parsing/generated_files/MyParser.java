import java.io.InputStream;
import java.text.ParseException;
import java.util.*;

public class MyParser{
    private LexicalAnalyzer lex;

    public Tree parse(InputStream is) throws ParseException {
        lex = new LexicalAnalyzer(is);
        lex.nextToken();
        return boolexp();
    }

    private Tree term_prime() throws ParseException {
        List<Tree> trees = new ArrayList<Tree>();
        switch (lex.getCurToken()) {

            case LEFT_PAREN:
                return null;
            case RIGHT_PAREN:
                return null;
            case EPS:
                if (lex.getCurToken() != Token.EPS) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }                trees.add(new Tree("EPS"));
                lex.nextToken();
                return new Tree("TERM_PRIME", trees.toArray(new Tree[trees.size()]));
            case VAR:
                return null;
            case XOR:
                if (lex.getCurToken() != Token.EPS) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }                trees.add(new Tree("EPS"));
                lex.nextToken();
                return new Tree("TERM_PRIME", trees.toArray(new Tree[trees.size()]));
            case NOT:
                return null;
            case END:
                return null;
            case AND:
                if (lex.getCurToken() != Token.EPS) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }                trees.add(new Tree("EPS"));
                lex.nextToken();
                return new Tree("TERM_PRIME", trees.toArray(new Tree[trees.size()]));
            case OR:
                if (lex.getCurToken() != Token.EPS) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }                trees.add(new Tree("EPS"));
                lex.nextToken();
                return new Tree("TERM_PRIME", trees.toArray(new Tree[trees.size()]));
            default:
                throw new AssertionError();
        }
    }
    private Tree term() throws ParseException {
        List<Tree> trees = new ArrayList<Tree>();
        switch (lex.getCurToken()) {

            case LEFT_PAREN:
                trees.add(factor());
                trees.add(term_prime());
                return new Tree("TERM", trees.toArray(new Tree[trees.size()]));
            case RIGHT_PAREN:
                return null;
            case EPS:
                return null;
            case VAR:
                trees.add(factor());
                trees.add(term_prime());
                return new Tree("TERM", trees.toArray(new Tree[trees.size()]));
            case XOR:
                return null;
            case NOT:
                trees.add(factor());
                trees.add(term_prime());
                return new Tree("TERM", trees.toArray(new Tree[trees.size()]));
            case END:
                return null;
            case AND:
                return null;
            case OR:
                return null;
            default:
                throw new AssertionError();
        }
    }
    private Tree boolexp() throws ParseException {
        List<Tree> trees = new ArrayList<Tree>();
        switch (lex.getCurToken()) {

            case LEFT_PAREN:
                trees.add(term());
                trees.add(boolexp_prime());
                return new Tree("BOOLEXP", trees.toArray(new Tree[trees.size()]));
            case RIGHT_PAREN:
                return null;
            case EPS:
                return null;
            case VAR:
                trees.add(term());
                trees.add(boolexp_prime());
                return new Tree("BOOLEXP", trees.toArray(new Tree[trees.size()]));
            case XOR:
                return null;
            case NOT:
                trees.add(term());
                trees.add(boolexp_prime());
                return new Tree("BOOLEXP", trees.toArray(new Tree[trees.size()]));
            case END:
                return null;
            case AND:
                return null;
            case OR:
                return null;
            default:
                throw new AssertionError();
        }
    }
    private Tree factor() throws ParseException {
        List<Tree> trees = new ArrayList<Tree>();
        switch (lex.getCurToken()) {

            case LEFT_PAREN:
                if (lex.getCurToken() != Token.LEFT_PAREN) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }                trees.add(new Tree("LEFT_PAREN"));
                lex.nextToken();
                trees.add(boolexp());
                if (lex.getCurToken() != Token.RIGHT_PAREN) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }                trees.add(new Tree("RIGHT_PAREN"));
                lex.nextToken();
                return new Tree("FACTOR", trees.toArray(new Tree[trees.size()]));
            case RIGHT_PAREN:
                return null;
            case EPS:
                return null;
            case VAR:
                if (lex.getCurToken() != Token.LEFT_PAREN) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }                trees.add(new Tree("LEFT_PAREN"));
                lex.nextToken();
                trees.add(boolexp());
                if (lex.getCurToken() != Token.RIGHT_PAREN) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }                trees.add(new Tree("RIGHT_PAREN"));
                lex.nextToken();
                return new Tree("FACTOR", trees.toArray(new Tree[trees.size()]));
            case XOR:
                return null;
            case NOT:
                if (lex.getCurToken() != Token.LEFT_PAREN) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }                trees.add(new Tree("LEFT_PAREN"));
                lex.nextToken();
                trees.add(boolexp());
                if (lex.getCurToken() != Token.RIGHT_PAREN) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }                trees.add(new Tree("RIGHT_PAREN"));
                lex.nextToken();
                return new Tree("FACTOR", trees.toArray(new Tree[trees.size()]));
            case END:
                return null;
            case AND:
                return null;
            case OR:
                return null;
            default:
                throw new AssertionError();
        }
    }
    private Tree boolexp_prime() throws ParseException {
        List<Tree> trees = new ArrayList<Tree>();
        switch (lex.getCurToken()) {

            case LEFT_PAREN:
                return null;
            case RIGHT_PAREN:
                if (lex.getCurToken() != Token.EPS) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }                trees.add(new Tree("EPS"));
                lex.nextToken();
                return new Tree("BOOLEXP_PRIME", trees.toArray(new Tree[trees.size()]));
            case EPS:
                if (lex.getCurToken() != Token.EPS) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }                trees.add(new Tree("EPS"));
                lex.nextToken();
                return new Tree("BOOLEXP_PRIME", trees.toArray(new Tree[trees.size()]));
            case VAR:
                return null;
            case XOR:
                if (lex.getCurToken() != Token.EPS) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }                trees.add(new Tree("EPS"));
                lex.nextToken();
                return new Tree("BOOLEXP_PRIME", trees.toArray(new Tree[trees.size()]));
            case NOT:
                return null;
            case END:
                if (lex.getCurToken() != Token.EPS) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }                trees.add(new Tree("EPS"));
                lex.nextToken();
                return new Tree("BOOLEXP_PRIME", trees.toArray(new Tree[trees.size()]));
            case AND:
                return null;
            case OR:
                if (lex.getCurToken() != Token.EPS) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }                trees.add(new Tree("EPS"));
                lex.nextToken();
                return new Tree("BOOLEXP_PRIME", trees.toArray(new Tree[trees.size()]));
            default:
                throw new AssertionError();
        }
    }
}
