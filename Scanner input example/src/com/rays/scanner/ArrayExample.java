package com.rays.scanner;

import java.util.Scanner;

public class ArrayExample {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // create scanner object

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();  // user input for array size

		int[] arr = new int[n];  // declare array

		System.out.println("Enter " + n + " numbers:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();   // input each element
		}

		System.out.println("\nYou entered:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close(); // close scanner
	}
}
