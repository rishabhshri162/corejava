package com.rays.thread;

public class HelloThread extends Thread {

	public String name;

	public HelloThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " = " + name);

			try {
				sleep(1000); // for Sleep
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
