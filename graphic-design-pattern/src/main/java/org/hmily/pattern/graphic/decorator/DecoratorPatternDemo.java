package org.hmily.pattern.graphic.decorator;

public class DecoratorPatternDemo {


    /**
     *  装饰者模式
     * @param args
     */
    public static void main(String[] args) {
        Component c1=new ConcreteComponent();
        Component c2=new ConcreteComponentA(c1);
        c1.method1();
        c2.method1();
    }

}
