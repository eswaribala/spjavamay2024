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
		Corporate corporate1=Corporate.builder().accountNo(8458435)
				.name(new FullName())
				.email("param@gmail.com")				
				.password("Test@123")
				.address(new Address())				
				.contactNo(1234567890L)
				.companyType(CompanyType.PRIVATE)
				.build();
		System.out.println(corporate1);
		Corporate corporate2=null;
		try {
		corporate2=(Corporate) corporate1.clone();
		System.out.println(corporate2);
		}catch(CloneNotSupportedException exception) {
			System.out.println(exception.getMessage());
		}
		
       corporate1.setAccountNo(437576);
       corporate1.setName(new FullName("Parameswari","",""));
       System.out.println(corporate2.getAccountNo());
       System.out.println(corporate1.getAccountNo());
       System.out.println(corporate1.getName().getFirstName());
       System.out.println(corporate2.getName().getFirstName());
     
	}

}
