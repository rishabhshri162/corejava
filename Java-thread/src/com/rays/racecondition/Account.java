package com.rays.racecondition;

public class Account {
	private int balance;

	public int getBalance() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		return balance;
	}

	public void setBalance(int balance) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		this.balance = balance;
	}

	public synchronized void deposit(String name, int amt) throws InterruptedException {

		int total = getBalance();
		total = total + amt;
		setBalance(total);
		System.out.println(name + " new balance " + getBalance());

	}

}
