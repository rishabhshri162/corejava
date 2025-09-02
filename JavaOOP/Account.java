package com.rays.JavaOOP;

public class Account {
	private String number;
	private String accountType;
	private double balance;
	
	public String getnumber() {
		return this.number;
	}
	
	public void setnumber(String number) {
		this.number = number;
		
	}
	
	public String getaccountType() {
		return this.accountType;
	}
	public void setaccountType(String accountType){
		this.accountType = accountType;
		
	}
	
	public double getbalance() {
		return this.balance;
	}
	 public void setbalance(double balance) {
		 this.balance = balance;
		 
	 }
//	 deposit method
	 public void deposit (double amount) {
		 this.balance = this.balance + amount;
		 System.out.println("total balance after fund transfer:- " + getbalance());
	 }
	 
//	 withdrawal method
	 public void withdrawal (double amount) {
		 if (amount > this.balance) {
			 System.out.println("Insufficient fund transfer " + getbalance());
			
		} else {
			System.out.println("Total balance after withdrawal " + getbalance());
		}

	 }
	

}
