package com.siemens.banking.app;

import java.util.Scanner;

import com.siemens.bankingmodels.Gender;

public class TaxApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary=0;
		Gender gender=Gender.MALE;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your Salary");
		salary=scanner.nextInt();
		//to read enter key
		scanner.nextLine();
		System.out.println(salary);
		System.out.println("Enter Gender");
		//string to enum
		gender=Gender.valueOf(scanner.nextLine());
		System.out.println(gender);
		

	}

}
