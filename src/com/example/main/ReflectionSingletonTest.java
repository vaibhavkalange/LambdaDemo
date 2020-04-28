package com.example.main;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ClassNotFoundException {
		
		MySingleton instance1 = MySingleton.getInstance();
		MySingleton instance2 = null;
		
		Constructor<MySingleton>[] constructors = (Constructor<MySingleton>[]) MySingleton.class.getDeclaredConstructors();
		
		for(Constructor<MySingleton> cons : constructors){
			cons.setAccessible(true);
			try {
				instance2 = (MySingleton) cons.newInstance(instance2);
				break;
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		System.out.println(instance1==instance2);
	}

}
