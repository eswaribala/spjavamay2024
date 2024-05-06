package com.siemens.banking.app;

import com.siemens.bankingmodels.Address;
import com.siemens.bankingmodels.Customer;
import com.siemens.bankingmodels.FullName;

//Entry point for banking application
/**
 * @author Parameswari Bala
 * @version 1.0.0
 * @since 6-May-2024
 */
public class App {
	
/*
 * Java starts the execution from main
 */
	public static void main(String[] args) {
	/**
	 * understanding the System and PrintStream relationship
	 */
		// TODO Auto-generated method stub
           System.out.println("Rocking with Java.....");
           
     //create customer object
       Customer customer=new Customer();        
       customer.setAccountNo(25432654L);
       customer.setName(new FullName("Paramewari","","Bala"));
       customer.setAddress(new Address("18d","First St","Chennai","TN"));
       customer.setEmail("Param@gmail.com");
       customer.setContactNo(1234567890L);
       customer.setPassword("Test@123");      
       
       //show the data
       System.out.println(customer);
      
       if(customer.getPassword().startsWith("T"))
    	   System.out.println("Generic, change the password");
       else
    	   System.out.println("Password accepted");
    		   
    		   
           
           
	}
	

}
