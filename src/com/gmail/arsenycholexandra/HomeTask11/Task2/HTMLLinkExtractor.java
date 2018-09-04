package com.gmail.arsenycholexandra.HomeTask11.Task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class HTMLLinkExtractor {
	
	public static String getStringFromURL(String URLaddress) throws IOException { //returns html of site
		URL url = new URL(URLaddress);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		String result = "";
		try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"))) {
			String temp = "";
			for (; (temp = br.readLine()) != null;) {
				result += temp + System.lineSeparator();
			}
		} catch (IOException e) {
			throw e;
		}
		return result;
	}
	
	public static List<String> returnLinks(String URLaddress) {
		String HTMLPage;
		List<String> links = new ArrayList<String>();
		try {
			HTMLPage = getStringFromURL(URLaddress);
			Pattern linkPattern = Pattern.compile("<a[^>]+href=[\\\"']?([\\\"'>]+)[\\\"']?[^>]*>(.+?)<\\/a>",  Pattern.CASE_INSENSITIVE|Pattern.DOTALL);
			Matcher pageMatcher = linkPattern.matcher(HTMLPage);
			
			while(pageMatcher.find()){
			    links.add(pageMatcher.group());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return links;
	}
	
	public static void saveToJSONFile(File file, String URLaddress) {
		List<String> arr = new ArrayList<>();
		arr = returnLinks(URLaddress);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String gsonSt = gson.toJson(arr);
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.println(gsonSt);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void printLinks(List<String> st) {
		for (String String : st) {
			System.out.println(st);
		}
	}
}

	
