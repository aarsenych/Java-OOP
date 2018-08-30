package com.gmail.arsenycholexandra.HomeTask8.Task3;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;;

public class CountRepeat {

	private String file;
	private static final int SIZE = 26;

	public CountRepeat(String file) {
		super();
		this.file = file;
	}

	/**
	 * @return the file
	 */
	public String getFile() {
		return file;
	}

	/**
	 * @param file
	 *            the file to set
	 */
	public void setFile(String file) {
		this.file = file;
	}

	public String readFile(String file) {
		String line = " ";
		String result = "";
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuilder sb = new StringBuilder();
			while ((line = bufferedReader.readLine()) != null) {
				sb.append(line);
				sb.append("\n");
			}
			bufferedReader.close();
			result = sb.toString();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + file + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + file + "'");

		} catch (NullPointerException ex) {
			System.out.println("Error reading file '" + file + "'");
		}
		return result;
	}

	public char[] turnToChars() {
		char[] chars = null;
		if (readFile(getFile()) != null) {
			String s = readFile(getFile());
			chars = s.toCharArray();
		}

		return chars;
	}

	public void countChars() {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 'A'; i <= 'z'; i++) {
			int count = 0;
			char[] ch = turnToChars();
			for (int j = 0; j < ch.length; j++) {
				if (ch[j] == i) {
					count++;
					arr.add(count);
					// System.out.println((char)i + " meets " + count + " times");
				}
				for (Integer c : arr) {
					System.out.println(c);
				}

			}

		}
	}

	public void printCharAndFrequency() {
		ArrayList<String> freq = new ArrayList<>();

	}

}
