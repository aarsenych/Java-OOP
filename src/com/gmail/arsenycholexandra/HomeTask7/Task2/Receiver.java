package com.gmail.arsenycholexandra.HomeTask7.Task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.gmail.arsenycholexandra.HomeTask7.Task2.Action;

public class Receiver implements Runnable {
	private Action action;
	

	public Receiver(Action action) {
		super();
		this.action = action;
		
	}

	@Override
	public void run() {
		for (; !action.isStop();) {
			try {
				action.saveBytes();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
