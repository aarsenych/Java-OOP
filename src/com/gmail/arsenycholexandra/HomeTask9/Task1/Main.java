package com.gmail.arsenycholexandra.HomeTask9.Task1;

import java.io.File;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<>();
		String S = "C:\\Users\\Lesya\\Desktop\\JAVA projects\\com.gmail.arsenycholexandra.homework\\src\\com\\gmail\\arsenycholexandra\\HomeTask9\\English.in.txt";
		String S1 = "C:\\Users\\Lesya\\Desktop\\JAVA projects\\com.gmail.arsenycholexandra.homework\\src\\com\\gmail\\arsenycholexandra\\HomeTask9\\Ukrainian.out.txt";
		String S2 = "C:\\Users\\Lesya\\Desktop\\JAVA projects\\com.gmail.arsenycholexandra.homework\\src\\com\\gmail\\arsenycholexandra\\HomeTask9\\SaveVocabulary.txt";
		File file = new File(S);
		File fileOut = new File(S1);
		File fileVocab = new File(S2);
		WorkWithFile wwf = new WorkWithFile(hm, file);
		
		hm.put("Hello", "Vitannya");
		hm.put("Sky", "Nebo");
		hm.put("Blue", "Blakytnyi");
		hm.put("Task", "Zavdannya");
		hm.put("Cat", "Kit");
		hm.put("Dog", "Sobaka");
		
		System.out.println(wwf.translate());
		wwf.writeToFile(fileOut);
		wwf.addToVocabulary("World", "Svit");
		wwf.saveOnDisk(fileVocab);
		
		

	}

}
