package org.hmily.pictureShowPattern.bridge;

public class ConcreteImplementor implements Implementor{

    @Override
    public void drawLine() {
        System.out.println("直线");
    }

    @Override
    public void drawCircle() {
        System.out.println("圆");
    }
}
