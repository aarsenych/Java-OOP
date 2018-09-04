package com.gmail.arsenycholexandra.HomeTask11.Task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class SiteAccesability {
	private File file;

	public SiteAccesability(File file) {
		super();
		this.file = file;
	}

	public SiteAccesability() {
		super();
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

	public List<String> readFile() throws IOException {
		List<String> list = new ArrayList<>();
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
	

	public void checkAccess()  {
		try {
			List<String> sites = readFile();
			for (String site : sites) {
				URL url = new URL(site);
				HttpURLConnection urlc = (HttpURLConnection) url.openConnection();
				System.out.println(site + " . Response code: " + urlc.getResponseCode());
				System.out.println();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
