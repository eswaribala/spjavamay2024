package com.siemens.banking.app;

import java.time.LocalDate;

import com.siemens.bankingmodels.Account;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account=new Account(LocalDate.of(2023, 1,25));
		System.out.println(account);
		
	}

}
