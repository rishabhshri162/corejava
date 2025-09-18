package com.rays.collection.equalsAndHashcode;

public class Student {
	
	private String name;
	private int rollNO;
	
	public Student(String name, int rollNo) {
      this.name= name;
      this.rollNO = rollNo;
      
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			System.out.println("Object null hai!");
			return false;
			
		}
		if (!(obj instanceof Student)) {
			return false;
			
		}
		Student s =(Student) obj;
		if (this.name == s.name && this.rollNO == s.rollNO) {
			System.out.println("Value same hai!");
			return true;
			
		} else {
         System.out.println("value same nahi hai");
         return false;
		}
		
	

	}
	@Override
	public int hashCode() {
		String value = "name" + "rollNo";
		return value.hashCode();
	}
	
	
	

}
