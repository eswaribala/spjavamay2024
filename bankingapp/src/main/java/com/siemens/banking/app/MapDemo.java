package com.siemens.banking.app;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

import com.siemens.bankingmodels.Address;
import com.siemens.bankingmodels.Customer;
import com.siemens.bankingmodels.FullName;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeMap<Long,Customer> customers=new TreeMap<Long,Customer>();
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
     	 customers.put(customer.getAccountNo(), customer);
     	  
       }
      
      //read key and value
      
     Set<Map.Entry<Long, Customer>> set= customers.entrySet();
     Iterator<Map.Entry<Long,Customer>> itr= set.iterator();
		
     while(itr.hasNext()) {
    	 Map.Entry<Long, Customer> entry=  itr.next();
    	 System.out.print(entry.getKey()+"\t");
    	 System.out.println(entry.getValue());
     }
		
	}

}
