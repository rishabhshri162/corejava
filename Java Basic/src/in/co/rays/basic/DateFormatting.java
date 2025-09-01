package in.co.rays.basic;

import java.text.SimpleDateFormat;

import java.util.Date;

public class DateFormatting {
	
	public static void main(String[] args) {
		Date d = new Date ();
		System.out.println("----before formatting-----");
		System.out.println("Date:- "+d);
		
		System.out.println();
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String str = sdf.format(d);
		System.out.println("------after formatting-----");
		
		System.out.println("Date:- "+ str);
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("h:mm a");
		String str1 = sdf1.format(d);
		
		System.out.println();
		
		System.out.println("------For time -----");
		
		System.out.println("Date:- "+ str1);
		
		
		
	}

}
