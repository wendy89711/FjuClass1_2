package com.cocurrent;

public class June04 {
	
	public static void main(String[] args) {
		Breakfast breakfast = new Breakfast();
		breakfast.start();
		BrushTeeth brushteeth = new BrushTeeth();
		Thread thread = new Thread(brushteeth);
		thread.start();
		try {
			thread.join();
			breakfast.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
		
		
	}
	

}
