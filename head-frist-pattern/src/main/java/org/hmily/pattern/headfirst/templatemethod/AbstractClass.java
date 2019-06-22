package org.hmily.pattern.headfirst.templatemethod;

/**
 * Created by zyzhmily on 2018/8/23.
 */
public abstract class AbstractClass {

    public void templateMethod(){
        method1();
        method2();
    }

    abstract void method1();

    abstract void method2();


}
