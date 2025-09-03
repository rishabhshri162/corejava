package com.rays.JavaOOP.Inheritance;

public class Student extends Person{
	private String rollNo;
	private int marks;
	
	public String getRollNo() {
		return this.rollNo;
	}
	

   public void setRollNo(String rollno) {
		this.rollNo = rollno;
	}
	

	public int getMarks() {
		return this.marks;
	}
	

  public void setMarks(int marks) {
		this.marks = marks;
	}
	

}
