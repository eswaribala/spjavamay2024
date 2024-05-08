package com.siemens.banking.app;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import com.siemens.bankingmodels.Address;
import com.siemens.bankingmodels.Customer;
import com.siemens.bankingmodels.FullName;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Enter size of the array");
			Scanner scanner=new Scanner(System.in);
			int size=scanner.nextInt();
			scanner.nextLine();

			 Customer[] customers=new Customer[size];
		      
		      //supplying data to array
		      for(int i=0;i<customers.length;i++) {
		    	  //customer object
		    	  customers[i]=new Customer();
		    	  customers[i].setAccountNo(new Random().nextInt(1000000));
		    	  customers[i].setName(new FullName("customer","",String.valueOf(i)));
		    	  customers[i].setAddress(new Address("","","",""));
		    	  customers[i].setContactNo(new Random().nextInt(999999999));
		    	  customers[i].setEmail("customer"+i+"@gmail.com");
		    	  customers[i].setPassword("Test"+new Random().nextInt(10000)
		    			  +LocalDate.now().getDayOfMonth());         	  
		      }
		      
		      try {
		      
		        System.out.println(customers[new Random().nextInt(100)]);
		      }	catch(ArrayIndexOutOfBoundsException ex) {
					System.out.println(ex.getMessage());
				}	      
		      for(Customer customer:customers) {	    	  
		    	  System.out.println(customer);	    	 
		      }
			}
			catch(InputMismatchException ex) {
				StackTraceElement[] stackTraceElements= ex.getStackTrace();
				for(StackTraceElement se: stackTraceElements ) {
					
					System.out.println(se.getFileName());
					System.out.println(se.getClassName());
					System.out.println(se.getMethodName());
					System.out.println(se.getLineNumber());
				}
				
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
				
			}

	}

}
