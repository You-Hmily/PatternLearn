package org.hmily.pattern.headfirst.decorator;

/**
 * Created by Administrator on 2018/8/16.
 * 装饰者扩展类
 */
public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" add Mocha";
    }

    @Override
    public double cost() {
        return 0.1+beverage.cost();
    }
}
