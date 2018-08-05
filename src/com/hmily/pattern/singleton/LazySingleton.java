package com.hmily.pattern.singleton;


/**
 * ¿¡∫∫ Ω
 * @author ¬Î≈©
 *
 */
public class LazySingleton {

	private static LazySingleton uniqueInstance;
	
	private LazySingleton(){}
	
	public static LazySingleton getInstance(){
		if(uniqueInstance==null){
			uniqueInstance=new  LazySingleton();
		}
		return uniqueInstance;	
	}
	
}
