package com.mar;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class M26 {

	public static void main(String[] args) {
		Map<String, String> buy = new HashMap<>();
		Scanner sca = new Scanner(System.in);
		int i = 1;
		String thing;
		String amount;
		while(i<=1) {
			System.out.println("�s�W�N�ʪ�:(��Jq�M���J����)");
			thing = sca.nextLine();
			if(!"q".equals(thing)) {
				System.out.println("�s�W�N�ʪ��ƶq�G");
				amount = sca.nextLine();
				buy.put(thing, amount);
				System.out.println(buy);
			}else {
					break;
			}
		}
		

	}

}
