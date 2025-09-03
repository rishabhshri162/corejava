package com.rays.JavaOOP.Inheritance;

public class TestTriangle {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.setbase(10);
		t.setHeight(10);
		t.setColor("Red");
		t.setBorderWidth(2);
		
		System.out.println("Base:- " + t.getBase());
		System.out.println("Height:- " + t.getHeight());
		System.out.println("Color:- " + t.getColor());
		System.out.println("BorderWidth:- " + t.getBorderWidth());
		System.out.println("Area:- " + t.area());
	    
	}

}
