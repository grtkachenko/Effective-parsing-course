import junit.framework.Assert;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;
import java.text.ParseException;
import java.util.Map;
import java.util.TreeMap;

/**
 * User: gtkachenko
 */
public class TestParser {
    private static final String ROOT_TESTS = "test/test-suit/";
    private static final int MIN_CORRECT_FILE_NUMBER = 14;
    private static final int MAX_CORRECT_FILE_NUMBER = 20;
    private static Map<Integer, String> verdict;
    private static Map<Integer, String> correctResult;
    private Tree lastTree;

    @BeforeClass
    public static void prepare() {
        verdict = new TreeMap<Integer, String>();
        correctResult = new TreeMap<Integer, String>();
        for (int i = MIN_CORRECT_FILE_NUMBER; i < MAX_CORRECT_FILE_NUMBER + 1; i++) {
            InputStream is;
            ANTLRInputStream input = null;
            try {
                is = new FileInputStream(new File(ROOT_TESTS + i + ".in"));
                input = new ANTLRInputStream(is);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }   catch (IOException e) {
                e.printStackTrace();
            }
            BoolExpressionsLexer lexer = new BoolExpressionsLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            BoolExpressionsParser parser = new BoolExpressionsParser(tokens);
            ParseTree tree = parser.prog().getChild(0);
            correctResult.put(i, tree.toStringTree(parser));
        }
    }

    private void checkOk(int fileNumber) {
        Assert.assertEquals(lastTree.toString(), correctResult.get(fileNumber));
    }

    @AfterClass
    public static void printLog() {
        for (Integer curKey : verdict.keySet()) {
            System.out.println(verdict.get(curKey));
        }
    }

    /**
     * correct one letter test
     */
    @Test
    public void testOneDigit() {
        Assert.assertTrue(checkTest(1));
    }

    /**
     * incorrect one letter test
     */
    @Test
    public void testOneFailDigit() {
        Assert.assertFalse(checkTest(2));
    }

    /**
     * expression with no operands and operatos
     */
    @Test
    public void testNoOperands() {
        Assert.assertFalse(checkTest(3));
    }

    /**
     * expression with no operands
     */
    @Test
    public void testNoOperands2() {
        Assert.assertFalse(checkTest(4));
    }

    /**
     * expression with wrong brackets number
     */
    @Test
    public void testIncorrectBrackets() {
        Assert.assertFalse(checkTest(5));
    }

    /**
     * expression with wrong brackets balance and number
     */
    @Test
    public void testIncorrectBrackets2() {
        Assert.assertFalse(checkTest(6));
    }

    /**
     * space missing before operator
     */
    @Test
    public void testWrongOperatorName() {
        Assert.assertFalse(checkTest(7));
    }

    /**
     * incorrect operator name
     */
    @Test
    public void testWrongOperatorName2() {
        Assert.assertFalse(checkTest(8));
    }

    /**
     * have operator after "not"
     */
    @Test
    public void testOperatorAfterNot() {
        Assert.assertFalse(checkTest(9));
    }

    /**
     * spaces missing in expression
     */
    @Test
    public void testMergedOperators() {
        Assert.assertFalse(checkTest(10));
    }

    /**
     * missing argument for "not" operator
     */
    @Test
    public void testWrongOperatorPosition() {
        Assert.assertFalse(checkTest(11));
    }

    /**
     * missing right argument for "xor" operator
     */
    @Test
    public void testWrongOperatorPosition2() {
        Assert.assertFalse(checkTest(12));
    }

    /**
     * correct number, but incorrect balance
     */
    @Test
    public void testIncorrectBrackets3() {
        Assert.assertFalse(checkTest(13));
    }

    @Test
    public void testOk2() {
        Assert.assertTrue(checkTest(14));
        checkOk(14);
    }

    @Test
    public void testOk3() {
        Assert.assertTrue(checkTest(15));
        checkOk(15);
    }

    @Test
    public void testOk4() {
        Assert.assertTrue(checkTest(16));
        checkOk(16);
    }

    @Test
    public void testOk5() {
        Assert.assertTrue(checkTest(17));
        checkOk(17);
    }

    @Test
     public void testOk6() {
        Assert.assertTrue(checkTest(18));
        checkOk(18);
    }

    @Test
    public void testOk7() {
        Assert.assertTrue(checkTest(19));
        checkOk(19);
    }

    @Test
    public void testOk8() {
        Assert.assertTrue(checkTest(20));
        checkOk(20);
    }

    private boolean checkTest(int fileNumber) {
        try {
            lastTree = new BoolParser().parse(new FileInputStream(ROOT_TESTS + fileNumber + ".in"));
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
