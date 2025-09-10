package com.rays.JavaOOP.abstraction;

public class Businessman extends Person implements Richman, SocialWorker{
	
@Override
public void earnMoney() {
System.out.println("Earn money: " + 50000);
}

@Override
public void helpToOthers() {
	System.out.println("help to others");
	
}

@Override
public void donation() {
	System.out.println("Donation: " + 655645);
	
}

@Override
public void party() {
	System.out.println("party");
	}
@Override
	public void getName() {
		System.out.println("Ris");
		
	}
}
