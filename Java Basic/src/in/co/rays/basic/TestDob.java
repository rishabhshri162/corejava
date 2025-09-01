package in.co.rays.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDob {
	public static void main(String[] args) throws ParseException {
		
//		DATE OF BIRTH IN STRING FORMAT
		
		String dob = "2002-06-01";
		System.out.println("DOB: " + dob);
	
		
//		PARSE METHOD CONVERT STRING to Date FORMAT
		
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
        Date date = sdf.parse(dob);
        System.out.println(date);
	}

}
