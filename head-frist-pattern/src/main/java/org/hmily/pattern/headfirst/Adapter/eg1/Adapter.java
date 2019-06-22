package org.hmily.pattern.headfirst.Adapter.eg1;

/**
 * Created by zyzhmily on 2018/8/23.
 */
public class Adapter implements Target{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee=adaptee;
    }

    @Override
    public void request() {
           adaptee.specificRequest();
    }
}
