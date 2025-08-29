package in.co.rays.basic;

public class StringAndStringBuffer {

	public static void main(String[] args) {

//		String is immutable (cannot be changed)

		String s = ("Rays");

		s.toLowerCase(); // immutable

		System.out.println(s);

		System.out.println("-------------");

//			StringBuffer is mutable (can be changed)

		StringBuffer sb = new StringBuffer("Sun");

		sb.append(" Rays"); // mutable

//	sb.reverse(); for reverse

		System.out.println(sb);

	}
}
