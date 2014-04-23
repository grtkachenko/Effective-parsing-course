import org.StructureGraphic.v1.DSutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;

/**
 * Created with IntelliJ IDEA.
 * User: gtkachenko
 * Date: 19.04.14
 * Time: 23:57
 */
public class Utils {
    private static final String ROOT_TESTS = "test/test-suit/";

    public static boolean showTestTree(int fileNumber) {
        if (getTree(fileNumber) != null) {
            DSutils.show(getTree(fileNumber), 100, 50);
            return true;
        }
        return false;
    }

    public static Tree getTree(int fileNumber) {
        try {
            return new BoolParser().parse(new FileInputStream(ROOT_TESTS + fileNumber + ".in"));
        } catch (ParseException e) {
            return null;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
