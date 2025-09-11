package com.rays.JavaOOP.constructor;

public class Person1 {

	public Person1() {
		System.out.println("Person: This is default constructor");
	}

	public Person1(String name) {
		this();
		System.out.println("name: " + name);
	}

	public Person1(String name, String address) {
		this(name);
		System.out.println("address: " + address);
	}

	public Person1(String name, String address, int age) {
		this(name, address);
		System.out.println("age: " + age);
	}

}
