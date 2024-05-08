package com.siemens.banking.app.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class MySQLHelper {
	
	private static ResourceBundle rb;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		rb=ResourceBundle.getBundle("db");
		String userName=rb.getString("username");
		String password=rb.getString("password");
		String url=rb.getString("url");
		String driver=rb.getString("driver");
		Class.forName(driver);
		return DriverManager.getConnection(url,userName,password);
		
		
	}
	

}
