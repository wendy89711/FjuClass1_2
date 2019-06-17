package com.unknow;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedInputFile {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("may21.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader in = new BufferedReader(isr);
			String line = in.readLine();
			while(line != null) {
				System.out.println(line);
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//looked
	}
		
}
