package com.gmail.arsenycholexandra.HomeTask5.Task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import com.gmail.arsenycholexandra.HomeTask7.Task2.Action;

public class Provider implements Runnable {
	private Action action;
	private String file;
	
	public  Provider(Action action, String file) {
		super();
		this.action = action;
		this.file = file;
	}
	
	public static {
		
	}

	@Override
	public void run() {
		
		action.setStop(true);
		
	}
}
