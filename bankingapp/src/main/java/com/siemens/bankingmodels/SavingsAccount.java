package com.siemens.bankingmodels;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor

public class SavingsAccount extends Account implements Runnable{

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Called Savings Thread");
	}

	

}
