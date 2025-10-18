package com.rays.scanner;

import java.util.Scanner;

public class MultipleInputs {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter age: ");
	        int age = sc.nextInt();
	        
	        System.out.print("Enter salary: ");
	        double salary = sc.nextDouble();
	        
	        System.out.print("Enter name: ");
	        sc.nextLine(); // consume leftover newline
	        String name = sc.nextLine();
	        
	        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
	        sc.close();
	    }
	}



