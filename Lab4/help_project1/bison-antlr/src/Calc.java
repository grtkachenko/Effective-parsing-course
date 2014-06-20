import org.StructureGraphic.v1.DSutils;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * User: gtkachenko
 * Date: 20.04.14
 * Time: 1:24
 */
public class Calc {
    private static final String DEFAULT_TEST_NAME = "input";

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream(new File(DEFAULT_TEST_NAME));
        ANTLRInputStream input = new ANTLRInputStream(is);
        BoolExpressionsLexer lexer = new BoolExpressionsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BoolExpressionsParser parser = new BoolExpressionsParser(tokens);
        DSutils.show(parser.pascal_exp().tree, 100, 50);;
    }
}
