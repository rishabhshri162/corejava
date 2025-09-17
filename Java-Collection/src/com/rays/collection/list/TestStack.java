package com.rays.collection.list;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		Stack s = new Stack();
		for (char c = 'a'; c <= 'z'; c++) {
			s.push(c);
			System.out.println(c);
		}
		
		System.out.println("stack: " + s);
		System.out.println("peek: " + s.peek());
		System.out.println("pop: " + s.pop());
		System.out.println("stack: " + s);
		
		Stack s1 = new Stack();
		
		while (!s.empty()) {
			s1.push(s.pop());
			
		}
		System.out.println(s1);

	}
}
