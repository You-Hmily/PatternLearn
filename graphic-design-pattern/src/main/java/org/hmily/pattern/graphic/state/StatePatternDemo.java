package org.hmily.pattern.graphic.state;

public class StatePatternDemo {

    /**
     *  状态模式
     * @param args
     */
    public static void main(String[] args) {
        Context context=new Context(new ConcreteStateA());
        context.request();

    }

}
