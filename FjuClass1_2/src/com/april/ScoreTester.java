package com.april;

import java.util.Scanner;

public class ScoreTester {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		try {
			System.out.print("Please enter math:");
			Score math = new Score(sca.nextLine());
			System.out.print("Please enter english:");
			Score english = new Score(sca.nextLine());
			System.out.println("Average:"+ (math.value + english.value)/2);
		} catch (ScoreFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
