package org.hmily.pictureShowPattern.bridge;

public class RefinedAbstraction implements Abstraction{

    private Implementor implementor;

    public RefinedAbstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    @Override
    public void draw() {
        implementor.drawLine();
        implementor.drawCircle();
    }
}
