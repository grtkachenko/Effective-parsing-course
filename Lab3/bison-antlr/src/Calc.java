import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: gtkachenko
 * Date: 20.04.14
 * Time: 1:24
 */
public class Calc {
    private static final String DEFAULT_TEST_NAME = "input";

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream(new File(DEFAULT_TEST_NAME));;
        ANTLRInputStream input = new ANTLRInputStream(is);
        ArithmeticExpressionsLexer lexer = new ArithmeticExpressionsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ArithmeticExpressionsParser parser = new ArithmeticExpressionsParser(tokens);
        ParseTree tree = parser.boolexp();
        System.out.println(tree.toStringTree(parser));

    }
}
