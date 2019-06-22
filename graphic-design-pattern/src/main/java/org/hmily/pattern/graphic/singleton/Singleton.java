package org.hmily.pattern.graphic.singleton;

public class Singleton {

    private static Singleton singleton;

    public static Singleton getInstance(){
        if (null==singleton){
            singleton=new Singleton();
        }
        return singleton;
    }

}
