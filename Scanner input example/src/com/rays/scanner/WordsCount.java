package com.rays.scanner;

import java.util.Scanner;

public class WordsCount{
	
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a sentence: ");
	    String str = sc.nextLine();
	    String[] words = str.split(" ");
	    System.out.println("Word count: " + words.length);


	  }
	}



