package com.may;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class May21 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("may21.txt");
			Reader in = new InputStreamReader(fis);
			int n = in.read();
			while(n!=-1) {
				System.out.println(n);
				n = in.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
