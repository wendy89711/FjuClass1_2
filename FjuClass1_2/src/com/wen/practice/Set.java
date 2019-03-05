package com.wen.practice;

import java.util.HashSet;


public class Set {
	

	public static void main(String[] args) {
		java.util.Set<Integer> bag = new HashSet<>();
		bag.add(55);
		bag.add(4);
		bag.add(55);
		bag.add(78);
		System.out.println(bag);
	}
}