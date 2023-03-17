package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression {
    private List<MathExpression> leafs = new ArrayList<MathExpression>();

    public int getResult() {
        int sum = leafs.remove(0).getResult();
        for (MathExpression child : leafs) {
            sum += child.getResult();
        }
        return sum;
    }

    public void add(MathExpression e) {
        leafs.add(e);
    }

    public static void main(String[] args) {

    }
}
