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

	}

}
