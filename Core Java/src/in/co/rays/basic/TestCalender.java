package in.co.rays.basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalender {
	public static void main(String[] args) {

		Date today = new Date();
		System.out.println(today);

		System.out.println("-------------------");
		System.out.println();
		System.out.println("AFTER FORMAT");

		Calendar cal = Calendar.getInstance();
		cal.setTime(today);

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy  HH:mm:ss");

		System.out.println(sdf.format(cal.getTime()));

		System.out.println();
		System.out.println("--------------------");
		System.out.println("Yesterday Date & Time");

		cal.add(Calendar.DATE, -1);

		System.out.println(sdf.format(cal.getTime()));
		System.out.println();
		System.out.println("---------------");
		System.out.println();

//		cal.add(Calendar.DATE, +1);
//		
//		System.out.println(sdf.format(cal.getTime()));
//		System.out.println();
//		System.out.println("---------------");
//		System.out.println();
//		 
        System.out.println("Date after 1 month");
		cal.add(Calendar.DATE, 30);
		System.out.println(sdf.format(cal.getTime()));

	}

}
