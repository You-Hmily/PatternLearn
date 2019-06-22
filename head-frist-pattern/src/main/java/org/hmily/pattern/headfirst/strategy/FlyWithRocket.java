package com.hmily.pattern.strategy;

/**
 * Created by zyzhmily on 2018/5/19.
 */
public class FlyWithRocket implements FlyBehavior{

    @Override
    public void fly() {
         System.out.println("Fly With Rocket!!!");
    }
}
