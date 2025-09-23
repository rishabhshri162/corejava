package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
	public static void main(String[] args) throws Exception {
		
		FileWriter file = new FileWriter("D://IO//NEW FILE.txt");
		
		file.write("Hey This is my new program");
		
	
		
		file.close();
		
		System.out.println("Data inserted successfully");
		
	}
	

}
