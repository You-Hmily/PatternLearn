package com.hmily.pattern.singleton;

/**
 * ����ʽ
 * @author ��ũ
 *
 */
public class HungrySingleton {
	
private static HungrySingleton uniqueInstance=new HungrySingleton();
	
	private HungrySingleton(){}
	
	public static HungrySingleton getInstance(){
		return uniqueInstance;	
	}

}
