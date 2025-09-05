package com.rays.JavaOOP.Inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestSpecialist {
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Specialist a = new Specialist();
	a.setName("Rishabh");
	a.setAddress("Indore");
	a.setRegistrationNO("25656235");
	a.setDob(sdf.parse("01-06-2003"));
	a.setSpecialist("Heart");
	System.out.println(a.getName());
	System.out.println(a.getAddress());
	System.out.println(a.getRegistrationNo());
	System.out.println(sdf.format(a.getDob()));
	System.out.println(a.getSpecialist());
	
	
		
		
	}

}
