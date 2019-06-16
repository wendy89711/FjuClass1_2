package com.cocurrent;

public class Breakfast extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("Making the breakfast");
			Thread.sleep(5000);
			System.out.println("Breakfast done");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
