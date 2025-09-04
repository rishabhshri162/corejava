package com.rays.JavaOOP.Encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		Account a1 = new Account();

		a1.setnumber("7899");
		a1.setaccountType("Current");
		a1.setbalance(10000.00);
	

		System.out.println("a1 Account Number: " + a1.getnumber());
		System.out.println("a1 Account Type: " + a1.getaccountType());
		System.out.println("a1 Account Balance: " + a1.getbalance());
         a1.deposit(500);
         a1.withdrawal(500);
      

               
            
        System.out.println();
         
		System.out.println("---------------------");
		Account a2 = new Account();
		a2.setnumber("8956");
		a2.setaccountType("Saving");
		a2.setbalance(5000.00);

		System.out.println("a2 Account Number: " + a2.getnumber());
		System.out.println("a2 Account Type: " + a2.getaccountType());
		System.out.println("a2 Account Balance: " + a2.getbalance());
  System.out.println("------------");
		   a1.fundTransfer(a2, 500);
	}

}
