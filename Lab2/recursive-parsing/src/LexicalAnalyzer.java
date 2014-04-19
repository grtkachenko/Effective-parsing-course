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
                    throw new ParseException("Illegal character" + (char) curChar, curPos);
                }
                switch (curChar) {
                    case 'a':
                        curToken = checkForWord("and") ? Token.AND : Token.CHAR;
                        break;
                    case 'x':
                        curToken = checkForWord("xor") ? Token.XOR : Token.CHAR;
                        break;
                    case 'o':
                        curToken = checkForWord("or") ? Token.OR : Token.CHAR;
                        break;
                    case 'n':
                        curToken = checkForWord("not") ? Token.NOT : Token.CHAR;
                        break;
                    default:
                        nextChar();
                        curToken = Token.CHAR;

                }
        }
    }

    private boolean isLetter(int c) {
        return c >= 'a' && c <= 'z';
    }

    private boolean checkForWord(String word) throws ParseException{
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c != curChar) {
                if (isLetter(curChar) || i > 1) {
                    throw new ParseException("Illegal characters" + (char) curChar, curPos);
                }
                return false;
            }
            nextChar();
        }
        return true;
    }

    public Token curToken() {
        return curToken;
    }

    public int curPos() {
        return curPos();
    }
}
