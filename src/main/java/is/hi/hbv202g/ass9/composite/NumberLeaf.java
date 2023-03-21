package is.hi.hbv202g.ass9.composite;

public class NumberLeaf implements MathExpression {
    private int number;

    public NumberLeaf(int n) {
        number = n;
    }

    public int getResult() {
        return number;
    }
}
