import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: gtkachenko
 * Date: 19.04.14
 * Time: 23:05
 */
public class Vizualizator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fileNumber;
        if (!Utils.showTestTree(fileNumber = scanner.nextInt())) {
            System.out.println("Incorrect input in \"" + fileNumber + ".in\"");
        }
    }
}
