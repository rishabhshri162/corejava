package com.rays.JavaOOP.Inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestDoctor {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Doctor D = new Doctor();
		 
		D.setName("Ram");
		D.setAddress("Delhi");
		D.setDob(sdf.parse("12-10-2000"));
		D.setRegistrationNO("12321565");
		
		System.out.println("NAME:- " + D.getName());
		System.out.println("ADDRESS:- " + D.getAddress());
		System.out.println("DOB:- " + sdf.format(D.getDob()));
		System.out.println("Registration NO:- " + D.getRegistrationNo());
		
		
	}

}
