package com.wen.practice;

public class Person {
	String name;
	float weight;
	float height;
	public Person(String name,float weight,float height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	public float bmi() {
		float bmi = weight /(height*height);
		return bmi;
	}
	public void print() {
		System.out.println(bmi());
	}
}
