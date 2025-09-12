package com.rays.exception;

public class TestAccount {
	public static void main(String[] args) throws FundTransferException {

		Account a = new Account();
       
        a.setBalance(5000);
        
        a.withdrawal(6000);
       

	}
}
