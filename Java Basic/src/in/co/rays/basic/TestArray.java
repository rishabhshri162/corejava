package in.co.rays.basic;

public class TestArray {
public static void main(String[] args) {
	int[] a = {2,4,6,8,10};
	System.out.println(a[0]+"," + a[2]);
	
	System.out.println("--------");
	
	System.out.println("Length = " + a.length);
	
	for (int i = 0; i < a.length; i++) {
		System.out.println(i + "=" + a[i]);
//		System.out.println(a[i]);
		
		
	}
}
}