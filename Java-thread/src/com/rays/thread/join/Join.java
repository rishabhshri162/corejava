package com.rays.thread.join;

public class Join extends Thread{
	
	public String name;
	   
	public Join(String name) {
	this.name=name;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println(i + " = " + name);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}
}
