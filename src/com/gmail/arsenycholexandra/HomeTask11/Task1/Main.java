package com.gmail.arsenycholexandra.HomeTask11.Task1;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		String S = "C:\\Users\\Lesya\\Desktop\\JAVA projects\\com.gmail.arsenycholexandra.homework\\src\\com\\gmail\\arsenycholexandra\\SiteList";
		File file = new File(S);
		SiteAccesability sa = new SiteAccesability(file);
		
		sa.checkAccess();

	}

}
