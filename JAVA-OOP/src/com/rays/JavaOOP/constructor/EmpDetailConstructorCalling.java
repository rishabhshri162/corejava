package com.rays.JavaOOP.constructor;

//Child class calling parent class

public class EmpDetailConstructorCalling  extends EmployeeConstructorCalling{
 public EmpDetailConstructorCalling (String name, int id, double salary, String workingHours, String workingDays) {
	 super(name, id, salary, workingHours);
	 System.out.println("Working Days: " + workingDays);
 }
 
 public static void main(String[] args) {
	 EmpDetailConstructorCalling ed = new EmpDetailConstructorCalling("Ram", 562, 96253, "8 hours", "126 Days");
}

}
