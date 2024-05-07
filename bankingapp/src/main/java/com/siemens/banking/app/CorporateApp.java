package com.siemens.banking.app;

import java.time.LocalDate;

import com.siemens.bankingmodels.Address;
import com.siemens.bankingmodels.CompanyType;
import com.siemens.bankingmodels.Corporate;
import com.siemens.bankingmodels.FullName;
import com.siemens.bankingmodels.Gender;
import com.siemens.bankingmodels.Individual;

public class CorporateApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Corporate corporate=Corporate.builder().accountNo(8458435)
				.name(new FullName())
				.email("param@gmail.com")				
				.password("Test@123")
				.address(new Address())				
				.contactNo(1234567890L)
				.companyType(CompanyType.PRIVATE)
				.build();
		System.out.println(corporate);
						
	}

}
