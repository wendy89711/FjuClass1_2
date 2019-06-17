package com.unknow;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListPractice {

	public static void main(String[] args) {
		Random random = new Random();
		int[] freq = new int[20];
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<20; i++) {
			int r = random.nextInt(20);
			list.add(r);
			freq[r]++;
		}
/*		for(int i = 0;i<10000; i++) {
			int r = random.nextInt(20);
			Integer freq = list.get(r);
			list.set(r, freq +1);
			
		} */
		for(int i=0;i<freq.length;i++) {
			System.out.println(i+":"+freq[i]);
		}
	//有難度	
	}
	}
