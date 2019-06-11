package com.may;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class June11 {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		ArrayList<String> areas = new ArrayList<>();
		ArrayList<String> postID = new ArrayList<>();
		try {
			BufferedReader in = new BufferedReader(new FileReader("areas.txt"));
			String line = in.readLine();
			while(line != null) {
				System.out.println(line);
				String[] tokens = line.split(",");
				cities.add(tokens[0]);
				areas.add(tokens[1]);
				postID.add(tokens[2]);
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(cities);
	}

}
