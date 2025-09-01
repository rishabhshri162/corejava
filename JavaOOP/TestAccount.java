package com.rays.JavaOOP;

public class TestAccount {
	public static void main(String[] args) {
		Account Rishabh = new Account();
		
		Rishabh.setnumber("789987789789");
		Rishabh.setaccountType("Current");
		Rishabh.setbalance(10000.00);
		
		System.out.println("Rishabh Account Number: "+ Rishabh.getnumber());
		System.out.println("Rishabh Account Type: "+ Rishabh.getaccountType());
		System.out.println("Rishabh Account Balance: "+ Rishabh.getbalance());
	
		System.out.println("---------------------");
		Account Ram = new Account ();
		Ram.setnumber("895622356533");
		Ram.setaccountType("Saving");
		Ram.setbalance(5000.36);
		
		System.out.println("Ram Account Number: "+ Ram.getnumber());
		System.out.println("Ram Account Type: "+ Ram.getaccountType());
		System.out.println("Ram Account Balance: "+ Ram.getbalance());
		
	}
	

}
