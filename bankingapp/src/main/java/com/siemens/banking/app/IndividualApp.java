package com.siemens.banking.app;

import java.time.LocalDate;

import com.siemens.bankingmodels.Address;
import com.siemens.bankingmodels.FullName;
import com.siemens.bankingmodels.Gender;
import com.siemens.bankingmodels.Individual;

public class IndividualApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Individual individual=Individual.builder().accountNo(8458435)
				.name(new FullName())
				.email("param@gmail.com")
				.gender(Gender.FEMALE)
				.password("Test@123")
				.address(new Address())
				.dob(LocalDate.of(1970, 12, 2))
				.contactNo(1234567890L)
				.build();
		System.out.println(individual);
						
		
	

		
	}

}
