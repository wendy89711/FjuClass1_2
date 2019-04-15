package com.mar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class March19Class {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 38);
		map.put(6, 77);
		System.out.println(map.get(1)) ;
		List<Integer> list = new ArrayList<>();
		list.add(33);
		list.add(22);
		list.add(2, 45);
		System.out.println(list.get(2));
	}

}
