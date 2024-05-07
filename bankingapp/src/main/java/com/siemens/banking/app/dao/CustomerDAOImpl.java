package com.siemens.banking.app.dao;

import java.util.List;

import com.siemens.banking.app.facades.CustomerDAO;
import com.siemens.bankingmodels.Address;
import com.siemens.bankingmodels.Customer;

public class CustomerDAOImpl implements CustomerDAO{

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer editCustomer(long accountNo, long contactNo, Address address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> fetchAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer fetchCustomerByAccountNo(long accountNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCustomerVyAccountNo(long accountNo) {
		// TODO Auto-generated method stub
		return false;
	}

}
