package org.hmily.pictureShowPattern.flyweight;

public class ConcreteFlyweight implements Flyweight{


    @Override
    public void operation() {
        System.out.println("** ConcreteFlyweight **");
    }
}
