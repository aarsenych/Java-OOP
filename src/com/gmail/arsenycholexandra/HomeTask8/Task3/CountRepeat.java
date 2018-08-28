package com.gmail.arsenycholexandra.HomeTask8.Task3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;;

public class CountRepeat {

	String file;
	static final int SIZE = 26;
	
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
		ArrayList<String> arr = new ArrayList<>();
		arr.add("a");
		arr.add("b");
		arr.add("c");
		arr.add("d");
		arr.add("e");
		arr.add("f");
		arr.add("g");
		arr.add("h");
		arr.add("i");
		arr.add("j");
		arr.add("k");
		arr.add("l");
		arr.add("m");
		arr.add("n");
		arr.add("o");
		arr.add("p");
		arr.add("q");
		arr.add("r");
		arr.add("s");
		arr.add("t");
		arr.add("u");
		arr.add("v");
		arr.add("w");
		arr.add("x");
		arr.add("y");
		arr.add("z");
		
	}
	
	public void printCharAndFrequency() {
		ArrayList<String> freq = new ArrayList<>();
		
	}
	
}
