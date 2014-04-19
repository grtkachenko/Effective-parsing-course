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
                return parseBoolExpr(false);
            case CHAR:
                return parseBoolExpr(false);
            case NOT:
                return parseBoolExpr(false);
            default:
                throw new AssertionError();
        }
    }

    private Tree parseBoolExpr(boolean isPrime) throws ParseException {
        Tree term = term();
        Tree boolExprPrime = boolExprPrime();
        return new Tree(isPrime ? Tree.BOOLEXP_PRIME : Tree.BOOLEXP, term, boolExprPrime);
    }

    private Tree parseBoolExpr(boolean isPrime, Tree firstChild) throws ParseException {
        return new Tree(isPrime ? Tree.BOOLEXP_PRIME : Tree.BOOLEXP, firstChild, term(), boolExprPrime());
    }

    private Tree boolExprPrime() throws ParseException {
        switch (lex.curToken()) {
            case XOR:
                lex.nextToken();
                return parseBoolExpr(true, new Tree(Tree.XOR));
            case OR:
                lex.nextToken();
                return parseBoolExpr(true, new Tree(Tree.OR));
            case END:
                return new Tree(Tree.BOOLEXP_PRIME, new Tree(Tree.EPSILON));
            case RPAREN:
                return new Tree(Tree.BOOLEXP_PRIME, new Tree(Tree.EPSILON));
            default:
                throw new AssertionError();
        }
    }

    private Tree term() throws ParseException {
        switch (lex.curToken()) {
            case LPAREN:
                return parseTerm(false);
            case CHAR:
                return parseTerm(false);
            case NOT:
                return parseTerm(false);
            default:
                throw new AssertionError();
        }
    }

    private Tree parseTerm(boolean isPrime) throws ParseException {
        return new Tree(isPrime ? Tree.TERM_PRIME : Tree.TERM, factor(), termPrime());
    }

    private Tree parseTerm(boolean isPrime, Tree firstChild) throws ParseException {
        return new Tree(isPrime ? Tree.TERM_PRIME : Tree.TERM, firstChild, factor(), termPrime());
    }

    private Tree termPrime() throws ParseException {
        switch (lex.curToken()) {
            case AND:
                lex.nextToken();
                return parseTerm(true, new Tree(Tree.AND));
            case END:
                return new Tree(Tree.TERM_PRIME, new Tree(Tree.EPSILON));
            case RPAREN:
                return new Tree(Tree.TERM_PRIME, new Tree(Tree.EPSILON));
            case XOR:
                return new Tree(Tree.TERM_PRIME, new Tree(Tree.EPSILON));
            case OR:
                return new Tree(Tree.TERM_PRIME, new Tree(Tree.EPSILON));

            default:
                throw new AssertionError();
        }
    }

    private Tree factor() throws ParseException {
        switch (lex.curToken()) {
            case CHAR:
                lex.nextToken();
                return new Tree(Tree.FACTOR, new Tree("" + lex.getLastOperandChar()));
            case NOT:
                lex.nextToken();
                return new Tree(Tree.FACTOR, new Tree(Tree.NOT), factor());
            case LPAREN:
                lex.nextToken();
                Tree expr = boolExpr();
                if (lex.curToken() != Token.RPAREN) {
                    throw new ParseException(") expected at position", lex.curPos());
                }
                lex.nextToken();

                return new Tree(Tree.FACTOR, new Tree("("), expr, new Tree(")"));
            default:
                throw new AssertionError();
        }
    }

}
