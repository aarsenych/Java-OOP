package com.gmail.arsenycholexandra.HomeTask5.Task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.gmail.arsenycholexandra.HomeTask4.NegativeValueException;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		File output = new File(
				"C:\\Users\\Lesya\\Desktop\\JAVA projects\\com.gmail.arsenycholexandra.homework\\src\\com\\gmail\\arsenycholexandra\\HomeTask5");
		File input = new File(
				"C:\\Users\\Lesya\\Desktop\\JAVA projects\\com.gmail.arsenycholexandra.homework\\src\\com\\gmail\\arsenycholexandra\\Task4");
		MyFileFilter mFF = new MyFileFilter();
		File[] fileList = output.listFiles(mFF);

		for (int i = 0; i < fileList.length; i++) {
			try (FileInputStream fis = new FileInputStream(fileList[i]);
					FileOutputStream fos = new FileOutputStream(input + "\\" + fileList[i].getName())) {
				if (!fileList[i].exists()) {
					fileList[i].createNewFile();
				}
				byte[] buffer = new byte[1024];
				int byteread = 0;

				for (; (byteread = fis.read(buffer)) > 0;) {
					fos.write(buffer, 0, byteread);
				}
				fos.flush();
				fos.close();
				
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
}
