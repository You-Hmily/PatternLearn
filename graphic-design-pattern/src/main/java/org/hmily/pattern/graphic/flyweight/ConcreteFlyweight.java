package org.hmily.pattern.graphic.flyweight;

public class ConcreteFlyweight implements Flyweight{


    @Override
    public void operation() {
        System.out.println("** ConcreteFlyweight **");
    }
}
