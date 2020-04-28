package com.example.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationSingleton {

	public static void main(String[] args) throws CloneNotSupportedException {
		MySingleton instance1 = MySingleton.getInstance();
		MySingleton instance2 = null;
		
		try(FileOutputStream fos = new FileOutputStream("test.ser");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			FileInputStream fis = new FileInputStream("test.ser");
			ObjectInputStream is = new ObjectInputStream(fis);) {
			
			os.writeObject(instance1);
			
			instance2 = (MySingleton) is.readObject();
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		System.out.println(instance1.clone().hashCode());
	}
}
