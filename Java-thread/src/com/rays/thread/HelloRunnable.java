package com.rays.thread;

public class HelloRunnable implements Runnable{
	
	public String name;
	
	public HelloRunnable(String name) {
		this.name=name;
	
	}
	
	
	@Override
	public void run() {
		for (int i = 1; i <=5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + " = " + name);
			
		}
		
		
	
		
	}

}
