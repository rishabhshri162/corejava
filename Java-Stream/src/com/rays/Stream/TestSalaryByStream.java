package com.rays.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestSalaryByStream {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(65000);
		list.add(75000);
		list.add(80000);
		list.add(35000);
		list.add(40000);
		list.add(50000);
		list.add(27000);
		list.add(90000);
		
		System.out.println("------Sorted in desc order------");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("---highest salary using limit----");
		list.stream().sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("---second highest salary using limit & skip----");
		list.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
		
		System.out.println();
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
