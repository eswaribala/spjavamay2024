package com.siemens.banking.app;

import com.siemens.bankingmodels.SavingsAccount;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Thread.currentThread().getName());
		
		TitleThread titleThread=new TitleThread("Parameswari");
		titleThread.start();
		
		SavingsAccount savingsAccount=new SavingsAccount();
		Thread thread=new Thread(savingsAccount);
		thread.start();
	}

}
