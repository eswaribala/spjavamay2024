package com.siemens.bankingmodels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
//cloneable is the marker interface marking the class to be cloned (shallow copy)
//implementing clone method and how the clone has to happen -- deep copy
public class Corporate extends Customer implements Cloneable {
	private CompanyType companyType;

	//deep copy
	@Override
	public Corporate clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Corporate corporate= (Corporate) super.clone();
		return corporate;
	}
	

	
	
	
}
