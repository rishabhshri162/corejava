package com.rays.JavaOOP.constructor;

public class Student extends Person1 {
	
	public Student() {

		System.out.println("Student: This is default constructor");
	}
	
	public Student(String name, String address, int age, int rollNo) {
		super(name, address, 21);
		System.out.println("RollNo: " + rollNo);
	}
	
	public static void main(String[] args) {
		Student s = new Student("Ram", "Delhi", 22, 21);
	}

}
