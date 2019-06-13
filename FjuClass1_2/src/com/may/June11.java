package com.may;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class June11 {

	public static void main(String[] args) {
		List<String> cities = new ArrayList<>();
		List<String> areas = new ArrayList<>();
		List<String> postID = new ArrayList<>();
		try {
			BufferedReader in = new BufferedReader(new FileReader("areas.txt"));
			String line = in.readLine();
			String lastCity = "";
			while(line != null) {
				System.out.println(line);
				String[] tokens = line.split(",");
				if(!tokens[0].equals(lastCity)) {
					lastCity = tokens[0];
					cities.add(lastCity);
				}
				areas.add(tokens[1]);
				postID.add(tokens[2]);
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println(cities);
	}

}
