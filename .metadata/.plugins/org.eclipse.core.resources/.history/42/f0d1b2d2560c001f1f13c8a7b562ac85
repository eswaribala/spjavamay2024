package com.siemens.bankingmodels;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@AllArgsConstructor
@ToString(callSuper = true)
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Individual extends Customer{

	static int membershipAmount;
	static {
		membershipAmount=5000;
		System.out.println("Membership Amount="+membershipAmount);
	}
	private Gender gender;
	private LocalDate dob;
		
	
}
