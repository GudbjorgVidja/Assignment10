package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression {
    private List<MathExpression> leafs = new ArrayList<>();

    public int getResult() {
        int sum = 0;
        for (MathExpression child : leafs) {
            sum += child.getResult();
        }
        return sum;
    }

    public void add(MathExpression e) {
        leafs.add(e);
    }
}
