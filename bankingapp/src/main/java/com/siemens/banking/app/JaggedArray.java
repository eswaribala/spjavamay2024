package com.siemens.banking.app;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of customers");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();
		int premium[][]=new int[n][];
		int col,amount=0;
		for(int i=0;i<premium.length;i++) {
			System.out.println("Enter no of premiums for customer "+i);
			col=scanner.nextInt();
			scanner.nextLine();
			premium[i]=new int[col];
			//supply the data
			for(int j=0;j<premium[i].length;j++) {
				System.out.println("Enter Amount");
				amount=scanner.nextInt();
				scanner.nextLine();
				premium[i][j]=amount;
			}	
			
		}
		
		
		//show the results
		
		for(int i=0;i<premium.length;i++) {
			for(int j=0;j<premium[i].length;j++) {
				System.out.print(premium[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
		
		

	}

}
