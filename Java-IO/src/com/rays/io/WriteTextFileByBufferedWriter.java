package com.rays.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFileByBufferedWriter {
public static void main(String[] args) throws Exception {
	
	BufferedWriter bw = new BufferedWriter(new FileWriter("D://IO//Rays.txt"));
	
	bw.write("Hello im new here\nMy name is Rishabh");
	
	bw.close();
	
	System.out.println("Successfully");
	
}
}
