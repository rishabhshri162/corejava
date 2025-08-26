package in.co.rays.basic;

public class TestString {
	public static void main(String[] args) {

		String name = "Rishabh Shrivastava";
System.out.println("Name: " + name);
System.out.println("Name length is " +name.length());
System.out.println("3th Character is: " + name.charAt(3));
System.out.println("Sh index is: " + name.indexOf("Sh"));
System.out.println("First s position: " + name.indexOf("s"));
System.out.println("Last s position: " + name.lastIndexOf("s"));	
System.out.println("h is replaced by b: " + name.replace("h", "b"));
System.out.println("lowercase: " + name.toLowerCase());
System.out.println("Uppercase: " + name.toUpperCase());
System.out.println("Starts with Rishabh: " + name.startsWith("Rishabh"));
System.out.println("Ends with ava: " + name.endsWith("ava"));
System.out.println("Substring: " + name.substring(6));
	
	
	
	
	
	}
}
