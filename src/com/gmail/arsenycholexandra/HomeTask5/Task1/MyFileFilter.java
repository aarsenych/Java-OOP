package com.gmail.arsenycholexandra.HomeTask5.Task1;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {
	private String doc = "txt";

	@Override
	public boolean accept(File pathname) {
		int pointerIndex = pathname.getName().lastIndexOf(".");
		if(pointerIndex == -1) {
			return false;
		}
		String ext = pathname.getName().substring(pointerIndex + 1);
		return doc.equals(ext);
	}
}
