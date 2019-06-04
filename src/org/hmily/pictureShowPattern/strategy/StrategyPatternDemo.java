package org.hmily.pictureShowPattern.strategy;

public class StrategyPatternDemo {

    /**
     * 策略模式
     * @param args
     */
    public static void main(String[] args) {
        Context context=new Context();
        context.setStrategy(new ConcreteStrategyA());
        context.algorithm();
    }

}
