package com.siemens.banking.app.facades;

import java.util.Comparator;

import com.siemens.bankingmodels.Individual;

public class IndividualSorter implements Comparator<Individual>{

	@Override
	public int compare(Individual o1, Individual o2) {
		// TODO Auto-generated method stub
		if(o1.getAccountNo() == o2.getAccountNo()) 
			return 0; 
		else if(o1.getAccountNo() < o2.getAccountNo()) 
			return -1; 
		else return 1;
	}

}
