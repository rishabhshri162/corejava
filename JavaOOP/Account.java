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
	

}
