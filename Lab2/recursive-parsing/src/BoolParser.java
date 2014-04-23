import java.io.InputStream;
import java.text.ParseException;

/**
 * Created with IntelliJ IDEA.
 * User: gtkachenko
 * Date: 19.04.14
 * Time: 17:38
 */
public class BoolParser {
    private LexicalAnalyzer lex;

    public Tree parse(InputStream is) throws ParseException {
        lex = new LexicalAnalyzer(is);
        lex.nextToken();
        return boolExpr();
    }

    private Tree boolExpr() throws ParseException {
        switch (lex.getCurToken()) {
            case LPAREN:
                return parseBoolExpr(false);
            case CHAR:
                return parseBoolExpr(false);
            case NOT:
                return parseBoolExpr(false);
            default:
                throw new ParseException("BoolExpression can't start with token " + lex.getCurToken(), lex.getCurPos());
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
        switch (lex.getCurToken()) {
            case XOR:
                lex.nextToken();
                return parseBoolExpr(true, new Tree(Tree.XOR));
            case OR:
                lex.nextToken();
                return parseBoolExpr(true, new Tree(Tree.OR));
            case END:
                return new Tree(Tree.BOOLEXP_PRIME, new Tree(Tree.EPSILON, true));
            case RPAREN:
                return new Tree(Tree.BOOLEXP_PRIME, new Tree(Tree.EPSILON, true));
            default:
                throw new AssertionError();
        }
    }

    private Tree term() throws ParseException {
        switch (lex.getCurToken()) {
            case LPAREN:
                return parseTerm(false);
            case CHAR:
                return parseTerm(false);
            case NOT:
                return parseTerm(false);
            default:
                throw new ParseException("Term can't start with token " + lex.getCurToken(), lex.getCurPos());
        }
    }

    private Tree parseTerm(boolean isPrime) throws ParseException {
        return new Tree(isPrime ? Tree.TERM_PRIME : Tree.TERM, factor(), termPrime());
    }

    private Tree parseTerm(boolean isPrime, Tree firstChild) throws ParseException {
        return new Tree(isPrime ? Tree.TERM_PRIME : Tree.TERM, firstChild, factor(), termPrime());
    }

    private Tree termPrime() throws ParseException {
        switch (lex.getCurToken()) {
            case AND:
                lex.nextToken();
                return parseTerm(true, new Tree(Tree.AND));
            case END:
                return new Tree(Tree.TERM_PRIME, new Tree(Tree.EPSILON, true));
            case RPAREN:
                return new Tree(Tree.TERM_PRIME, new Tree(Tree.EPSILON, true));
            case XOR:
                return new Tree(Tree.TERM_PRIME, new Tree(Tree.EPSILON, true));
            case OR:
                return new Tree(Tree.TERM_PRIME, new Tree(Tree.EPSILON, true));

            default:
                throw new ParseException("Token " + lex.getCurToken() + " not expected at TERM", lex.getCurPos());
        }
    }

    private Tree factor() throws ParseException {
        switch (lex.getCurToken()) {
            case CHAR:
                lex.nextToken();
                return new Tree(Tree.FACTOR, new Tree("" + lex.getLastOperandChar()));
            case NOT:
                lex.nextToken();
                return new Tree(Tree.FACTOR, new Tree(Tree.NOT), factor());
            case LPAREN:
                lex.nextToken();
                Tree expr = boolExpr();
                if (lex.getCurToken() != Token.RPAREN) {
                    throw new ParseException(") expected at position " + lex.getCurPos(), lex.getCurPos());
                }
                lex.nextToken();

                return new Tree(Tree.FACTOR, new Tree("("), expr, new Tree(")"));
            default:
                throw new ParseException("Factor can't start with token " + lex.getCurToken(), lex.getCurPos());
        }
    }

}
