package com.rays.collection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Ram");
		list.add("Rahul");
		list.add("Nitin");
		list.add("Kunal");
		
		System.out.println("list: " + list);
		
		System.out.println("----for each loop----");
		
		for ( Object o: list) {
			System.out.println(o);
			
		}
		
		System.out.println("----itertor method----");
		 Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("----foreach method----");
		list.forEach(System.out::println);
	}

}
