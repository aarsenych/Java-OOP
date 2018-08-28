package com.gmail.arsenycholexandra.HomeTask7.Task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import com.gmail.arsenycholexandra.HomeTask7.Task2.Action;

public class Producer implements Runnable {
	private Action action;
	
	
	public  Producer(Action action) {
		super();
		this.action = action;
		
	}
	
	
	@Override
	public void run() {
		try (FileInputStream fis = new FileInputStream(action.getFile1())) {
			
			byte[] buffer = new byte[1024];
			int byteread = 0;

			for (; (byteread = fis.read(buffer)) > 0;) {
				action.readBytes(buffer, byteread);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		action.setStop(true);
		
	}
}
