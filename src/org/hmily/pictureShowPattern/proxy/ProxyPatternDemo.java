package org.hmily.pictureShowPattern.proxy;

public class ProxyPatternDemo {


    /**
     *  代理模式
     * @param args
     */
    public static void main(String[] args) {
           Subject subject=new Proxy(new RealSubject());

           subject.operation();
    }
}
