package com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class InputFromKeyword {
	public static void main(String[] args) throws Exception {
		
PrintWriter out = new PrintWriter(new FileWriter("D://IO//scanner.txt"));

InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(isr);

String line = in.readLine();
while (!line.equals("quit")) {
	out.println(line);
	line = in.readLine();
	
}
in.close();out.close();isr.close();
		
		
		
	}

}
