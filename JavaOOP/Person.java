package com.rays.JavaOOP;

import java.util.Date;

public class Person {
	private String name;
	private Date dob;
	private String Address;
	public static final int AVG_AGE = 18;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob ;
	}
	
	public String getAddress() {
		return this.Address;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public int getAge() {
		Date now = new Date();
		int age = now.getYear() - dob.getYear();
		return age;
	}
}
