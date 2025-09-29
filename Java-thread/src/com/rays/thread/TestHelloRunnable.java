package com.rays.thread;

public class TestHelloRunnable {
	public static void main(String[] args) {
		Thread t1 = new Thread(new HelloRunnable("Rishabh"));
		Thread t2 = new Thread(new HelloRunnable("Shrivastava"));
		
		
		t1.start();
		t2.start();
	}

}
