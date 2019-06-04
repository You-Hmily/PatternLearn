package org.hmily.pictureShowPattern.proxy;

public class RealSubject implements Subject{


    @Override
    public void operation() {
        System.out.println("### RealSubject");
    }
}
