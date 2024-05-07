package com.siemens.bankingmodels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer {
	
	protected long accountNo;
	protected FullName name;
	protected long contactNo;
	protected String email;
	protected String password;
	protected Address address;
	
	

}
