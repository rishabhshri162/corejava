package com.rays.exception;

public class TestLogin {
	public static void main(String[] args) throws LoginException {
		String LoginId = "admin@gmail.com";
		
		if (LoginId != null && LoginId == "admin@gmail.com"){
			System.out.println("User login successfull");
			
		}else {
			throw new LoginException("Invalid login id");
		}
	}

}
