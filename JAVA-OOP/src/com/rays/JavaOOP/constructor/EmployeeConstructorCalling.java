package com.rays.JavaOOP.constructor;

public class EmployeeConstructorCalling {
	
	//CONSTRUCTOR CALLING IN SAME CLASS

	public EmployeeConstructorCalling(String name) {
		System.out.println("Name: " + name);
	}

	public EmployeeConstructorCalling(String name, int id) {
		this(name);
		System.out.println("ID: " + id);
	}

	public EmployeeConstructorCalling(String name, int id, double salary) {
		this(name, id);
		System.out.println("Salary: " + salary);

	}
	public EmployeeConstructorCalling(String name, int id, double salary, String workingHours) {
		
		this(name, id, salary);
		System.out.println("Working Hours: " + workingHours);
		
	}
	public static void main(String[] args) {
		
		
		EmployeeConstructorCalling es = new EmployeeConstructorCalling("Rahul", 63, 56520, "8 hours");
		
	}

}
