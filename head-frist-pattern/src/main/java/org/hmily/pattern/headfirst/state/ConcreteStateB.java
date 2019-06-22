package org.hmily.pattern.headfirst.state;

/**
 * Created by zyzhmily on 2018/8/27.
 */
public class ConcreteStateB implements State{
    @Override
    public void handle() {
        System.out.println("ConcreteStateB");
    }
}
