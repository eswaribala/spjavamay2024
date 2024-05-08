package com.siemens.banking.app;

public class TitleThread extends Thread{
	private String name;
	
	public TitleThread(String name) {
		this.name=name;
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(char ch : this.name.toCharArray()) {
			System.out.print(ch);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	

}
