package com.siemens.bankingmodels;

import java.time.LocalDate;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Account {
	
   private long runningTotal;
   private LocalDate openingDate;
   public Account(long runningTotal, LocalDate openingDate) {
		//invoke another constructor
		this(runningTotal);
		this.openingDate = openingDate;
	}
   
   public Account(long runningTotal) {
	   this.runningTotal=runningTotal+500;
	   
   }
/*
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Running Toal="+runningTotal+","+"Opening Date="+openingDate;
		}
  */ 
   
   
}
