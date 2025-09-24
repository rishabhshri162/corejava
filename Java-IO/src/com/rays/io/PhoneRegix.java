package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class PhoneRegix {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader("D://IO//phone.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("D://IO//ValidPhone.txt"));
		
		String phoneRegix= "^(?:(?:\\+91[- ]?)?[6-9]\\d{9}|(?:\\+1[- ]?)?(?:\\d{3}[- ]?\\d{3}[- ]?\\d{4}))$";
//				"^(\\+91[- ]?)?[6-9]\\d{9}$";

		String phone = br.readLine();

		while (phone != null) {
			if (phone.matches(phoneRegix)) {

			   System.out.println(phone);
				bw.write(phone);
				bw.newLine();

			}

			phone = br.readLine();

		}
		br.close();
		bw.close();
}

}