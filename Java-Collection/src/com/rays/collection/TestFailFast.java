package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestFailFast {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("Ram");
		list.add("Shyam");
		list.add("Rahul");
		list.add("karan");
		
		System.out.println(list);
		System.out.println("------------");
		
		Iterator it = list.iterator();
		
		list.add("Rishabh");          //exception because after creating iterator object you cannot add element
		 while (it.hasNext()) {
			 Object o = it.next();
			 System.out.println(o);
			
		}
	
	}

}
