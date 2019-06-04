package org.hmily.pictureShowPattern.bridge;

public class BridgePatternDemo {

    public static void main(String[] args) {
        Implementor implementor=new ConcreteImplementor();
        RefinedAbstraction refinedAbstraction=new RefinedAbstraction(implementor);
        refinedAbstraction.draw();
        System.out.println("执行完成！！！！");
    }

}
