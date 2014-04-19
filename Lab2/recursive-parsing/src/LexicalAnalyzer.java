import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;


/**
 * Created with IntelliJ IDEA.
 * User: gtkachenko
 * Date: 19.04.14
 * Time: 17:09
 */
public class LexicalAnalyzer {
    private InputStream is;
    private int curChar;
    private int curPos;
    private Token curToken;
    private char lastOperandChar;

    public LexicalAnalyzer(InputStream is) throws ParseException {
        this.is = is;
        curPos = 0;
        nextChar();
    }

    private boolean isBlank(int c) {
        return c == ' ' || c == '\r' || c == '\n' || c == '\t';
    }

    private void nextChar() throws ParseException {
        curPos++;
        try {
            curChar = is.read();
        } catch (IOException e) {
            throw new ParseException(e.getMessage(), curPos);
        }
    }

    public void nextToken() throws ParseException {
        while (isBlank(curChar)) {
            nextChar();
        }
        switch (curChar) {
            case '(':
                nextChar();
                curToken = Token.LPAREN;
                break;
            case ')':
                nextChar();
                curToken = Token.RPAREN;
                break;
            case -1:
                curToken = Token.END;
                break;
            default:
                if (!isLetter(curChar)) {
                    throw new ParseException("Illegal character : \"" + (char) curChar + "\"", curPos);
                }
                char prevLastOperandChar = lastOperandChar;
                lastOperandChar = (char) curChar;
                switch (curChar) {
                    case 'a':
                        curToken = checkForWord(Tree.AND) ? Token.AND : Token.CHAR;
                        break;
                    case 'x':
                        curToken = checkForWord(Tree.XOR) ? Token.XOR : Token.CHAR;
                        break;
                    case 'o':
                        curToken = checkForWord(Tree.OR) ? Token.OR : Token.CHAR;
                        break;
                    case 'n':
                        curToken = checkForWord(Tree.NOT) ? Token.NOT : Token.CHAR;
                        break;
                    default:
                        nextChar();
                        curToken = Token.CHAR;

                }
                if (isLetter(curChar)) {
                    throw new ParseException("Illegal character : \"" + (char) curChar + "\"; expected non-letter character after " + curToken + " token; position = " + curPos, curPos);
                }
                if (curToken != Token.CHAR) {
                    lastOperandChar = prevLastOperandChar;
                }
        }
    }

    private boolean isLetter(int c) {
        return c >= 'a' && c <= 'z';
    }

    private boolean checkForWord(String word) throws ParseException{
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != curChar) {
                if (isLetter(curChar) || i > 1) {
                    throw new ParseException(String.format("Illegal character at position %d; expected : \"%s\", actual : \"%s\"", curPos, word.charAt(i), (char) curChar), curPos);
                }
                return false;
            }
            nextChar();
        }
        return true;
    }

    public Token getCurToken() {
        return curToken;
    }

    public int getCurPos() {
        return curPos;
    }

    public char getLastOperandChar() {
        return lastOperandChar;
    }
}
