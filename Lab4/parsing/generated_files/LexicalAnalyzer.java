import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;

public class LexicalAnalyzer{
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
        return c == -1 || c == ' ' || c == '\r' || c == '\n' || c == '\t';
    }

    private void nextChar() throws ParseException {
        curPos++;
        try {
            curChar = is.read();
        } catch (IOException e) {
            throw new ParseException(e.getMessage(), curPos);
        }
    }
    public Token getCurToken() {
        return curToken;
    }

    public int getCurPos() {
        return curPos;
    }

    public void nextToken() throws ParseException {
        if (curChar == -1) {
            curToken = Token.END;
            return;
        }
        while (isBlank(curChar)) {
            nextChar();
        }

        StringBuilder curTokenStringBuilder = new StringBuilder();
        curTokenStringBuilder.append((char) curChar);

        if (curChar >= 'a' && curChar <= 'z') {
            nextChar();
            while (!isBlank(curChar) && (curChar != '(') && (curChar != ')')) {
                curTokenStringBuilder.append((char) curChar);
                nextChar();
            }
        } else {
            nextChar();
        }
        String curTokenString = curTokenStringBuilder.toString();

        if ("(".equals(curTokenString)) {
            curToken = Token.LEFT_PAREN;
            return;
        }

        if (")".equals(curTokenString)) {
            curToken = Token.RIGHT_PAREN;
            return;
        }

        if ("".equals(curTokenString)) {
            curToken = Token.EPS;
            return;
        }

        if ("".equals(curTokenString)) {
            curToken = Token.EPS;
            return;
        }

        if ("a".equals(curTokenString)) {
            curToken = Token.VAR;
            return;
        }

        if ("b".equals(curTokenString)) {
            curToken = Token.VAR;
            return;
        }

        if ("c".equals(curTokenString)) {
            curToken = Token.VAR;
            return;
        }

        if ("d".equals(curTokenString)) {
            curToken = Token.VAR;
            return;
        }

        if ("xor".equals(curTokenString)) {
            curToken = Token.XOR;
            return;
        }

        if ("not".equals(curTokenString)) {
            curToken = Token.NOT;
            return;
        }

        if ("$".equals(curTokenString)) {
            curToken = Token.END;
            return;
        }

        if ("and".equals(curTokenString)) {
            curToken = Token.AND;
            return;
        }

        if ("or".equals(curTokenString)) {
            curToken = Token.OR;
            return;
        }

    }
}
