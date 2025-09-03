package com.rays.JavaOOP.Encapsulation;

public class Employee {
	private String name;
	private int id;
	private int salary;
	private String workinghours;

	public String getName() {
		return this.name;

	}

	public void setName(String name) {
		this.name = name;

	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return this.salary;

	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getWorkinghours() {
		return this.workinghours;
		
	}
	public void setWorkinghours(String workinghours) {
		this.workinghours = workinghours;
	}

}
