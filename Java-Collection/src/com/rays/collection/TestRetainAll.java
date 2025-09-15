package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestRetainAll {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();

		c1.add("Rishabh");
		c1.add('r');
		c1.add(8);
		c1.add(true);
		c1.add(56.36);
		c1.add(null);

		System.out.println("-------------------");

		Collection c2 = new ArrayList();

		c2.add("Ram");
		c2.add('r');
		c2.add(78);
		c2.add(false);
		c2.add(5.0);
		c1.retainAll(c2);    //duplicate value print krega
		System.out.println(c1);
	}

}
