package com.mar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M26T {

	public static void main(String[] args) {
		List<Item> items = new ArrayList<>();
		Scanner sca = new Scanner(System.in);
		String name;
		int i = 1;
		while(i>=1) {
			System.out.println("Please enter item name:");
			name = sca.nextLine();
			if(!"q".equals(name)) {
				System.out.println("Please enter quantity:");
				int qty = Integer.parseInt(sca.nextLine());
				items.add(new Item(name,qty));
				for(Item item : items) {
					System.out.println(item.name + "\t" +item.qty);
				}
			}else {
				break;
			}
		}
	}

}
