package com.rays.JavaOOP.Encapsulation;

public class TestAutomobile {
	public static void main(String[] args) {
		Automobile a1 = new Automobile();
		a1.setColor("Black");
		a1.setSpeed(200);
		a1.setBrand("Hyundai");
		
		System.out.println("Color:- " + a1.getColor());
		System.out.println("Speed:- " +a1.getSpeed());
		System.out.println("Brand:- " +a1.getBrand());
		System.out.println("Number of Gears: " + Automobile.NO_OF_GEARS);

		a1.accelerator();
		a1.changeGear(3);
		a1.accelerator();
		a1.brake();
		System.out.println("Final Speed: " + a1.getSpeed() + " km/h");

		
		System.out.println("---------------------");
		
		Automobile a2 = new Automobile();
		a2.setColor("White");
		a2.setSpeed(150);
		a2.setBrand("Toyota");
		
		System.out.println("Color:- " + a2.getColor());
		System.out.println("Speed:- " +a2.getSpeed());
		System.out.println("Brand:- " +a2.getBrand());
		
		System.out.println("---------------------");
		
		Automobile a3 = new Automobile();
		a3.setColor("Grey");
		a3.setSpeed(160);
		a3.setBrand("MG");
		
		System.out.println("Color:- " + a3.getColor());
		System.out.println("Speed:- " +a3.getSpeed());
		System.out.println("Brand:- " +a3.getBrand());

		
		
		
		

		
		
	}
	
	
	  

}
