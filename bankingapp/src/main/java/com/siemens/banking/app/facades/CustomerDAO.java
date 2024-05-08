package com.siemens.banking.app.facades;

import java.sql.SQLException;
import java.util.List;

import com.siemens.bankingmodels.Address;
import com.siemens.bankingmodels.Customer;

public interface CustomerDAO {
	//CRUD operation with mysql
	String addCustomer(Customer customer) throws SQLException;
	Customer editCustomer(long accountNo, long contactNo, Address address);
	List<Customer> fetchAllCustomers();
	Customer fetchCustomerByAccountNo(long accountNo) throws SQLException ;
	boolean deleteCustomerByAccountNo(long accountNo);

}
