package com.cocurrent;

public class June04 {
	
	public static void main(String[] args) {
		Breakfast bf = new Breakfast();
		bf.start();
		BrushTeeth bt = new BrushTeeth();
		Thread thread = new Thread(bt);
		thread.start();
		try {
			bf.join();//讓目前正在執行的執行緒暫停，直到呼叫join()的執行緒執行結束才會繼續執行
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
