package org.hmily.pictureShowPattern.FactoryMethodPattern;

public class ConcreteProduct implements Product{


    @Override
    public Product createProduct() {
        return new ConcreteProduct();
    }
}
