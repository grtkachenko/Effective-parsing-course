/**
 * Created with IntelliJ IDEA.
 * User: gtkachenko
 * Date: 08.06.14
 * Time: 20:13
 */
public class Node {
    protected String name;
    protected boolean isTerminal;

    public Node(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        return (getClass() == o.getClass() && name.equals(((Node) o).name));
    }

    public boolean isTerminal() {
        return isTerminal;
    }
}
