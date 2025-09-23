package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadTextFileByFileReader {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("D://IO//Hello worLd.txt");
		
		int i = fr.read();
		
		while (i != -1) {
			System.out.println((char)i);
			i = fr.read();
			
		}
		
		fr.close();
	}

}
