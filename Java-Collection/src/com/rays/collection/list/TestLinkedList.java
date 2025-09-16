package com.rays.collection.list;

import java.util.LinkedList;

public class TestLinkedList {
public static void main(String[] args) {
	LinkedList linkedlist = new LinkedList();
	
	linkedlist.add("bjp");
	linkedlist.add("bjp");
	linkedlist.add(56);
	linkedlist.add("election");
	linkedlist.add(null);
	
	
	System.out.println(linkedlist);
	System.out.println(linkedlist.get(3));
	System.out.println(linkedlist.remove(4));
	System.out.println(linkedlist);
	
}
}
