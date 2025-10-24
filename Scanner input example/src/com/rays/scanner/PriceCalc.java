package com.rays.scanner;

import java.util.Scanner;

public class PriceCalc{

	  public static void main(String[] args) {
		  
		  Scanner sc = new Scanner(System.in);
		  
		    System.out.print("Enter item price and quantity: ");
		    
		    double price = sc.nextDouble();
		    
		    int qty = sc.nextInt();
		    
		    System.out.println("Total = " + price*qty);
	  }
	}



