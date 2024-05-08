package com.siemens.banking.app;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

import com.siemens.bankingmodels.Address;
import com.siemens.bankingmodels.FullName;
import com.siemens.bankingmodels.Gender;
import com.siemens.bankingmodels.Individual;
import com.siemens.bankingmodels.Customer;
public class IndividualApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //pure annotation based constructor 
		Individual[] individuals=new Individual[5];
		
		for(int i=0;i<individuals.length;i++) {
		individuals[i]=Individual.builder().accountNo(new Random().nextInt(1000000))
				.name(new FullName())
				.email("param@gmail.com")
				.gender(Gender.FEMALE)
				.password("Test@123")
				.address(new Address())
				.dob(LocalDate.of(1970+new Random().nextInt(40),1+new Random().nextInt(10) , 1+new Random().nextInt(25)))
				.contactNo(new Random().nextInt(999999999))
				.build();
		}
	
		System.out.println("Before Sorting......");
		for(Individual individual : individuals) {
			System.out.println(individual);
		}
		
		Arrays.sort(individuals);
		System.out.println("After Sorting......");
		for(Individual individual : individuals) {
			System.out.println(individual);
		}

		
	}

}
