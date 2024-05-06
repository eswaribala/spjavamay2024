package com.siemens.bankingmodels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	
	private long accountNo;
	private FullName name;
	private long contactNo;
	private String email;
	private String password;
	private Address address;
	
	

}
