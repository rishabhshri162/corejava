package com.rays.collection.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(30);
		list.add(40);

		// new list without duplicates
		List<Integer> uniqueList = new ArrayList<Integer>();
		for (Integer num : list) {
			if (!uniqueList.contains(num)) {
				uniqueList.add(num);

			}

		}
		System.out.println("Duplicate list: " + list);
		System.out.println("Without Duplicate list: " + uniqueList);
	}
}
