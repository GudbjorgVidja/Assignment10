package is.hi.hbv202g.ass9.composite;

public class NumberLeaf implements MathExpression {
    private int number = 10;

    public NumberLeaf(int n) {
        number = n;
    }

    public int getResult() {
        return number;
    }

    public static void main(String[] args) {

    }
}
