import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;

/**
 * Created with IntelliJ IDEA.
 * User: gtkachenko
 * Date: 09.06.14
 * Time: 3:13
 */
public class Test {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        LexicalAnalyzer lexer = new LexicalAnalyzer(new FileInputStream("test/input"));
        while (lexer.getCurToken() != Token.END) {
            lexer.nextToken();
            System.out.println(lexer.getCurToken().toString());
        }
    }
}
