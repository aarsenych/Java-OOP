package com.gmail.arsenycholexandra.HomeTask7.Task2;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String P = "C:\\Users\\Lesya\\Desktop\\JAVA projects\\com.gmail.arsenycholexandra.homework\\src\\com\\gmail\\arsenycholexandra\\HomeTask7\\File.txt";
		String R = "C:\\Users\\Lesya\\Desktop\\JAVA projects\\com.gmail.arsenycholexandra.homework\\src\\com\\gmail\\arsenycholexandra\\HomeTask7\\File2.txt";
		File file1 = new File(P);
		File file2 = new File(R);
		Action action = new Action(file1, file2);
		Producer provider = new Producer(action);
		Receiver receiver = new Receiver(action);
		Progress progress = new Progress(action);
		
		Thread threadOne = new Thread(provider);
		Thread threadTwo = new Thread(receiver);
		Thread threadThree = new Thread(progress);
		
		threadOne.start();
		threadTwo.start();
		threadThree.start();
	}

}
