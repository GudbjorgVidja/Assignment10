package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

public class PlusComposite extends Composite implements MathExpression, Observer {
    
    public int getResult() {
        int sum = 0;
        for (MathExpression child : leafs) {
            sum += child.getResult();
        }
        return sum;
    }
}
