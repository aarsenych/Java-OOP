package com.gmail.arsenycholexandra.HomeTask9.Task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import com.gmail.arsenycholexandra.HomeTask81.Task1.Group;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class WorkWithFile implements Serializable {

	private Map<String, String> hm = new HashMap<>();
	private File file;

	public WorkWithFile(Map<String, String> hm, File file) {
		super();
		this.hm = hm;
		this.file = file;
	}

	/**
	 * @return the file
	 */
	public File getFile() {
		return file;
	}

	/**
	 * @param file
	 *            the file to set
	 */
	public void setFile(File file) {
		this.file = file;
	}

	/**
	 * @return the hm
	 */
	public Map<String, String> getHm() {
		return hm;
	}

	/**
	 * @param hm
	 *            the hm to set
	 */
	public void setHm(Map<String, String> hm) {
		this.hm = hm;
	}

	public ArrayList<String> readFile() throws IOException {
		ArrayList<String> list = new ArrayList<>();
		try (BufferedReader f = new BufferedReader(new FileReader(this.file))) {
			String str = "";
			for (; (str = f.readLine()) != null;) {
				list.add(str);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return list;
	}

	public void saveToJSONFile(File file) {
		ArrayList<String> arr = new ArrayList<>();
		try {
			arr = translate(this.file);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String gsonSt = gson.toJson(arr);
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.println(gsonSt);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<String> translate(File file) throws IOException {
		ArrayList<String> a = readFile();
		ArrayList<String> b = new ArrayList<>();
		for (String string : a) {
			if (hm.containsKey(string)) {
				b.add(hm.get(string));
			}
		}
		return b;
	}

	public void addToVocabulary(String s1, String s2) {
		hm.put(s1, s2);
	}

}
