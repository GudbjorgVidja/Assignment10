package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

public class MultiplyComposite extends Composite {

    public int getResult() {
        int sum = leafs.remove(0).getResult();
        for (MathExpression child : leafs) {
            sum *= child.getResult();
        }
        return sum;
    }
}
