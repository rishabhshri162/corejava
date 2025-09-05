package com.rays.JavaOOP.constructor;

public class Account {
	private String accNo;
	private String accType;
	private double balance;
	private String number;
	
	public Account(String accNo, String accType, double balance) {
		this.accNo = accNo;
		this.accType = accType;
		this.balance = balance;
	}
	
	public String getAccNo() {
		return this.accNo;
	}
	public String getAccType() {
		return this.accType;
	}
	public double getBalance() {
		return this.balance;
	}
	
//	 deposit method
	 public void deposit (double amount) {
		 this.balance = this.balance + amount;
		 System.out.println("total balance after deposit:- " + getBalance());
	 }
	 
//	 withdrawal method
	 public void withdrawal (double amount) {
		 if (amount > this.balance) {
			 System.out.println("Insufficient fund transfer " + getBalance());
			
		} else {
			this.balance = this.balance - amount;

			System.out.println("Total balance after withdrawal " + getBalance());
		}
		 
			}
	 
//		Fund Transfer
	 public void fundTransfer(Account targetAccount, double amount) {
		if (amount > this.balance) {
			System.out.println("Insuffiecient fund to transfer");
			
		} else {
			this.balance = this.balance - amount;
			targetAccount.balance = targetAccount.balance + amount;
			
			System.out.println("Transferred " + amount + " from " + this.accNo + " to " + targetAccount.accNo);
			System.out.println("Your new balance " + this.getBalance());
			System.out.println("Receiver's new balance " + targetAccount.getBalance());

		}
		 


	 }
}

