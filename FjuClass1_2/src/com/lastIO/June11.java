package com.lastIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class June11 {
	public static void main(String[] args) {
		List<City> cities = new ArrayList<>();
		try {
			BufferedReader in = new BufferedReader(new FileReader("areas.txt"));
			String line = in.readLine();
			City lastCity = new City("");
			while(line != null) {
				System.out.println(line);
				String[] tokens = line.split(",");
				if(!lastCity.name.equals(tokens[0])) {
					lastCity = new City(tokens[0]);
					cities.add(lastCity);
				}
				Area area = new Area(tokens[1], tokens[2]);
				lastCity.areas.add(area);
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println(cities);
		System.out.println("Please choose city:");
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < cities.size(); i++) {
			System.out.println(i + ":" + cities.get(i).name);
		}
		int cityId = Integer.parseInt(scanner.nextLine());
		City city = cities.get(cityId);
		for(int i = 0; i < city.areas.size(); i++) {
			System.out.println(i + ":" +city.areas.get(i).name);
		}
		int areaId = Integer.parseInt(scanner.nextLine());
		System.out.println("Post code is" + city.areas.get(areaId).code);
		
	}

}
