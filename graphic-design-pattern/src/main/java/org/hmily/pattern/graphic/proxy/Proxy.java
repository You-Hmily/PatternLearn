package org.hmily.pattern.graphic.proxy;

public class Proxy implements Subject{

    private Subject realSubject;

    public Proxy(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void operation() {
           realSubject.operation();
    }
}
