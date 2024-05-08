package com.siemens.banking.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

import com.siemens.banking.app.facades.CustomerDAO;
import com.siemens.banking.app.helpers.MySQLHelper;
import com.siemens.bankingmodels.Address;
import com.siemens.bankingmodels.Customer;

public class CustomerDAOImpl implements CustomerDAO{

	private static Connection conn;
	private PreparedStatement prepareStatement;
	private ResourceBundle rb;
	
	
	
	public CustomerDAOImpl() throws ClassNotFoundException, SQLException {
		super();
		conn=MySQLHelper.getConnection();
		rb=ResourceBundle.getBundle("db");
	}

	@Override
	public String addCustomer(Customer customer) throws SQLException{
		// TODO Auto-generated method stub
		prepareStatement=conn.prepareStatement(rb.getString("addcustomer"));
		prepareStatement.setLong(1, customer.getAccountNo());
		prepareStatement.setString(2, customer.getName().getFirstName());
		prepareStatement.setString(3, customer.getName().getMiddleName());
		prepareStatement.setString(4, customer.getName().getLastName());
		prepareStatement.setLong(5, customer.getContactNo());
		prepareStatement.setString(6, customer.getEmail());
		prepareStatement.setString(7, customer.getPassword());
		prepareStatement.setString(8, customer.getAddress().getDoorNo());
		prepareStatement.setString(9, customer.getAddress().getStreetName());
		prepareStatement.setString(10, customer.getAddress().getCity());
		prepareStatement.setString(11, customer.getAddress().getState());
		int rows=prepareStatement.executeUpdate();
		if(rows>0)
			return "Customer Added";
		else
			return "Customer not Added";
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
	public boolean deleteCustomerByAccountNo(long accountNo) {
		// TODO Auto-generated method stub
		return false;
	}


}
