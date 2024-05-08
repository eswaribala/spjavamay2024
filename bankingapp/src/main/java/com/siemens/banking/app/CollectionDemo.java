package com.siemens.banking.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.siemens.bankingmodels.Address;
import com.siemens.bankingmodels.Customer;
import com.siemens.bankingmodels.FullName;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList<Customer>  linkedList=new LinkedList<Customer>();  
       Customer customer=null;
       for(int i=0;i<100;i++) {
     	  //customer object
     	  customer=new Customer();
     	  customer.setAccountNo(new Random().nextInt(1000000));
     	  customer.setName(new FullName("customer","",String.valueOf(i)));
     	  customer.setAddress(new Address("","","",""));
     	  customer.setContactNo(new Random().nextInt(999999999));
     	  customer.setEmail("customer"+i+"@gmail.com");
     	  customer.setPassword("Test"+new Random().nextInt(10000)
     			  +LocalDate.now().getDayOfMonth());  
     	  linkedList.addFirst(customer);
     	  
       }
       System.out.println(linkedList.size());
       for(Customer customerObj: linkedList) {
    	   System.out.println(customerObj);
       }
       customer=new Customer();
  	  customer.setAccountNo(new Random().nextInt(1000000));
  	  customer.setName(new FullName("customer","",String.valueOf(new Random().nextInt(100))));
  	  customer.setAddress(new Address("","","",""));
  	  customer.setContactNo(new Random().nextInt(999999999));
  	  customer.setEmail("customer"+new Random().nextInt(100)+"@gmail.com");
  	  customer.setPassword("Test"+new Random().nextInt(10000)
  			  +LocalDate.now().getDayOfMonth());  
  	  
  	 linkedList.addLast(customer);
  	  System.out.println(linkedList.size());
  	 
	}

}
