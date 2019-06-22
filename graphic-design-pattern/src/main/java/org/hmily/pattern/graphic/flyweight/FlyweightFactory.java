package org.hmily.pattern.graphic.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static Map<String,Flyweight> flyweights=new HashMap<>();

    public static Flyweight getFlyweight(String key) {
        return flyweights.get(key);
    }

    public static void  registerFlyweight(String key,Flyweight flyweight){
        flyweights.put(key,flyweight);
    }


}
