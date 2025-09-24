package com.rays.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWritePrimitiveData {
	
	public static void main(String[] args) throws Exception {
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("D://IO//primitivedata.dat"));
		
		dos.writeInt(1);
		dos.writeBoolean(true);
		dos.writeChar('R');
		dos.writeDouble(1.0);
		
		System.out.println("Successfull");
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("D://IO//primitivedata.dat"));
		System.out.println(dis.readInt());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		System.out.println(dis.readDouble());
		
		
		
		
		
		
	}

}
