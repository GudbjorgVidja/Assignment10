package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression, Observer {

    private List<MathExpression> leafs = new ArrayList<MathExpression>();

    private int lastObservedResult;

    public int getResult() {
        int sum = leafs.remove(0).getResult();
        for (MathExpression child : leafs) {
            sum *= child.getResult();
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
