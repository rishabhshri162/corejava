package com.rays.collection.list;

import java.util.Vector;

public class TestVector {
public static void main(String[] args) {
	Vector v = new Vector();
	v.add("bjp");
	v.add("bjp");
	v.add(56);
	v.add("election");
	v.add(null);
	
	System.out.println(v);
	System.out.println(v.get(3));
	System.out.println(v.remove(4));
	System.out.println(v);
}
}
