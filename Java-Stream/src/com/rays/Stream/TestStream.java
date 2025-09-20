package com.rays.Stream;

import java.util.ArrayList;
import java.util.List;

public class TestStream {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
	list.add("Dhoni");
	list.add("Pandya");
	list.add("Suryakumar");
	list.add("Bumrah");
	list.add("Dhoni");
	list.add("Shubhman");
	list.add("Sanju");
	list.add("Rohit");
	list.add("Raina");
	
	System.out.println("----Sorted in order----");
	list.stream().sorted().forEach(System.out::println);
	
	System.out.println();
	
	System.out.println("----remove duplicates----");
	list.stream().sorted().distinct().forEach(System.out::println);
	
	System.out.println();
	
	System.out.println("----to uppercase----");
	list.stream().map(le -> le.toUpperCase()).forEach(System.out::println);
	
    System.out.println();
	
	System.out.println("----Filter----");
	list.stream().map(le -> le.toUpperCase()).filter(le -> le.startsWith("S")).forEach(System.out::println);
	
	}

}
