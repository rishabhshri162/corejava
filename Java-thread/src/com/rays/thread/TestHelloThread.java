package com.rays.thread;

public class TestHelloThread {
	public static void main(String[] args) throws Exception {
		
		HelloThread t1 = new HelloThread("Rishabh");
		HelloThread t2 = new HelloThread("Ram");
		
		t1.setPriority(10);     //for priority default is 5
		
		t1.start();
		t2.start();        //for start the thread
	}

}
