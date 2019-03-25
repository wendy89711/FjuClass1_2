package com.wen.practice;

import java.util.HashMap;
import java.util.Random;

public class Map {

		public static void main(String[] args) {
		Random random = new Random(50);
		java.util.Map<Integer,Integer> n = new HashMap<>();
		for(int i = 0; i < 10000; i++) {
			int r = random.nextInt(20);
			Integer freq = n.get(r);
			n.put(r, freq == null ? 1:freq +1);
//			if(freq == null) {
//				n.put(r, 1);
//			}else {
//				n.put(r, freq+1);
//			}
		}
		System.out.println(n);
	}

}
