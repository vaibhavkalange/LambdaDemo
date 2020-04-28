package com.example.main;

import java.io.Serializable;

/**
 * @author vaibhav.kalange
 *
 *         Bill Pugh Singleton implementation
 */
public class MySingleton implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3672050656772390745L;

	private MySingleton() {

		if (SingletonHelper.INSTANCE != null) {
			throw new InstantiationError("Instance Already Exist...!");
		}

	}

	private static final class SingletonHelper {
		private static final MySingleton INSTANCE = new MySingleton();
	}

	public static MySingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

	/**
	 * @return MySingleton instance.
	 * 
	 *         Deserialization process destroy the singleton pattern. To overcome
	 *         this problem we need to provide the implementation of the below
	 *         method. This method is called by ObjectInputStream while reading the
	 *         object from the stream.
	 */
	protected Object readResolve() {
		return getInstance();
	}

	/**
	 * Cloning process breaks the singleton pattern.
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return getInstance();
	}

}
