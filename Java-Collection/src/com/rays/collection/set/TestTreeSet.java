package com.rays.collection.set;

//1. TreeSet cannot contain null values
//2. it is also known as sorted set


import java.util.Set;
import java.util.TreeSet;

		public class TestTreeSet {
			public static void main(String[] args) {
				
				Set s = new TreeSet();
				s.add('a');
				s.add('b');
				s.add('b');
//				s.add(null);
				s.add('a');
//				s.add(null);
				s.add('A');
				System.out.println(s);
				
			}
	}


