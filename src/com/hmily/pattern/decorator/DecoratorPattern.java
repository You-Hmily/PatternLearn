package com.hmily.pattern.decorator;

import com.hmily.pattern.observer.CurrentConditionsDisplay;
import com.hmily.pattern.observer.WeatherData;

/**
 * Created by zyzhmily on 2018/5/20.
 * 装饰者模式测试类
 */
public class DecoratorPattern {

    public static void main(String[] args){

        Beverage beverage01=new Espresso();
        System.out.println("Description:"+beverage01.getDescription()+" , $:"+beverage01.cost());
        Beverage beverage02=new Mocha(beverage01);
        System.out.println("Description:"+beverage02.getDescription()+" , $:"+beverage02.cost());
    }

}
