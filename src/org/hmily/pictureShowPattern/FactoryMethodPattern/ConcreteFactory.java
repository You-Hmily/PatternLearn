package org.hmily.pictureShowPattern.FactoryMethodPattern;

public class ConcreteFactory implements Factory{

    private Product product;


    public ConcreteFactory(Product product) {
        this.product=product;
    }

    @Override
    public Product createMethod() {
        return product.createProduct();
    }
}
