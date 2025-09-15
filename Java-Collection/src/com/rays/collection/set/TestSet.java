package com.rays.collection.set;


import java.util.HashSet;
import java.util.Set;


//1. set contain only unique element
//2. set can contain only one null value
//. order of set is sorting order by default asc order

public class TestSet {
	public static void main(String[] args) {
		
		Set s = new HashSet();
		s.add('a');
		s.add('b');
		s.add('b');
		s.add(null);
		s.add('a');
		s.add(null);
		s.add('A');
		System.out.println(s);
		
	}

}
