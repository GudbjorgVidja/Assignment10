package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

public class NumberLeaf extends Observable implements MathExpression {
    private int number;

    public NumberLeaf(int n) {
        number = n;
    }

    public void setValue(int n) {
        number = n;
        notifyObservers();
    }

    public int getResult() {
        return number;
    }

}
