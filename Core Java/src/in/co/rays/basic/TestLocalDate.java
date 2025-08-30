package in.co.rays.basic;

import java.time.LocalDate;

public class TestLocalDate {
	
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Date: " + date);
		System.out.println("Day of month: " + date.getDayOfMonth());
		System.out.println("Day of week: " + date.getDayOfWeek());
		System.out.println("Day of year: " + date.getDayOfYear());
		
		System.out.println("------------------");
		
//		FOR DATE OF BIRTH USING LOCAL DATE
		
		LocalDate dob = LocalDate.of(2002, 06, 01);
		System.out.println("Date: " + dob);
		System.out.println("Day of month: " + dob.getDayOfMonth());
		System.out.println("Day of week: " + dob.getDayOfWeek());
		System.out.println("Day of year: " + dob.getDayOfYear());
		
		System.out.println("---------------");
		
//		For AGE
		
		
		System.out.println("Age: " + (date.getYear()- dob.getYear()));
		
	}

}
