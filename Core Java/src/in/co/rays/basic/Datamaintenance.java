package in.co.rays.basic;

import java.util.Calendar;

public class Datamaintenance{

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();

		for (int a = 1; a <= 12; a++) {

			c.add(Calendar.DATE, 30);

			System.out.println(c.getTime());
		}
	}

}
