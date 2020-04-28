package com.example.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8FiltersDemo {

	public static void main(String[] args) {
		
		List<String> lines = Arrays.asList("spring", "node", "mkyong");
		
		List<String> result = lines.stream().filter(item-> !"mkyong".equalsIgnoreCase(item))
											.collect(Collectors.toList());
		System.out.println(result);
	}
}
