package com.mar;

import java.util.ArrayList;
import java.util.List;

public class M2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("第一");
		list.add("第二");
		list.add("第三");
		list.add("第四");
		String s = list.get(3);
		System.out.println(s);

	}

}
