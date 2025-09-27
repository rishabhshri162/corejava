package com.rays.io.serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployeeExternizable {
	public static void main(String[] args) throws Exception{
		Employee e = new Employee(1, 90000);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://IO//Employee.xls"));
		
		// Employee convert into byte stream successfully
		out.writeObject(e);
		
		out.close();
		System.out.println("Object convert into byte stream successfully");
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://IO//Employee.xls"));

		// byte stream convert into Employee object
		e = (Employee) in.readObject();
		System.out.println(e);
	
		in.close();
	}

}
