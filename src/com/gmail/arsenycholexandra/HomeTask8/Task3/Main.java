package com.gmail.arsenycholexandra.HomeTask8.Task3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.ReadOnlyFileSystemException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String file = "C:\\Users\\Lesya\\Desktop\\JAVA projects\\com.gmail.arsenycholexandra.homework\\src\\com\\gmail\\AliceInWonderland.txt";
		CountRepeat cr = new CountRepeat(file);
		char [] c = cr.turnToChars();
//		for (char d : c) {
//			System.out.println(d); 
//		}
		System.out.println(c.length);
		cr.countChars();
		
	}
	
	

}
