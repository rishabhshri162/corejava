package com.rays.JavaOOP.abstraction;

public class TestShape {
	public static void main(String[] args) {
		Shape s = new Circle();
		Circle c = (Circle) s;
		c.setRadius(5);
		System.out.println(c.getRadius());
		System.out.println(c.area());
		
		
		System.out.println("--------------");
		
		Shape s1 = new Rectangle();
		Rectangle r = (Rectangle) s1;
		r.setLength(10);
		r.setWidth(10);
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println(r.area());
		
		System.out.println("-------------");
		
		Shape s2 = new Triangle();
		Triangle t = (Triangle) s2;
		t.setBase(5);
		t.setHeight(5);
		System.out.println(t.getBase());
		System.out.println(t.getHeight());
		System.out.println(t.area());
		

	}
}