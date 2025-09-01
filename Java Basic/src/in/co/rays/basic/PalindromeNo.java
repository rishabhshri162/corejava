package in.co.rays.basic;

public class PalindromeNo {
public static void main(String[] args) {

			int num = 131; 
			int r = 0; 
			int sum = 0;
			int n = num;

			while (n!=0) {

				r = n % 10;
				sum = (sum * 10) + r;
				n = n / 10;

			}

			if (sum == num) {

				System.out.println("This is palindrome");

			} else {

				System.out.println("This is not palindrome");

			}

		}

	}

