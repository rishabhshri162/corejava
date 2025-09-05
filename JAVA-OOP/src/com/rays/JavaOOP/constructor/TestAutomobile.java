package com.rays.JavaOOP.constructor;

public class TestAutomobile {
	public static void main(String[] args) {
		Automobile a = new Automobile("Red", 100, "Hyundai");
		 System.out.println("COLOR: " + a.getColor());
		 System.out.println("Speed: " + a.getSpeed());
		 System.out.println("Brand: " + a.getBrand());
		 System.out.println("Gear: " + a.NO_OF_GEARS);
		 
		 a.accelerator();
		 a.brake();
		 a.changeGear(5);
		 System.out.println("Final Speed: " + a.getSpeed() + " km/h");
	}

}
