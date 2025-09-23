package com.rays.io;

import java.io.File;
import java.util.Date;

public class ReadFileAttributes {
	public static void main(String[] args) {
	
		File f = new File("D://IO//Hello.txt");
		
		if (f.exists()) {
			System.out.println("File name: " + f.getName());
			System.out.println("File path: " + f.getAbsolutePath());
			System.out.println("Readable or not: " + f.canRead());
			System.out.println("Writeable or not: " + f.canWrite());
			System.out.println("Is file or not: " + f.isFile());
			System.out.println("Is folder/Directory or not: " + f.isDirectory());
			Date d = new Date(f.lastModified());
			System.out.println("Last modified: " + d);
			System.out.println("Size: " + f.length());
			
		}
		
		
		
		
		
		
	}

}
