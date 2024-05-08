package com.siemens.banking.app.facades;

import java.util.Comparator;

import com.siemens.bankingmodels.Customer;


public class CustomerSorter implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		if(o1.getContactNo() == o2.getContactNo()) 
			return 0; 
		else if(o1.getContactNo() < o2.getAccountNo()) 
			return -1; 
		else return 1;
	}

}
