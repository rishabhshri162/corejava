package com.rays.JavaOOP.Encapsulation;

public class Automobile {
	private String color;
	private int Speed;
	private String Brand;
	public static final int NO_OF_GEARS = 5;

	public String getColor() {
		return this.color;

	}

	public void setColor(String color) {
		this.color = color;

	}

	public int getSpeed() {
		return this.Speed;
	}

	public void setSpeed(int Speed) {
		this.Speed = Speed;
	}

	public String getBrand() {
		return this.Brand;

	}

	public void setBrand(String Brand) {
		this.Brand = Brand;
	}

	public void accelerator() {
		Speed = Speed + 10;
		System.out.println("Accelerated. Current speed: " + this.Speed + " km/h");
	}

	public void brake() {
		Speed = Speed - 10;
		if (Speed < 0)
			Speed = 0;
		System.out.println("Braked. Current speed: " + this.Speed + " km/h");
	}

	public void changeGear(int gear) {
		if (gear > 0 && gear <= NO_OF_GEARS) {
			System.out.println("Gear changed to: " + gear);
		} else {
			System.out.println("Invalid gear. Please select gear between 1 and " + NO_OF_GEARS);
		}
	}
}


