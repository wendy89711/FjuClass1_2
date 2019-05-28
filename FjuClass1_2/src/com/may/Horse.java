package com.may;

public class Horse extends Thread {
	public Horse(String name) {
		setName(name);
	}
	@Override
	public void run() {
		for(int i=1; i<=50; i++) {
			String spaces = "";
			for(int j=0; j<i; j++) {
				spaces = spaces+"";
			}
			System.out.println(getName() + i);
		}
	}
	

	

}
