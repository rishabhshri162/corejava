package com.rays.JavaOOP.Inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestBusinessman {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Businessman B = new Businessman();
		B.setIncome(100000.0);
		B.setName("Rishabh");
		B.setAddress("Indore");
		B.setDob(sdf.parse("01-06-2002"));
		
		System.out.println("INCOME:- " + B.getIncome());
		System.out.println("NAME:- " + B.getName());
		System.out.println("ADDRESS:- " + B.getAddress());
		System.out.println("DOB:- " + sdf.format(B.getDob()));
		
		
	
	}


	}


