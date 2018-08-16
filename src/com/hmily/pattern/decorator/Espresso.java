package com.hmily.pattern.decorator;

/**
 * Created by zyzhmily on 2018/8/16.
 * 扩展饮料类
 */
public class Espresso extends Beverage{

    public Espresso() {
        description="Espresso";
    }

    @Override
    public double cost() {
        return 0.1;
    }
}
