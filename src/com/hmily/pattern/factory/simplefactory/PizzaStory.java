package com.hmily.pattern.factory.simplefactory;

/**
 * ≈˚»¯…ÃµÍ
 * @author zyzhmily
 *
 */
public class PizzaStory{

	
	SimplePizzaFactory factory;
	
	public PizzaStory(SimplePizzaFactory factory){
		this.factory=factory;
	}
	
	Pizza orderPizza(String type){
		
		Pizza pizza;
		
		pizza=factory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
}
