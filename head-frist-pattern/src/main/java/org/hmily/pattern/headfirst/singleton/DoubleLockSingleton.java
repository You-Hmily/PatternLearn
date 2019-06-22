package com.hmily.pattern.singleton;

/**
 * 双重加锁模式
 * @author zyzhmily
 *
 */
public class DoubleLockSingleton {
	
	private volatile static DoubleLockSingleton uniqueInstance;
	
	private DoubleLockSingleton(){}
	
    public static DoubleLockSingleton getInstance(){
    	if(uniqueInstance==null){
    		synchronized(DoubleLockSingleton.class){
    			if(uniqueInstance==null){
    				uniqueInstance=new DoubleLockSingleton();
    			}
    		}
    	}
    	
    	
		return uniqueInstance;	
	}

}
