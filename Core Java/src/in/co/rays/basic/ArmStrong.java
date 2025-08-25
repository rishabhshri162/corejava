package in.co.rays.basic;

public class ArmStrong {
	public static void main(String[] args) {
		int num = 155;
		int n = num;
		int r = 0;
		int sum = 0;
		
		while (n!=0) {
			r= n%10;
			sum = sum + r*r*r;
			n = n / 10;
		}
		if (sum == num) {
			System.out.println("This is armstrong");
		} else {
			System.out.println("This is not armstrong");
		}
		
		
		
		
		
		
		
		
	}
	
	

}
