package com.siemens.banking.app.facades;

import java.util.List;

import com.siemens.bankingmodels.Address;
import com.siemens.bankingmodels.Customer;

public interface CustomerDAO {
	//CRUD operation with mysql
	Customer addCustomer(Customer customer);
	Customer editCustomer(long accountNo, long contactNo, Address address);
	List<Customer> fetchAllCustomers();
	Customer fetchCustomerByAccountNo(long accountNo);
	boolean deleteCustomerByAccountNo(long accountNo);

}
