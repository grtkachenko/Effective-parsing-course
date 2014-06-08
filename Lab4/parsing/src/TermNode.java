import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: gtkachenko
 * Date: 08.06.14
 * Time: 20:13
 */
public class TermNode extends Node {
    private List<String> productionList = new ArrayList<String>();

    public TermNode(String name) {
        super(name);
    }

    public void addStringProductions(List<String> productions) {
        productionList.addAll(productions);
    }

    public void addStringProduction(String production) {
        productionList.add(production);
    }

    public List<String> getProductionList() {
        return productionList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name + " -> ");
        for (String cur : productionList) {
            stringBuilder.append(cur + " | ");
        }
        return stringBuilder.toString();
    }
}
