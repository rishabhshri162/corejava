package in.co.rays.basic;

//import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class LocalDateCalendar {
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date);

//		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//		String str = sdf.format(date);
//		System.out.println("------after formatting-----");
//		
//		System.out.println(str.format());
		

		LocalDate year = date.plusYears(1);
		System.out.println(year);

		LocalDate yesterday = date.minusDays(1);
		System.out.println(yesterday);

		LocalDate Tomorrow = date.plusDays(1);
		System.out.println(Tomorrow);

		LocalDate month = date.plusMonths(1);
		System.out.println(month);
	}
}
