package com.april;

import java.util.Scanner;

public class April24Practice {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		try {
		System.out.print("請輸入數學成績:");
		int math = Integer.parseInt(sca.nextLine());
		System.out.print("請輸入英文成績:");
		int english = Integer.parseInt(sca.nextLine());
		int average = (math + english)/2;
		System.out.println("平均成績" + average);
		}catch() {}
	}

}
