package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheet {
	public static void main(String[] args) {
		List<Marksheet> list = new ArrayList<Marksheet>();
		list.add(new Marksheet("105", "Rahul", 95));
		list.add(new Marksheet("104", "Shivam", 58));
		list.add(new Marksheet("101", "Nitin", 66));
		list.add(new Marksheet("106", "Kunal", 96));
		list.add(new Marksheet("103", "Hritik", 36));
		list.add(new Marksheet("102", "Ram", 75));
		
		list.forEach(System.out::println);
		
		System.out.println("-----------------");
		Collections.sort(list);
		list.forEach(System.out::println);
		
	}

}
