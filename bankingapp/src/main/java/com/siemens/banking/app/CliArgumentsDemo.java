package com.siemens.banking.app;

public class CliArgumentsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int port=0;
		if(args.length>0) {
			for(String arg : args) {
			   if(arg.equals("8080")) {
				   port=Integer.parseInt(arg)+10;
				   System.out.println("Port="+port);
			   }
				
		     	System.out.println(arg);
			}
		}else {
			System.out.println("No arguments available");
		}

	}

}
