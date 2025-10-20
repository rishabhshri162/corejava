package com.rays.scanner;

import java.util.Scanner;

	public class CheckInputType 
	{
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        

	        System.out.println("Enter something:");
	        
	        if (sc.hasNextInt()) {
	            System.out.println("You entered an integer: " + sc.nextInt());
	        } else if (sc.hasNextDouble()) {
	            System.out.println("You entered a double: " + sc.nextDouble());
	        } else {
	            System.out.println("You entered text: " + sc.next());
	        }

	        sc.close();
	    }
	}



