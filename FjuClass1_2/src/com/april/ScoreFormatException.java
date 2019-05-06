package com.april;

public class ScoreFormatException extends Exception {
	@Override
	public String getMessage() {
		return "Score format invalid, cannot covert to int";
	}
}
