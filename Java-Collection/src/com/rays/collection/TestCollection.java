package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		c.add(10);
		c.add("Rishabh");
		c.add(true);
		c.add(56.32);
		System.out.println(c);
		
		System.out.println("----------------");
		for (Object o : c) {             //take out value one by one
			System.out.println(o);
			
		}
	}

}
