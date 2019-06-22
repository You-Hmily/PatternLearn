package org.hmily.pattern.headfirst.singleton;

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
