package com.may;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class May21 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("dd.txt");
			
			Reader reader = new FileReader("dd.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
