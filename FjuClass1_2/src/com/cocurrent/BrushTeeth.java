package com.cocurrent;

public class BrushTeeth implements Runnable {
	@Override
	public void run() {
		try {
			System.out.println("Brushing teeth");
			Thread.sleep(3000);
			System.out.println("Brushed");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}
