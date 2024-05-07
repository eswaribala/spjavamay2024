package com.siemens.banking.app;

import java.time.LocalDate;
import java.util.Random;

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
           
      //array of customers
           
      Customer[] customers=new Customer[5];
      
      //supplying data to array
      for(int i=0;i<customers.length;i++) {
    	  //customer object
    	  customers[i]=new Customer();
    	  customers[i].setAccountNo(new Random().nextInt(1000000));
    	  customers[i].setName(new FullName("name","","i"));
    	  customers[i].setAddress(new Address("","","",""));
    	  customers[i].setContactNo(new Random().nextInt(999999999));
    	  customers[i].setEmail("customer"+i+"@gmail.com");
    	  customers[i].setPassword("Test"+new Random().nextInt(10000)
    			  +LocalDate.now().getDayOfMonth());         	  
      }
         
     //view the data
      //enhanced for loop
      
      for(Customer customer:customers) {
    	  System.out.println(customer instanceof Object);
    	  System.out.println(customer);
      }
    		   
      Customer customer1=new Customer();
      customer1.setContactNo(1234567890);
      Customer customer2=customer1;
      Customer customer3=new Customer();
      if(customer1.equals(customer2))
    	  System.out.println("Same");
      else
    	  System.out.println("Not Same");
      
      if(customer1.equals(customer3))
    	  System.out.println("Same");
      else
    	  System.out.println("Not Same");
           
	}
	

}
