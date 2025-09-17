package com.rays.collection.generic;

import java.util.ArrayList;
import java.util.List;

public class TestEmployeeGeneric {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		
      list.add(new Employee("priyank", 45000, "tcs"));
      list.add(new Employee("Amit", 96000, "iris"));
      list.add(new Employee("Sanjay", 85000, "ibm"));
      list.add(new Employee("karan", 70000, "infosys"));
      list.add(new Employee("Rahul", 50000, "wipro"));
      
      System.out.println(list.toString());
      
      System.out.println("---------------");
        list.forEach(System.out::println);
      
      
	}

}
