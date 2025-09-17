package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestFailSafe {
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("Akash");
		v.add("harsh");
		v.add("Atul");
		v.add("priyank");
		v.add("priya");
		
		System.out.println(v);
		
		Enumeration e = v.elements();
		
		v.add("Anshul");  //this is fail safe 
		
	while (e.hasMoreElements()) {
		Object o = e.nextElement();
		System.out.println(o);
		
		
	}
	}

}
