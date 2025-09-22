package com.rays.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestOtherMethod {
	public static void main(String[] args) {
		List<Contest> list = new ArrayList<Contest>();
		
		list.add(new Contest("Sachin", "7500281756"));
		list.add(new Contest("Shubhman", "7895863258"));
		list.add(new Contest("Abhishek", "6969895689"));
		list.add(new Contest("Rohit", "9696356458"));
		list.add(new Contest("Jasprit", "7896545689"));
		list.add(new Contest("Arshdeep", "96968"));
      
		
		//In this method we shuffle first
		Collections.shuffle(list);
		

		// Get phone numbers

		list.stream().map(e -> e.phone).forEach(System.out::println);

		// Filter valid phone numbers
		System.out.println("----------------");

		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).forEach(System.out::println);

		// Remove duplicate phone numbers
		System.out.println("----------------");

		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct().forEach(System.out::println);
		

		// Shuffle phone numbers
		System.out.println("----------------");

		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct();

		// Pick 3 winners
		System.out.println("----------------");

		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct().limit(3).forEach(System.out::println);
	

	}

}
