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
            case RIGHT_PAREN:
                return new Tree("TERM_PRIME", trees.toArray(new Tree[trees.size()]));
            case VAR:
            case XOR:
                return new Tree("TERM_PRIME", trees.toArray(new Tree[trees.size()]));
            case NOT:
            case END:
                return new Tree("TERM_PRIME", trees.toArray(new Tree[trees.size()]));
            case AND:
                if (lex.getCurToken() != Token.AND) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }
                trees.add(new Tree("AND"));
                lex.nextToken();
                trees.add(factor());
                trees.add(term_prime());
                return new Tree("TERM_PRIME", trees.toArray(new Tree[trees.size()]));
            case OR:
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
            case VAR:
                trees.add(factor());
                trees.add(term_prime());
                return new Tree("TERM", trees.toArray(new Tree[trees.size()]));
            case XOR:
            case NOT:
                trees.add(factor());
                trees.add(term_prime());
                return new Tree("TERM", trees.toArray(new Tree[trees.size()]));
            case END:
            case AND:
            case OR:
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
            case VAR:
                trees.add(term());
                trees.add(boolexp_prime());
                return new Tree("BOOLEXP", trees.toArray(new Tree[trees.size()]));
            case XOR:
            case NOT:
                trees.add(term());
                trees.add(boolexp_prime());
                return new Tree("BOOLEXP", trees.toArray(new Tree[trees.size()]));
            case END:
            case AND:
            case OR:
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
                }
                trees.add(new Tree("LEFT_PAREN"));
                lex.nextToken();
                trees.add(boolexp());
                if (lex.getCurToken() != Token.RIGHT_PAREN) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }
                trees.add(new Tree("RIGHT_PAREN"));
                lex.nextToken();
                return new Tree("FACTOR", trees.toArray(new Tree[trees.size()]));
            case RIGHT_PAREN:
            case VAR:
                if (lex.getCurToken() != Token.VAR) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }
                trees.add(new Tree("VAR"));
                lex.nextToken();
                return new Tree("FACTOR", trees.toArray(new Tree[trees.size()]));
            case XOR:
            case NOT:
                if (lex.getCurToken() != Token.NOT) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }
                trees.add(new Tree("NOT"));
                lex.nextToken();
                trees.add(factor());
                return new Tree("FACTOR", trees.toArray(new Tree[trees.size()]));
            case END:
            case AND:
            case OR:
            default:
                throw new AssertionError();
        }
    }
    private Tree boolexp_prime() throws ParseException {
        List<Tree> trees = new ArrayList<Tree>();
        switch (lex.getCurToken()) {

            case LEFT_PAREN:
            case RIGHT_PAREN:
                return new Tree("BOOLEXP_PRIME", trees.toArray(new Tree[trees.size()]));
            case VAR:
            case XOR:
                if (lex.getCurToken() != Token.XOR) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }
                trees.add(new Tree("XOR"));
                lex.nextToken();
                trees.add(term());
                trees.add(boolexp_prime());
                return new Tree("BOOLEXP_PRIME", trees.toArray(new Tree[trees.size()]));
            case NOT:
            case END:
                return new Tree("BOOLEXP_PRIME", trees.toArray(new Tree[trees.size()]));
            case AND:
            case OR:
                if (lex.getCurToken() != Token.OR) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }
                trees.add(new Tree("OR"));
                lex.nextToken();
                trees.add(term());
                trees.add(boolexp_prime());
                return new Tree("BOOLEXP_PRIME", trees.toArray(new Tree[trees.size()]));
            default:
                throw new AssertionError();
        }
    }
}
