package com.example.main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorGroupBy {

	public static void main(String[] args) {
		
		 List<String> items = Arrays.asList("apple", "Apple", "banana",
	                          "apple", "orange", "banana", "papaya");
		 
		 Map<String, Long> result = items.stream()
				 					.collect(Collectors.groupingBy(
				 								Function.identity(),Collectors.counting()));
		 
		 System.out.println(result);
		 
		 List<Integer> nums = Arrays.asList(4,5,8,2,9,7);
		 
		 int max = nums.stream().collect(Collectors.maxBy((num1,num2)-> num1-num2)).get();
		 int min = nums.stream().collect(Collectors.minBy((num1,num2)-> num1-num2)).get();
		 
		 System.out.println("Max is : " + max);
		 System.out.println("Min is : " + min);
	}

}
