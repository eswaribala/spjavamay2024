package com.siemens.banking.app;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.siemens.banking.app.exceptions.UserNameException;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Name");	
		String regex="^[A-Za-z]*$";
		Pattern pattern=Pattern.compile(regex);
		String name=null;
			try {	
			   name=scanner.nextLine();
			   if(pattern.matcher(name).matches())
				   System.out.println("User Name in alphabets");
			   else
				   throw new UserNameException("User Name not in alphabets");
				   
			}catch(UserNameException ex) {
				System.out.println(ex.getMessage());
			}
	}

}
