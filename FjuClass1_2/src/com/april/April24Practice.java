package com.april;

import java.util.Scanner;

public class April24Practice {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		try {
		System.out.print("Please enter math:");
		int math = Integer.parseInt(sca.nextLine());
		System.out.print("Please enter english:");
		int english = Integer.parseInt(sca.nextLine());
		int average = (math + english)/2;
		System.out.println("Average:" + average);
		}catch() {}
	}

}
