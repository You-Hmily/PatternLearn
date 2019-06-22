package org.hmily.pattern.graphic.state;

public class ConcreteStateA implements State{


    @Override
    public void handle() {
        System.out.println("ConcreteStateA  ");
    }
}
