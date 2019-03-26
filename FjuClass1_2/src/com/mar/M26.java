package com.mar;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class M26 {

	public static void main(String[] args) {
		Map<String, String> buy = new HashMap<>();
		Scanner sca = new Scanner(System.in);
		int i = 1;
		String person;
		String thing;
		while(i<=1) {
			System.out.println("新增代購物:(輸入end清單輸入完畢)");
			person = sca.nextLine();
			if(person.contains("end")) {
				System.out.println(buy);
				sca.close();
			}else {
			System.out.println("新增代購物數量:");
			thing = sca.nextLine();
			buy.put(person, thing);
			System.out.println(buy);
			}
		}
		

	}

}
