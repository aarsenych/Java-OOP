package com.gmail.arsenycholexandra.HomeTask9.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class WorkWithFile implements Serializable {

	HashMap<String, String> hm = new HashMap<>();
	File file;

	public WorkWithFile(HashMap<String, String> hm, File file) {
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
	public HashMap<String, String> getHm() {
		return hm;
	}

	/**
	 * @param hm
	 *            the hm to set
	 */
	public void setHm(HashMap<String, String> hm) {
		this.hm = hm;
	}

	public ArrayList<String> readFile() {
		Scanner s;
		ArrayList<String> list = new ArrayList<String>();
		try {
			s = new Scanner(this.file);
			while (s.hasNext()) {
				list.add(s.next());
			}
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<String> translate() {
		ArrayList<String> a = readFile();
		ArrayList<String> b = new ArrayList<>();
		for (String string : a) {
			if (hm.containsKey(string)) {
				b.add(hm.get(string));
			}
		}
		return b;
	}

	public void writeToFile(File file) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(file);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ArrayList<String> arr = translate();
		for (String str : arr) {
			try {
				writer.write(str);
				writer.write("\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addToVocabulary(String s1, String s2) {
		hm.put(s1, s2);
	}
	
	public void saveOnDisk(File file) {
		 try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file))) {
	            os.writeObject(this.hm);
	        } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
