package in.co.rays.basic;

public class Ques7 {
	
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 101; i < 200; i++) {
//			System.out.println(i);

			if (i % 7 <= 0) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println(sum);

	}

}