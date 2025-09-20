package com.rays.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestStreamDemo {
	
	public static void main(String[] args) {
		
	
    List<Integer> list = new ArrayList<Integer>();
    
    list.add(1);
    list.add(7);
    list.add(1);
    list.add(3);
    list.add(8);
    list.add(5);
    list.add(4);
    
    
    System.out.println("-------For filter odd numbers-------");
    list.stream().filter(le -> le%2 != 0).forEach(System.out::println);
    
    System.out.println("-------For remove duplicate numbers-------");
    list.stream().filter(le -> le%2 != 0).distinct().forEach(System.out::println);
    
    System.out.println("-------to sort numbers-------");
    list.stream().filter(le -> le%2 != 0).distinct().sorted().forEach(System.out::println);
    
    System.out.println("-------to sort numbers in desc order-------");
    list.stream().filter(le -> le%2 != 0).distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	
    
	}
}
