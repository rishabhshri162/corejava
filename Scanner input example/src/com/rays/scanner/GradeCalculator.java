package com.rays.scanner;

import java.util.Scanner;
public class GradeCalculator {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter marks (out of 100): ");
	        int marks = sc.nextInt();

	        if (marks >= 90) System.out.println("Grade: A+");
	        else if (marks >= 75) System.out.println("Grade: A");
	        else if (marks >= 60) System.out.println("Grade: B");
	        else if (marks >= 40) System.out.println("Grade: C");
	        else System.out.println("Grade: Fail");

	        sc.close();
	    }
	}



