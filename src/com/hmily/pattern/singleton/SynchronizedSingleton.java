package com.hmily.pattern.singleton;

/**
 * 线程安全模式
 * @author 码农
 *
 */
public class SynchronizedSingleton {
	
	private static SynchronizedSingleton uniqueInstance;
	
	private SynchronizedSingleton(){}
	
	public static synchronized SynchronizedSingleton getInstance(){
		if(uniqueInstance==null){
			uniqueInstance=new SynchronizedSingleton();
		}
		return uniqueInstance;
	}

}
