package com.rays.JavaOOP.constructor;

public class Automobile {
	private String color;
	private int speed;
	private String brand;
	public static final int NO_OF_GEARS = 5;

	public Automobile(String color, int speed, String brand) {
		this.color = color;
		this.speed = speed;
		this.brand = brand;
	}

	public String getColor() {
		return this.color;
	}

	public int getSpeed() {
		return this.speed;
	}

	public String getBrand() {
		return this.brand;
	}

	public void accelerator() {
		speed = speed + 10;
		System.out.println("Accelerated. Current speed: " + this.speed + " km/h");
	}

	public void brake() {
		speed = speed - 10;
		if (speed < 0)
			speed = 0;
		System.out.println("Braked. Current speed: " + this.speed + " km/h");
	}

	public void changeGear(int gear) {
		if (gear > 0 && gear <= NO_OF_GEARS) {
			System.out.println("Gear changed to: " + gear);
		} else {
			System.out.println("Invalid gear. Please select gear between 1 and " + NO_OF_GEARS);
		}
	}

}
