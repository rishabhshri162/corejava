package com.rays.thread.join;

public class TestJoin {
	public static void main(String[] args) {
		
		Join j1 = new Join("Rishabh");
		Join j2 = new Join("ram");
		
		j1.start();   //only start j1 object
		
		try {
			j1.join();   //pehle j1 excute hoga or j2 wait krega end hone k lie
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		j2.start();
	}

}
