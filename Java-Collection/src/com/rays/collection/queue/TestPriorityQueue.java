package com.rays.collection.queue;


import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {
	public static void main(String[] args) {

		Queue q = new PriorityQueue();

		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(7);
		q.offer(4);
//		q.offer("rahul");    //it gives an exception because only int value not other types of element
		
		
		System.out.println("queue: " + q);
		System.out.println(q.peek());
//		System.out.println("queue: " + q);
//		System.out.println("Remove the head of the queue: " + q.poll());
//		System.out.println("queue: " + q);

	}

}
