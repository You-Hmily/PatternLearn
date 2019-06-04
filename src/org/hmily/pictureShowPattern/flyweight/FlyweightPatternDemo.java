package org.hmily.pictureShowPattern.flyweight;

public class FlyweightPatternDemo {


    /**
     * 享元模式
     * @param args
     */
    public static void main(String[] args) {
           Flyweight flyweight1=new ConcreteFlyweight();
           FlyweightFactory.registerFlyweight("SHARE",flyweight1);
           Flyweight flyweight=FlyweightFactory.getFlyweight("SHARE");
           flyweight.operation();
    }

}
