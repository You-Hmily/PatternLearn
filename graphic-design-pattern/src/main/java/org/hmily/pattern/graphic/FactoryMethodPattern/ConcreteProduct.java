package org.hmily.pattern.graphic.FactoryMethodPattern;

public class ConcreteProduct implements Product{


    @Override
    public Product createProduct() {
        return new ConcreteProduct();
    }
}
