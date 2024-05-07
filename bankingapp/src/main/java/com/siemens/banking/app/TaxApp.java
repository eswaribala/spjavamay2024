package com.siemens.banking.app;

import java.util.Scanner;

import com.siemens.bankingmodels.Gender;

public class TaxApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary=0;
		Gender gender=null;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your Salary");
		salary=scanner.nextInt();
		//to read enter key
		scanner.nextLine();
		System.out.println(salary);
		System.out.println("Enter Gender");
		//string to enum
		gender=Gender.valueOf(scanner.nextLine());
		System.out.println(gender);
		System.out.println(computeTaxSwitch(gender,salary));

	}
	
	
	public static String computeTax(Gender gender, int salary) {
		double tax=0.0;
		String message=null;
		if(gender.equals(Gender.MALE)){
			
			if((salary>0)&&(salary<=180000)) {
				message= "No Tax";
			}
			else if((salary>=180001)&&(salary<=500000)){
				
				tax=salary*.10;
				message="Computed Tax="+tax;
			}
			else if((salary>=500001)&&(salary<=800000)){
				
				tax=salary*.20;
				message="Computed Tax="+tax;
			}else {
				tax=salary*.30;
				message="Computed Tax="+tax;
			}
			
			return message;
		}else
		{
			if((salary>0)&&(salary<=190000)) {
				message= "No Tax";
			}
			else if((salary>=190001)&&(salary<=500000)){
				
				tax=salary*.10;
				message="Computed Tax="+tax;
			}
			else if((salary>=500001)&&(salary<=800000)){
				
				tax=salary*.20;
				message="Computed Tax="+tax;
			}else {
				tax=salary*.30;
				message="Computed Tax="+tax;
			}
			
			return message;
		}
		
		
	}
	public static String computeTaxSwitch(Gender gender, int salary) {
		double tax=0.0;
		String message=null;		
		  
		//switch by enum
		  switch(gender) {
		  
		  case MALE:
			  //switch by range
			  switch(range(salary)) {
			   
			   case 1:
				   message= "No Tax";
				   break;
			   case 2:
				   tax=salary*.10;
					message="Computed Tax="+tax;
				   break;
			   case 3:
				   tax=salary*.20;
					message="Computed Tax="+tax;
					break;
			   case 4:
				   tax=salary*.30;
					message="Computed Tax="+tax;
					break;
			      
			   }
				
				break;
				
				
		  case FEMALE:
			  if((salary>0)&&(salary<=190000)) {
					message= "No Tax";
				}
				
			  switch(range(salary)) {
			   
			  
			   case 2:
				   tax=salary*.10;
					message="Computed Tax="+tax;
				   break;
			   case 3:
				   tax=salary*.20;
					message="Computed Tax="+tax;
					break;
			   case 4:
				   tax=salary*.30;
					message="Computed Tax="+tax;
					break;
			      
			   }
			  
				break;
				
			default:
				message= "Nothing computed";
			  
		  
		  }
		
		
		return message;	
				
		
		
	}
	
	public static int range(int salary) {
		if((salary>0)&&(salary<=180000))
			return 1;
		else if((salary>=180001)&&(salary<=500000))
			return 2;
		else if((salary>=500001)&&(salary<=800000))
			return 3;
		else
			return 4;
	}
	
}
