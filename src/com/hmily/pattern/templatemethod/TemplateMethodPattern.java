package com.hmily.pattern.templatemethod;

/**
 * Created by zyzhmily on 2018/8/23.
 * 模板方法模式
 */
public class TemplateMethodPattern {

    public static void main(String[] args){
        ConcreteClass concreteClass=new ConcreteClass();
        concreteClass.templateMethod();
    }

}
