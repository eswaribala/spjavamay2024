package com.siemens.bankingmodels;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
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
/*
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Running Toal="+runningTotal+","+"Opening Date="+openingDate;
		}
  */ 
   
   
}
