package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionMethods {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();

		c1.add("Rishabh");
		c1.add('r');
		c1.add(8);
		c1.add(true);
		c1.add(56.36);
		c1.add(null);
		System.out.println(c1);
		System.out.println(c1.size()); // check size of element
		System.out.println(c1.contains('h')); // check whether h is avail or not
		System.out.println(c1.remove(null)); // remove an element
		System.out.println(c1);

		System.out.println("-------------------");

		Collection c2 = new ArrayList();

		c2.add("Ram");
		c2.add('r');
		c2.add(78);
		c2.add(false);
		c2.add(5.0);

		c1.addAll(c2); // add c2 element into c1
		System.out.println("c1 after addAll: " + c1);
		System.out.println(c1.containsAll(c2));     //check whether c2 element store in c1 or not
        c1.removeAll(c2);                         //remove all element of c2 that store on c1
        System.out.println("c1 after remove element of c2: " + c1);
        System.out.println(c2.isEmpty());           //check c2 is empty or not
        
	}

}
