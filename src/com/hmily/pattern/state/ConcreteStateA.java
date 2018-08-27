package com.hmily.pattern.state;

/**
 * Created by zyzhmily on 2018/8/27.
 */
public class ConcreteStateA implements State{
    @Override
    public void handle() {
        System.out.println("ConcreteStateA");
    }
}
