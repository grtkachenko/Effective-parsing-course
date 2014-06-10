import org.StructureGraphic.v1.DSutils;

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
        MyParser parser = new MyParser();
        DSutils.show(parser.parse(new FileInputStream("test/input")), 100, 50);
    }
}
