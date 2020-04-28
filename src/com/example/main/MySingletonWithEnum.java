package com.example.main;

import java.lang.reflect.Constructor;

public class MySingletonWithEnum {

	public static void main(String[] args) {
		SingletonEnum instance = SingletonEnum.INSTANCE;
		System.out.println(SingletonEnum.INSTANCE);
		SingletonEnum instance2=null;
		System.out.println(instance.hashCode());
		System.out.println(instance.getValue());
		
		Constructor<SingletonEnum>[] constructors = (Constructor<SingletonEnum>[]) instance.getClass().getDeclaredConstructors();
		for(Constructor<SingletonEnum> cons : constructors){
			cons.setAccessible(true);
			try {
				instance2 = (SingletonEnum) cons.newInstance();
				break;
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		
		System.out.println(instance2.hashCode());
	}
}
