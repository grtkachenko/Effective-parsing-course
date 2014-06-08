import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: gtkachenko
 * Date: 09.06.14
 * Time: 2:15
 */
public class Tree  {
    private String nodeName;
    private List<Tree> children;

    public Tree(String nodeName, Tree... children) {
        this.nodeName = nodeName;
        this.children = Arrays.asList(children);
    }

    public Tree(String nodeName) {
        this.nodeName = nodeName;
    }

}
