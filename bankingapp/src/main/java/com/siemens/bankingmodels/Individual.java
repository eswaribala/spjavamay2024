package com.siemens.bankingmodels;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Individual extends Customer{
//implements Comparable<Individual>{

	private Gender gender;
	private LocalDate dob;
	/*
	@Override
	public int compareTo(Individual o) {
		// TODO Auto-generated method stub
		
		if(this.accountNo == o.accountNo)
			return 0;
		else if(this.accountNo < o.accountNo)
			return -1;
		else
			return 1;
			
		//return this.dob.compareTo(o.dob);
	}	*/
	
	
	
}
