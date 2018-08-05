package com.hmily.pattern.strategy;

/**
 * Created by zyzhmily on 2018/5/19.
 */
public class PatternStrategy {


    public static void main(String[] args){

        Duck model=new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyNoWay());
        model.performFly();

    }
}
