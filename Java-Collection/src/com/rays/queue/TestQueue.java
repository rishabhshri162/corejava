
package com.rays.collection.queue;

	import java.util.ArrayDeque;
	import java.util.Queue;

	//1. First in First out Last in Last out
	public class TestQueue{

		public static void main(String[] args) {

			Queue q = new ArrayDeque();

			q.offer(5);
			q.offer(4);
			q.offer(3);
			q.offer(6);
//
			System.out.println("queue: " + q);
			System.out.println(q.peek());
			System.out.println("queue: " + q);
			System.out.println("Remove the head of the queue: " + q.poll());
			System.out.println("queue: " + q);

		}

	}


