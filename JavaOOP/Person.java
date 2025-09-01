package com.rays.JavaOOP;

import java.util.Date;

public class Person {
	private String name;
	private Date dob;
	private String Address;

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
}
