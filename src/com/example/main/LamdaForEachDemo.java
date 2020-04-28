package com.example.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LamdaForEachDemo {

	public static void main(String[] args) {
		
		//iterateOverMap();
		//iterateOverList();
		sortingMap();
		
	}

	private static void iterateOverList() {
		
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		//Old way before Java 8
		/*for(String item : items){
			System.out.println(item);
		}*/
		System.out.println("...Iterating List...");
		
		//Using Java 8 Lambda
		items.forEach((item)->System.out.println(item));
		//Above lambda can be replace with method reference as below.
		items.forEach(System.out::println);
		
		
	}

	private static void iterateOverMap() {
		
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		//Old way before Java 8
		/*for(Map.Entry<String, Integer> item : items.entrySet()){
			System.out.println("Key : "+item.getKey() + ", Value : "+item.getValue());
		}*/
		
		// With Java 8
		System.out.println("...Iterating Map...");
		items.forEach((k,v)->System.out.println("Key : "+k+", Value : "+v));
	}
	
	private static void sortingMap() {
		
		Map<String, Integer> unsorted = new HashMap<>();
		unsorted.put("A", 10);
		unsorted.put("B", 20);
		unsorted.put("C", 30);
		unsorted.put("D", 40);
		unsorted.put("E", 50);
		unsorted.put("F", 60);
		unsorted.put("G", 70);
		unsorted.put("H", 80);
		unsorted.put("Z", 90);
		unsorted.put("J", 70);
		unsorted.put("P", 60);
		
		System.out.println("Before Sorting");
		unsorted.forEach((key,value)->System.out.println("Key : "+ key + " Value : "+value));
		
		Map<String, Integer> result = unsorted.entrySet().stream()
							.sorted(Map.Entry.comparingByKey())
							.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
									(oldVal, newVal)-> newVal, LinkedHashMap::new));
		System.out.println("After Sorting");
		result.forEach((key,value)->System.out.println("Key : "+ key + " Value : "+value));
		
	}

}
