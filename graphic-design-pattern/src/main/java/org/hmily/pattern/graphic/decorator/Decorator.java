package org.hmily.pattern.graphic.decorator;

public class Decorator implements  Component{

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void method1() {
        System.out.println("Decorator!!!");
        component.method1();
    }


}
