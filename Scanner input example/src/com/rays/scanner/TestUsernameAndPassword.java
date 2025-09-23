package com.rays.scanner;

import java.util.Scanner;

public class TestUsernameAndPassword {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Username: ");
		String Username = sc.nextLine();
		
		System.out.println("Password: ");
		String password = sc.nextLine();
		
		System.out.println("USERNAME: " + Username);		
		System.out.println("PASSWORD: " + password);		
		
		
	}

}
