package com.hmily.pattern.strategy;

/**
 * Created by zyzhmily on 2018/5/19.
 * 模型鸭子实体
 */
public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new HeQuack();
    }

    @Override
    public void display() {
        //*****
    }
}
