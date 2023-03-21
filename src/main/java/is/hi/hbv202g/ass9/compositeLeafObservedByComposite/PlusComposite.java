package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression, Observer {
    private List<MathExpression> leafs = new ArrayList<>();

    private int lastObservedResult;

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

    public void update() {
        lastObservedResult = getResult();
        System.out.println("last observed result: " + lastObservedResult);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}
