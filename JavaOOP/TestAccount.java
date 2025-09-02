package com.rays.JavaOOP;

public class TestAccount {
	public static void main(String[] args) {
		Account Rishabh = new Account();

		Rishabh.setnumber("789987789789");
		Rishabh.setaccountType("Current");
		Rishabh.setbalance(10000.00);
	

		System.out.println("Rishabh Account Number: " + Rishabh.getnumber());
		System.out.println("Rishabh Account Type: " + Rishabh.getaccountType());
		System.out.println("Rishabh Account Balance: " + Rishabh.getbalance());
         Rishabh.deposit(5000);
         Rishabh.withdrawal(2000);
         System.out.println();
         
		System.out.println("---------------------");
		Account Ram = new Account();
		Ram.setnumber("895622356533");
		Ram.setaccountType("Saving");
		Ram.setbalance(5000.36);

		System.out.println("Ram Account Number: " + Ram.getnumber());
		System.out.println("Ram Account Type: " + Ram.getaccountType());
		System.out.println("Ram Account Balance: " + Ram.getbalance());

		System.out.println("---------------------");

		Account Rahul = new Account();
		Rahul.setnumber("6546462323265");
		Rahul.setaccountType("Saving");
		Rahul.setbalance(500.36);

		System.out.println("Rahul Account Number: " + Rahul.getnumber());
		System.out.println("Rahul Account Type: " + Rahul.getaccountType());
		System.out.println("Rahul Account Balance: " + Rahul.getbalance());

		System.out.println("---------------------");

		Account Akshay = new Account();
		Akshay.setnumber("562232114521145");
		Akshay.setaccountType("current");
		Akshay.setbalance(30000.36);

		System.out.println("Akshay Account Number: " + Akshay.getnumber());
		System.out.println("Akshay Account Type: " + Akshay.getaccountType());
		System.out.println("Akshay Account Balance: " + Akshay.getbalance());

	}

}
