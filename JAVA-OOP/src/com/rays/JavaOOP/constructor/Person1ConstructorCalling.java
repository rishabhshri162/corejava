package com.rays.JavaOOP.constructor;

public class Person1ConstructorCalling {
	
public Person1ConstructorCalling () {
	System.out.println("Person1: Default Constructor");
}
public Person1ConstructorCalling (String name) {
	this();
	System.out.println("Name: " + name);
}
public Person1ConstructorCalling (String name, String address) {
	this(name);
	System.out.println("Address: " + address);
}
public Person1ConstructorCalling (String name, String address, int age) {
	this(name, address);
	System.out.println("Age: " + age);
	
}

public static void main(String[] args) {
	Person1ConstructorCalling  p = new Person1ConstructorCalling ("Rishabh", "Indore", 22);
		
	
}
}
