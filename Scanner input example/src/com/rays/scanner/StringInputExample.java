package com.rays.scanner;

import java.util.Scanner;

public class StringInputExample {

	
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a single word: ");
	        
	        String word = sc.next();  // stops at space
	        
	        System.out.println("Word: " + word);
	        
	        sc.nextLine(); // consume leftover newline
	        
	        System.out.print("Enter a full line: ");
	        
	        String line = sc.nextLine(); // reads full line including spaces
	        
	        System.out.println("Line: " + line);
	        
	        sc.close();
	    }
	}



