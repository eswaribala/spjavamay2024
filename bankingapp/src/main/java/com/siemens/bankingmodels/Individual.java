package com.siemens.bankingmodels;

import java.time.LocalDate;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Individual extends Customer{

	private Gender gender;
	private LocalDate dob;
	public Individual() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Individual(long accountNo, FullName name, long contactNo, String email, String password, Address address,
			Gender gender, LocalDate dob) {
		super(accountNo, name, contactNo, email, password, address);
		this.gender = gender;
		this.dob = dob;
	}
	
	
	
	
}
