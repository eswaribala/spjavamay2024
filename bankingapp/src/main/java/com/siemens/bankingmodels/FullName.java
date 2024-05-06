package com.siemens.bankingmodels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data

@AllArgsConstructor
@NoArgsConstructor
public class FullName {

	private String firstName;
	private String middleName;
	private String lastName;
}
