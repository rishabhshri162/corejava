package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWriteBinaryFile {
	
	public static void main(String[] args) throws Exception {
		
		
		String source = "D://IO//ironman.jpg";
		String target = "D://IO//lohamanav.jpg";
		
		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);
		
		
		int i = in.read();
		while (i != -1) {
			out.write(i);
			i = in.read();
			
			
		}
		out.close();
		in.close();
		
	}

}
