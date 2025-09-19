package com.rays.collection.sorting;

import java.util.Comparator;

public class OrderByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.name.compareTo(o2.name) ;
	}
	

}
