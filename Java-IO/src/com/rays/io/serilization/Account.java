package com.rays.io.serilization;

import java.io.Serializable;

public class Account implements Serializable{
	private double balance;
	private transient int pin;

	public Account(double balance, int pin) {
		this.balance = balance;
		this.pin = pin;

	}
@Override
public String toString() {
	
	return "balance: " + balance + " pin: " + pin;
}
}
