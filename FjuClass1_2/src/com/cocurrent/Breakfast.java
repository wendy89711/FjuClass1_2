package com.cocurrent;

public class Breakfast extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("Making breakfast");
			Thread.sleep(4000);
			System.out.println("Breakfast done");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
