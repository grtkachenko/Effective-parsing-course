import java.io.InputStream;
import java.text.ParseException;

/**
 * Created with IntelliJ IDEA.
 * User: gtkachenko
 * Date: 19.04.14
 * Time: 17:38
 */
public class Parser {
    private LexicalAnalyzer lex;

    public Tree parse(InputStream is) throws ParseException {
        lex = new LexicalAnalyzer(is);
        lex.nextToken();
        return boolExpr();
    }

    private Tree boolExpr() throws ParseException {
        switch (lex.curToken()) {
            case LPAREN:
                return parseBoolExpr("BOOLEXP");
            case CHAR:
                return parseBoolExpr("BOOLEXP");
            case NOT:
                return parseBoolExpr("BOOLEXP");
            default:
                throw new AssertionError();
        }
    }

    private Tree parseBoolExpr(String name) throws ParseException {
        Tree term = term();
        Tree boolExprPrime = boolExprPrime();
        return new Tree(name, term, boolExprPrime);
    }

    private Tree parseBoolExpr(String name, Tree firstChild) throws ParseException {
        return new Tree(name, firstChild, term(), boolExprPrime());
    }

    private Tree boolExprPrime() throws ParseException {
        switch (lex.curToken()) {
            case XOR:
                lex.nextToken();
                return parseBoolExpr("BOOLEXP'", new Tree("xor"));
            case OR:
                lex.nextToken();
                return parseBoolExpr("BOOLEXP'", new Tree("or"));
            case END:
                return new Tree("BOOLEXP'", new Tree("epsilon"));
            case RPAREN:
                return new Tree("BOOLEXP'", new Tree("epsilon"));
            default:
                throw new AssertionError();
        }
    }

    private Tree term() throws ParseException {
        switch (lex.curToken()) {
            case LPAREN:
                return parseTerm("TERM");
            case CHAR:
                return parseTerm("TERM");
            case NOT:
                return parseTerm("TERM");
            default:
                throw new AssertionError();
        }
    }

    private Tree parseTerm(String name) throws ParseException {
        Tree factor = factor();
        Tree termPrime = termPrime();
        return new Tree(name, factor, termPrime);
    }

    private Tree parseTerm(String name, Tree firstChild) throws ParseException {
        return new Tree(name, firstChild, factor(), termPrime());
    }

    private Tree termPrime() throws ParseException {
        switch (lex.curToken()) {
            case AND:
                lex.nextToken();
                return parseTerm("TERM'", new Tree("and"));
            case END:
                return new Tree("TERM'", new Tree("epsilon"));
            case RPAREN:
                return new Tree("TERM'", new Tree("epsilon"));
            case XOR:
                return new Tree("TERM'", new Tree("epsilon"));
            case OR:
                return new Tree("TERM'", new Tree("epsilon"));

            default:
                throw new AssertionError();
        }
    }

    private Tree factor() throws ParseException {
        switch (lex.curToken()) {
            case CHAR:
                lex.nextToken();
                return new Tree("FACTOR", new Tree("CHAR"));
            case NOT:
                lex.nextToken();
                return new Tree("FACTOR", new Tree("not"), factor());
            case LPAREN:
                lex.nextToken();
                Tree expr = boolExpr();
                if (lex.curToken() != Token.RPAREN) {
                    throw new ParseException(") expected at position", lex.curPos());
                }
                lex.nextToken();

                return new Tree("FACTOR", new Tree("("), expr, new Tree(")"));
            default:
                throw new AssertionError();
        }
    }

}
