package com.example.main;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {
		flatMapTest();
		
		/*
		 * int[] myArr = {2,4,2,4,5,6,3};
		 * System.out.println("Array size before copy: "+myArr.length);
		 * Arrays.stream(myArr).forEach(System.out::println);
		 * 
		 * int[] result = Arrays.copyOf(myArr, 20);
		 * System.out.println("Array size After copy: "+result.length);
		 * Arrays.stream(result).forEach(System.out::println);
		 */
	}
	
	private static void flatMapTest() {
		String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
		
		Stream<String[]> temp = Arrays.stream(data);
		
		Stream<String> result = temp.flatMap(x->Arrays.stream(x));
		result.forEach(x->System.out.println(x));
	}

}
