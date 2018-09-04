package com.gmail.arsenycholexandra.HomeTask11.Task2;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		String S = "C:\\Users\\Lesya\\Desktop\\JAVA projects\\com.gmail.arsenycholexandra.homework\\src\\com\\gmail\\arsenycholexandra\\SavedLinks.txt";
		File file = new File(S);
		String URLaddress = "https://www.google.com.ua";
		HTMLLinkExtractor.saveToJSONFile(file, URLaddress);

	}

}
