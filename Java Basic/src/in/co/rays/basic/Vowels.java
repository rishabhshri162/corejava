package in.co.rays.basic;

public class Vowels {
	public static void main(String[] args) {
		String vowels = "Rishabh";
		int count = 0;
		
		for (int i = 0; i < vowels.length(); i++) {
			if ('a' == vowels.charAt(i) || 'e' == vowels.charAt(i) || 'i' == vowels.charAt(i) || 'o' == vowels.charAt(i) || 'u' == vowels.charAt(i)) {
				count++;
			}
			}
		System.out.println("Total number of vowels in Rishabh is: " + count);

	}
}
