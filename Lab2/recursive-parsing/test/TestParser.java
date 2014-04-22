import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Map;
import java.util.TreeMap;

/**
 * User: gtkachenko
 */
public class TestParser {
    private static final String ROOT_TESTS = "test/test-suit/";
    private static Map<Integer, String> verdict;

    @BeforeClass
    public static void prepare() {
        verdict = new TreeMap<Integer, String>();
    }

    @AfterClass
    public static void printLog() {
        for (Integer curKey : verdict.keySet()) {
            System.out.println(verdict.get(curKey));
        }
    }

    @Test
    public void testOneDigit() {
        Assert.assertTrue(checkTest(1));
    }

    @Test
    public void testOneFailDigit() {
        Assert.assertFalse(checkTest(2));
    }

    @Test
    public void testNoOperands() {
        Assert.assertFalse(checkTest(3));
    }

    @Test
    public void testNoOperands2() {
        Assert.assertFalse(checkTest(4));
    }

    @Test
    public void testIncorrectBrackets() {
        Assert.assertFalse(checkTest(5));
    }

    @Test
    public void testIncorrectBrackets2() {
        Assert.assertFalse(checkTest(6));
    }

    @Test
    public void testWrongOperatorName() {
        Assert.assertFalse(checkTest(7));
    }

    @Test
    public void testWrongOperatorName2() {
        Assert.assertFalse(checkTest(8));
    }

    @Test
    public void testOperatorAfterNot() {
        Assert.assertFalse(checkTest(9));
    }

    @Test
    public void testMergedOperators() {
        Assert.assertFalse(checkTest(10));
    }

    @Test
    public void testWrongOperatorPosition() {
        Assert.assertFalse(checkTest(11));
    }

    @Test
    public void testWrongOperatorPosition2() {
        Assert.assertFalse(checkTest(12));
    }

    @Test
    public void testOk() {
        Assert.assertTrue(checkTest(13));
    }

    @Test
    public void testOk2() {
        Assert.assertTrue(checkTest(14));
    }

    @Test
    public void testOk3() {
        Assert.assertTrue(checkTest(15));
    }

    @Test
    public void testOk4() {
        Assert.assertTrue(checkTest(16));
    }

    @Test
    public void testOk5() {
        Assert.assertTrue(checkTest(17));
    }

    @Test
    public void testOk6() {
        Assert.assertTrue(checkTest(18));
    }

    private boolean checkTest(int fileNumber) {
        try {
            new Parser().parse(new FileInputStream(ROOT_TESTS + fileNumber + ".in"));
            verdict.put(fileNumber, String.format("Test # %3d correctly evaluated", fileNumber));
            return true;
        } catch (ParseException e) {
            verdict.put(fileNumber, String.format("Test # %3d failed with error : " + e, fileNumber));
            return false;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

}
