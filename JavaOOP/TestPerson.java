package com.rays.JavaOOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date dob = sdf.parse("01-06-2002");

		Person P = new Person();
		P.setName("Rishabh");
		P.setDob(dob);
		P.setAddress("Indore");

		System.out.println("Name:- " + P.getName());
		System.out.println("DOB:- " + sdf.format(P.getDob()));
		System.out.println("Address:- " + P.getAddress());
		
		System.out.println();
		System.out.println("--------------------");;
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		Date dob1 = sdf1.parse("11-05-1990");

		Person R = new Person();
		R.setName("Ram");
		R.setDob(dob1);
		R.setAddress("Delhi");

		System.out.println("Name:- " + R.getName());
		System.out.println("DOB:- " + sdf1.format(R.getDob()));
		System.out.println("Address:- " + R.getAddress());
		
		System.out.println();
		System.out.println("--------------------");;
		

		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
		Date dob2 = sdf2.parse("06-12-2010");

		Person S = new Person();
		S.setName("Rahul");
		S.setDob(dob2);
		S.setAddress("Gurgaon");

		System.out.println("Name:- " + S.getName());
		System.out.println("DOB:- " + sdf2.format(S.getDob()));
		System.out.println("Address:- " + S.getAddress());
		
		System.out.println();
		System.out.println("--------------------");;
		
	
	}

}
