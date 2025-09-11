package com.rays.JavaOOP.constructor;

public class Student extends Person1ConstructorCalling {
	public Student() {
		System.out.println("Default constructor");
	}

	public Student(String name, String address, int age, int rollNo) {
		super(name, address, age);
		System.out.println("RollNo: " + rollNo);
	}

	public static void main(String[] args) {
		Student s = new Student("Ram", "Delhi", 21, 101);
	}
}
