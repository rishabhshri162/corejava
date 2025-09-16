package com.rays.collection.list;

//1. List can contain multiple duplicate element
//2. List can contain multiple null element
//3. order of list is natural order

import java.util.ArrayList;
import java.util.List;


public class TestArrayList {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("BJP");
		list.add('b');
		list.add(56);
		list.add(6.0);
		list.add(null);
		list.add(56);
		list.add(null);
		
		System.out.println(list);
		System.out.println(list.get(6));    //return the 6th index element  

		list.remove(6);                  //remove the 6th element
		System.out.println(list);
		list.set(1, 'c');               //Replace the 1 index with objectc
		System.out.println(list);
		System.out.println(list.indexOf(56));       //search object from begining
		System.out.println(list.lastIndexOf(6.0));  //search object from end
		System.out.println(list.subList(2, 5));      //returns sublist
	}

}
