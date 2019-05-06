package com.april;

import java.util.Scanner;

public class April23 {

	public static void main(String[] args) {
		System.out.print("多少人中獎:");
		Scanner sca = new Scanner(System.in);
		int bonus = 200000;
		int div = 0;
		String number = sca.nextLine();
		try {
			int n = Integer.parseInt(number);
			div = bonus/n;
			System.out.println("每個人得" + div);
		} catch( Exception e) {
			System.out.println("資料錯誤");
		}
		/*catch(ArithmeticException e) {
			System.out.println("數值運算錯誤");
		} catch(NumberFormatException e) {
			System.out.println("數字格式錯誤");
		}*/
		}
}
