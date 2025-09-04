package com.rays.JavaOOP.overriding;

public class TestShape {
	public static void main(String[] args) {
		System.out.println("-----CIRCLE-----");
		Shape s = new Circle();
		
//		TypeCasting
		Circle c = (Circle) s;
		
		c.setColor("Red");
		c.setBorderWidth(5);
		c.setRadius(5);
		
		System.out.println("Color= " + c.getColor());
		System.out.println("BW= " + c.getBorderWidth());
		System.out.println("Radius= " + c.getRadius());
		System.out.println("Area= " + s.area());
		
		
		System.out.println("-----TRIANGLE-----");
		Shape s1 = new Triangle();
		Triangle t = (Triangle) s1;
		
		t.setBase(5);
		t.setHeight(5);
		t.setBorderWidth(5);
		t.setColor("Blue");
		
		System.out.println("Base " + t.getBase());
		System.out.println("height= " + t.getHeight());
		System.out.println("BW= " + t.getBorderWidth());
		System.out.println("Color= " + t.getColor());
		System.out.println("Area= " + s1.area());
		
		System.out.println("-----RECTANGLE-----");
		Shape s3 = new Rectangle();
		Rectangle R = (Rectangle) s3;
		
		R.setLength(5);
		R.setWidth(5);
		R.setBorderWidth(5);
		R.setColor("Blue");
		
	System.out.println("LENGTH= " + R.getLength());
	System.out.println("WIDTH= " + R.getWidth());
	System.out.println("BW= " + R.getBorderWidth());
	System.out.println("COLOR= " +  R.getColor());
	System.out.println("AREA= " + s3.area());
	}


}
