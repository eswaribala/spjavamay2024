package com.siemens.banking.app;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.siemens.banking.app.exceptions.UserNameException;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Name");		
		String name=scanner.nextLine();
		  try {
			validateName(name);
		} catch (UserNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("All Done...");  
		  
			   
	}
	
	
	
	public static void validateName(String name) throws UserNameException{
		String regex="^[A-Za-z]*$";
		Pattern pattern=Pattern.compile(regex);
		   if(pattern.matcher(name).matches())
			   System.out.println("User Name in alphabets");
		   else
			   throw new UserNameException("User Name not in alphabets");
	}

}
