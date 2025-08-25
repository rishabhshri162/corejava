package in.co.rays.basic;

public class MinNoArray {
	
	public static void main(String[] args) {
		
		
	int [] a = {10,20,30};
	int min = a[0];
	
	for (int i = 0; i>a.length; i--) {
		if ( a[i] < min) {
			min = a[i];
			
			
		}
		
		
	}
	System.out.println("Minimum number is " + min );


}
}



