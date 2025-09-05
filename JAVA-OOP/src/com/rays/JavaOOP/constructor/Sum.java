package com.rays.JavaOOP.constructor;

public class Sum {
	
//	THIS IS DEFAULT CONSTRUCTOR
	
	public Sum() {
		System.out.println("This is default constructor");
	}
	
//	THIS IS PARAMETERIZED CONSTRUCTOR
	
	public Sum(int a, int b) {
		System.out.println("Sum of two numbers: " + (a+b));
	}
	
	public Sum(double c, double d) {
		System.out.println("Sum of two double no: " + (c+d));
	}
	

}
