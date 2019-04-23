package com.april;

import java.util.Scanner;

public class April23 {

	public static void main(String[] args) {
		System.out.print("多少人中獎:");
		Scanner sca = new Scanner(System.in);
		int bonus = 200000;
		String number = sca.nextLine();
		int n = Integer.parseInt(number);
		int div = bonus/n;
		System.out.println("每個人得" + div);
	}

}
