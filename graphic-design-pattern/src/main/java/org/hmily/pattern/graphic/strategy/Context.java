package org.hmily.pattern.graphic.strategy;

public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void algorithm(){
        strategy.algorithm();
    }
}
