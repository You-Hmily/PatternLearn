package com.hmily.pattern.singleton;

/**
 * ¶öººÊ½
 * @author ÂëÅ©
 *
 */
public class HungrySingleton {
	
private static HungrySingleton uniqueInstance=new HungrySingleton();
	
	private HungrySingleton(){}
	
	public static HungrySingleton getInstance(){
		return uniqueInstance;	
	}

}
