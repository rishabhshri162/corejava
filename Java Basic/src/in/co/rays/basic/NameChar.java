<<<<<<< HEAD
package in.co.rays.basic;

public class NameChar {
	public static void main(String[] args) {

		String str = "aabbccggf";

		int count = 0;

		for (char c = 'a'; c <= 'z'; c++) {
         for (int i = 0; i<str.length(); i++) {
        	 if (c== str.charAt(i)) {
        		 count++;
        	 }
        	 
        	 
         }
         if (count > 0) {
        	 System.out.println(c + "=" + count);
        	 count = 0;
         }
		
		}
	}
}
=======
package in.co.rays.basic;

public class NameChar {
	public static void main(String[] args) {

		String str = "aabbccggf";

		int count = 0;

		for (char c = 'a'; c <= 'z'; c++) {
         for (int i = 0; i<str.length(); i++) {
        	 if (c== str.charAt(i)) {
        		 count++;
        	 }
        	 
        	 
         }
         if (count > 0) {
        	 System.out.println(c + "=" + count);
        	 count = 0;
         }
		
		}
	}
}
>>>>>>> 603a5a332a4c3c2f556f91afed7a8d9c7666ff31
