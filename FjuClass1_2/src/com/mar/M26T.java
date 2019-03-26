package com.mar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M26T {

	public static void main(String[] args) {
		List<Item> items = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String name = "";
		while (!name.equals("q")) {
			System.out.println("Please enter item name:");
			name = scanner.nextLine();
			System.out.println("Please enter quantity:");
			int qty = Integer.parseInt(scanner.nextLine());
			items.add(new Item(name,qty));
			for(Item item : items) {
				System.out.println(item.name + "\t" + item.qty);
			}
		}

	}

}
