package com.example.main;

import java.util.HashMap;

public final class TestImmutable {

	private final int id;
	private final String name;
	private final HashMap<String, String> testmap;

	/**
	 * Constructor performing shallow copy
	 * 
	 * @param id
	 * @param name
	 * @param testmap
	 *//*
		 * 
		 * public TestImmutable(int id, String name, HashMap<String, String> testmap) {
		 * 
		 * this.id = id; this.name = name; this.testmap = testmap; }
		 */

	/**
	 * Constructor performing deep copy
	 * 
	 * @param id
	 * @param name
	 * @param testmap
	 */

	public TestImmutable(int id, String name, HashMap<String, String> testmap) {

		this.id = id;
		this.name = new String(name);
		this.testmap = new HashMap<String, String>();
		testmap.forEach((k, v) -> this.testmap.put(k, v));
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@SuppressWarnings("unchecked")
	public HashMap<String, String> getTestmap() {
		return (HashMap<String, String>) testmap.clone();
	}

	public static void main(String[] args) {

		HashMap<String, String> h1 = new HashMap<String, String>();
		h1.put("1", "First");
		h1.put("2", "Second");

		String s = "Original";
		int id = 5;

		TestImmutable ti = new TestImmutable(id, s, h1);
		System.out.println(s == ti.getName());
		System.out.println(h1 == ti.getTestmap());

		h1.put("3", "Three");
		s = "Modified";
		id = 10;

		System.out.println("ID : " + ti.getId());
		System.out.println("Name : " + ti.getName());
		System.out.println("Test Map : " + ti.getTestmap());
	}
}