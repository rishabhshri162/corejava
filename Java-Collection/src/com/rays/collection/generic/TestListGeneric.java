package com.rays.collection.generic;

import java.util.ArrayList;
import java.util.List;

public class TestListGeneric {
	public static void main(String[] args) {
		
	List<Integer> list = new ArrayList<Integer>();
	list.add(8);
	list.add(6);
//	list.add("r");        it will throw exception because only int value are required
	
	System.out.println(list);
					
	}
}