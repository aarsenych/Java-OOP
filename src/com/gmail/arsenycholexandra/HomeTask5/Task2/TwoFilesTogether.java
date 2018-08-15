package com.gmail.arsenycholexandra.HomeTask5.Task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TwoFilesTogether {

	public static String[] turnFileToString(File file) throws FileNotFoundException {
		String line = null;
		BufferedReader bufr = new BufferedReader(new FileReader(file));
		StringBuilder sb = new StringBuilder();
		String ls = System.getProperty("line.separator");
		try {
			while ((line = bufr.readLine()) != null) {
				sb.append(line);
				sb.append(ls);
			}
			bufr.close();

		} catch (IOException e) {

		}
		return sb.toString().split("\\s+");

	}

	public static void filterWords(File file1, File file2, File file3) {
		String arr3 = "";
		try {
			String[] arr1 = TwoFilesTogether.turnFileToString(file1);
			String[] arr2 = TwoFilesTogether.turnFileToString(file2);
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr2.length; j++) {
					if (arr1[i].equals(arr2[j])) {
						arr3 += arr1[i] + " ";
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try (PrintWriter a = new PrintWriter(file3)) {
			a.println(arr3);
			a.flush();
			a.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
