package com.example.main;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		C1 obj = new C1();
		int[] a = obj.getArray();
		a[2] = 10;
		for (int i : a) {
			System.out.println(i);
		}
		int[] a2 = obj.getArray();
		for (int i : a2) {
			System.out.print(i);
		}

		/*
		 * try { Thread.currentThread().join(); } catch (InterruptedException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 */

		List<String> s = new ArrayList<String>();
		List<Object> o = new ArrayList<Object>();

		String s1 = new String();
		Object o1 = s1;

	}
}

class C1 {
	private static final int[] array = { 1, 2, 3, 4, 5 };

	public int[] getArray() {
		return array.clone();
	}
}
