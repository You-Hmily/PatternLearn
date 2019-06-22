package org.hmily.pattern.headfirst.strategy;

/**
 * Created by zyzhmily on 2018/5/19.
 * 鸭子实体
 */
public class Duck {

    public FlyBehavior flyBehavior;

    public QuackBehavior quackBehavior;


    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){

    }

    public void display(){

    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
