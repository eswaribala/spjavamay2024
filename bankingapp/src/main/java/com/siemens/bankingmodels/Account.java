package com.siemens.bankingmodels;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class Account {
	
   private long runningTotal;
   private LocalDate openingDate;
   public Account(long runningTotal, LocalDate openingDate) {
		//invoke another constructor
		this(openingDate);
		//this.runningTotal=runningTotal;
		this.openingDate = openingDate;
	}
   
   public Account(LocalDate openingDate) {
	   this.runningTotal=5000;
	   this.openingDate= openingDate.plus(2,ChronoUnit.DAYS);
	   
   }
    
  
   
}
