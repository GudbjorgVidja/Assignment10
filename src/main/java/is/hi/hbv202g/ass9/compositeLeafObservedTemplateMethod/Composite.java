package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite implements MathExpression, Observer {
    //abstract superclass, sameiginlegur kóði
    //subclasses extends Composite

    protected List<MathExpression> leafs = new ArrayList<MathExpression>();

    private int lastObservedResult;


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
