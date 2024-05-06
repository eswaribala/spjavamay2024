package com.siemens.bankingmodels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data

@AllArgsConstructor
@NoArgsConstructor
public class Address {
	private String doorNo;
	private String streetName;
	private String city;
	private String state;	
	
}
