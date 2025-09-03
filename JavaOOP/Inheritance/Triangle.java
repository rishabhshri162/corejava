package com.rays.JavaOOP.Inheritance;

public class Triangle extends Shape{
	
	private int base;
	private int height;
	
	public int getBase() {
		return this.base;
	}
	public void setbase(int base) {
		this.base = base;
	}
	
	public int getHeight() {
		return this.height;
	}
	public void setHeight(int height) {
		this.height = height;
		
	}
	public double area(){
		double area = base*height;
		return area;
	}
	}
