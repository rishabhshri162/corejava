package com.rays.JavaOOP.constructor;

//Child class calling parent class

public class StudentConstructorCalling extends Person1ConstructorCalling {
	public StudentConstructorCalling() {
		System.out.println("Default constructor");
	}

	public StudentConstructorCalling(String name, String address, int age, int rollNo) {
		super(name, address, age);
		System.out.println("RollNo: " + rollNo);
	}

	public static void main(String[] args) {
		StudentConstructorCalling s = new StudentConstructorCalling("Ram", "Delhi", 21, 101);
	}
}
