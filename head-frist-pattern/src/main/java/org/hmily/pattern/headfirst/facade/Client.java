package org.hmily.pattern.headfirst.facade;

/**
 * Created by zyzhmily on 2018/8/23.
 */
public class Client {

    private Facade facade;

    public Client(Facade facade) {
        this.facade = facade;
    }

    public void get(){
        facade.getMethod();
    }
}
