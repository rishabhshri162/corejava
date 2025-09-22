package com.rays.AutoBoxingAndUnboxing;

public class TestAutoboxingAndUnboxing {
	public static void main(String[] args) {

		System.out.println("----OLD METHOD----");
		int i = 10;
		Integer j = new Integer(i); // Autoboxing (means Data type into wrapper class)

		int k = j; // Unboxing (means Wrapper class into data type)

		System.out.println("----NEW METHOD----");

		int a = 10;
		Integer b = i; // Autoboxing (means Data type into wrapper class)

		int c = i; // Unboxing (means Wrapper class into data type)
	}

}
