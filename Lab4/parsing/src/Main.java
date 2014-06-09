import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: gtkachenko
 * Date: 08.06.14
 * Time: 18:13
 */
public class Main {
    private static final String TEST_PATH = "grammars/testing_grammar/PascalBoolExpr";

    public static void main(String[] args) throws IOException {
        Generator generator = new Generator(new File(TEST_PATH));
        generator.generateFiles();
    }
}
