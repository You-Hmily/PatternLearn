package org.hmily.pattern.headfirst.decorator;

/**
 * Created by zyzhmily on 2018/8/16.
 * 基础饮料类
 */
public abstract class Beverage {

    String description="Unknow Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();

}
