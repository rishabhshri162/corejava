package com.rays.JavaOOP.Encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");


		Person P = new Person();
		P.setName("Rishabh");
		P.setDob(sdf.parse("01-06-2002"));
		P.setAddress("Indore");

		System.out.println("Name:- " + P.getName());
		System.out.println("DOB:- " + sdf.format(P.getDob()));
		System.out.println("Address:- " + P.getAddress());
		
		
		
		if (P.getAge() >= Person.AVG_AGE) {
			System.out.println(P.getAge() + "  You are eligible to vote");
		} else {
			System.out.println(P.getAge()  + "  You are not eligible to vote");
		}
		
		System.out.println();
		System.out.println("--------------------");;
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		

		Person R = new Person();
		R.setName("Ram");
		R.setDob(sdf1.parse("11-12-2010"));
		R.setAddress("Delhi");

		System.out.println("Name:- " + R.getName());
		System.out.println("DOB:- " + sdf.format(R.getDob()));
		System.out.println("Address:- " + R.getAddress());
		
		
		if (R.getAge() >= Person.AVG_AGE) {
			System.out.println(R.getAge() + "  You are eligible to vote");
		} else {
			System.out.println(R.getAge()  + "  You are not eligible to vote");
		}
		
		System.out.println();
		System.out.println("--------------------");;
		
	
	}

}
