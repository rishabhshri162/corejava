package com.rays.map;


//1. key value is always unique
//2. only one null key
//3. value can hold more than one null and also duplicate values

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		Map m = new HashMap();
		
		m.put("one", 1);
		m.put("two", 2);
		m.put("three", 3);
		m.put("four", 4);
		m.put("five", 4);
		
		System.out.println("Map: " + m);
		System.out.println("get key: " + m.get("four"));
		System.out.println("check key: " + m.containsKey("four"));
		System.out.println("check value: " + m.containsValue(4));
		System.out.println("print K & value: " + m.entrySet());
		System.out.println("print only Key : " + m.keySet());
	   System.out.println("print only Value: " + m.values());
	   System.out.println("to remove by key: " + m.remove("two"));
	   System.out.println("Map: " + m);
	   System.out.println("to get size: " + m.size());
	   System.out.println("to check empty or not: " + m.isEmpty());
		
		
	}

}
