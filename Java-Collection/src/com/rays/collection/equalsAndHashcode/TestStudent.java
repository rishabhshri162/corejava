package com.rays.collection.equalsAndHashcode;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student("Ram", 101);
		Student s2 = new Student("Rishabh", 101);
		
		System.out.println(s1.equals(s2));
		System.out.println("s1 hashcode: " + s1.hashCode());
		System.out.println("s2 hashcode: " + s2.hashCode());
	}

}
