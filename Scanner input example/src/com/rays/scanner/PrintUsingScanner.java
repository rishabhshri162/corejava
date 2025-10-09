package com.rays.scanner;

import java.util.Scanner;

public class PrintUsingScanner {

	public static void main(String[] args) {

		// creates an object of Scanner
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your name: ");

		// takes input from the keyboard
		String name = sc.nextLine();

		// prints the name
		System.out.println("My name is " + name);

		// closes the scanner
		sc.close();
	}
}
