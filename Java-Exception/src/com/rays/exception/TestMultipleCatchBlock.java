package com.rays.exception;

public class TestMultipleCatchBlock {
	
	public static void main(String[] args) {
		
		try{
			String str = null;
			System.out.println(str.length());
			System.out.println(str.charAt(7));
			
		}catch (NullPointerException e) {
			System.out.println("exception1: " + e.getMessage());
		
		}catch (IndexOutOfBoundsException e) {
			System.out.println("exception2: " + e.getMessage());
		}finally {
			System.out.println("Program is finished");
		}
		
		
	}

}
