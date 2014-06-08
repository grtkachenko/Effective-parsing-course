import java.io.InputStream;
import java.text.ParseException;

public class MyParser{
    private LexicalAnalyzer lex;

    public Tree parse(InputStream is) throws ParseException {
        lex = new LexicalAnalyzer(is);
        lex.nextToken();
        return null;
    }
}
