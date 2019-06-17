package com.wen.practice;

import java.util.HashSet;
import java.util.Set;

public class Student {

	public static void main(String[] args) {
		Set<String> rollCall = new HashSet<>();
		rollCall.add("1號周星哲");
		rollCall.add("2號蔡依林");
		rollCall.add("3號吳佩玟");
		System.out.println(rollCall);
		//Set沒有順序沒有get()、有add()
	}

}
