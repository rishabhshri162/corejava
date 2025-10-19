package com.rays.scanner;

import java.util.Scanner;

public class EvenOddCheck {
	

	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);   // create scanner object
	        
	        System.out.print("Enter a number: ");
	        
	        int number = sc.nextInt();            // take integer input from user
	        
	        if (number % 2 == 0) {          // condition check
	            System.out.println(number + " is even.");
	        } else {
	            System.out.println(number+ " is odd.");
	        }
	        
	        sc.close();                            // close scanner
	    }
	}



