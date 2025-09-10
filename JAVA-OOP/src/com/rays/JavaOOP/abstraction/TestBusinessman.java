package com.rays.JavaOOP.abstraction;

public class TestBusinessman {
	public static void main(String[] args) {
		Richman r = new Businessman();
		r.donation();
		r.earnMoney();
		r.party();
		
		
		SocialWorker sw = new Businessman();
		sw.helpToOthers();
		
	
		Person p = new Businessman();
		p.getName();
	
		
		
	
	}

}
