package org.hmily.pattern.headfirst.singleton;

/**
 * ˫�ؼ���ģʽ
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
