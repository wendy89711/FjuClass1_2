package com.unknow;

import com.may.Horse;

public class May28 {

	public static void main(String[] args) {
//		for(int i=1; i<=10000; i++) {
//			System.out.println("Horse1:" + i);
//		}
		Horse h1 = new Horse("H1:");
		h1.start();
		Horse h2 = new Horse("H2:");
		h2.start();
		try {
			h2.join();
			h1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//
//		HorseRunnable h1 = new HorseRunnable();
//		Thread thread = new Thread(h1);
//		thread.start();
		System.out.println("end");

	}

}
