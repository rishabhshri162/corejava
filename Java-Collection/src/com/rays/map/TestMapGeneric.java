package com.rays.map;

import java.util.HashMap;
import java.util.Map;

public class TestMapGeneric {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		m.put("age", 40);
		m.put("age1", 35);
		m.put("age2", 22);
		m.put("age3", 21);
		
	
		System.out.println(m);
	}

}
