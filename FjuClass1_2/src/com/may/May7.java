package com.may;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class May7 {

	public static void main(String[] args) {
		int n = Integer.parseInt("35");
/*		try {
			FileReader fr = new FileReader("aa.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		File file = new File("aa.txt");
		if(file.exists() == true) {
			System.out.println(file.length());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getName());
		}
		
		System.out.println(file.canExecute());
		System.out.println(file.isDirectory());
		
		File dir = new File("C:\\xampp");
		if (dir.exists() && dir.isDirectory()) {
//			String [] files = dir.list();
//			for (String s : files) {
//				System.out.println(s);
			File[] files = dir.listFiles();
			for (File f : files) {
				if(f.isFile()) {
					System.out.println(f.getName());
				}
			}
			System.out.println(dir.mkdir());
			File dd = new File(dir, "aaa\\bb\\cc");
			System.out.println(dd.mkdirs());
//			System.out.println(dd.delete());
		}
		for(int i=0;i<2000000;i++) {
			System.out.println("qq");
			
			
		}
		
		
	}

}
