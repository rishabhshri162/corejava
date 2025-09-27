package com.rays.io.serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccountSerilization {
	
	public static void main(String[] args) throws Exception {

		Account a = new Account(85000.00, 1234);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://IO//Account.xls"));

		// Account object convert into byte stream successfully
		out.writeObject(a);
		
		out.close();
		System.out.println("Object convert into byte stream successfully");

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://IO//Account.xls"));

		// byte stream convert into Account object
		a = (Account) in.readObject();
		System.out.println(a);
	
		in.close();

	}

}
