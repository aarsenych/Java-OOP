package com.gmail.arsenycholexandra.HomeTask9.Task1;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<String, String> hm = new HashMap<>();
		String S = "C:\\Users\\Lesya\\Desktop\\JAVA projects\\com.gmail.arsenycholexandra.homework\\src\\com\\gmail\\arsenycholexandra\\HomeTask9\\English.in.txt";
		String S1 = "C:\\Users\\Lesya\\Desktop\\JAVA projects\\com.gmail.arsenycholexandra.homework\\src\\com\\gmail\\arsenycholexandra\\HomeTask9\\Ukrainian.out.txt";

		File file = new File(S);
		File fileOut = new File(S1);

		WorkWithFile wwf = new WorkWithFile(hm, file);

		hm.put("Hello", "Vitannya");
		hm.put("Sky", "Nebo");
		hm.put("Blue", "Blakytnyi");
		hm.put("Task", "Zavdannya");
		hm.put("Cat", "Kit");
		hm.put("Dog", "Sobaka");
		hm.put("Child", "Dytyna");

		try {
			System.out.println(wwf.translate(fileOut));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wwf.saveToJSONFile(fileOut);
		wwf.addToVocabulary("World", "Svit");

	}

}
