package com.rays.AutoBoxingAndUnboxing;

public class TestAutoboxingAndUnboxing {
	public static void main(String[] args) {

		System.out.println("----OLD METHOD----");
		int a = 10;
		Integer b = new Integer(a); // Autoboxing (means Data type into wrapper class)

		Integer t = b; // Unboxing (means Wrapper class into data type)

		System.out.println("----NEW METHOD----");

		int i = 10;
		Integer k = i; // Autoboxing (means Data type into wrapper class)

		Integer c = i; // Unboxing (means Wrapper class into data type)
	}

}
