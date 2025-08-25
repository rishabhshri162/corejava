package in.co.rays.basic;

public class Swapping {
	
     public static void main(String[] args) {
		 int a = 50;
		 int b = 100;
//		 int c = 0;
	  System.out.println("Before Swapping");	 
      System.out.println("a=" +a);
      System.out.println("b=" +b);
      
//      c=a;
//      a=b;
//      b=c;
      a = a + b;
      b = a - b;
      a = a - b;
      
      
      System.out.println("After swapping");
      System.out.println("a=" +a);
      System.out.println("b=" +b);
     }
}
