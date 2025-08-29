package in.co.rays.basic;

public class TestSwitchCase {

	public static void main(String[] args) {

		String day = "Sunday";
		
		switch (day) {
		case "Monday":
			System.out.println("1 day of the week");
           break;
		case "Tuesday":
			System.out.println("2 day of the week");
           break;
		case "wednesday":
			System.out.println("3 day of the week");
           break;
		case "Thursday":
			System.out.println("4 day of the week");
           break;
		case "friday":
			System.out.println("5 day of the week");
           break;
		case "Saturday":
			System.out.println("6 day of the week");
           break;
//		case "Sunday":
//			System.out.println("7 day of the week");
//           break;

		default:
			System.out.println("Today is Holiday!");
			break;
		}

	}

}
