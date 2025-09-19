package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployeeComparator {
	
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Rahul", 29000, "IBM"));
		list.add(new Employee("Ram", 90000, "Wipro"));
		list.add(new Employee("Shyam", 45000, "Tcs"));
		list.add(new Employee("Kunal", 55000, "Infosys"));
		list.add(new Employee("Vijay", 80000, "Google"));
		list.add(new Employee("Kapil", 75000, "Hcl"));
		
//		list.forEach(System.out::println);
//		System.out.println();
		
		System.out.println("--------After salary sort-------");
		
		OrderBySalary salary = new OrderBySalary();
		Collections.sort(list, salary);
		list.forEach(System.out::println);
		
		System.out.println();
		System.out.println("--------After name sort----------");
		
		OrderByName byname = new OrderByName();
		
		Collections.sort(list, byname);
		
		list.forEach(System.out::println);
		System.out.println();
		System.out.println("-------After Company sort--------");
		
		OrderByCompany byCom = new OrderByCompany();
		
		Collections.sort(list, byCom);
		
		list.forEach(System.out::println);
		
		
	}

}
