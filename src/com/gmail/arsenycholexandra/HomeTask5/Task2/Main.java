package com.gmail.arsenycholexandra.HomeTask5.Task2;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

import com.gmail.arsenycholexandra.HomeTask4.Student;

public class Main {

	public static void main(String[] args) {
		
		File file1 = new File("C:\\Users\\Lesya\\Desktop\\JAVA projects\\com.gmail.arsenycholexandra.homework\\src\\com\\gmail\\arsenycholexandra\\HomeTask5\\File1.txt");
		File file2 = new File("C:\\Users\\Lesya\\Desktop\\JAVA projects\\com.gmail.arsenycholexandra.homework\\src\\com\\gmail\\arsenycholexandra\\HomeTask5\\File2.txt");
		File file3 = new File("C:\\Users\\Lesya\\Desktop\\JAVA projects\\com.gmail.arsenycholexandra.homework\\src\\com\\gmail\\arsenycholexandra\\HomeTask5\\File3.txt");
		
		Action action = new Action();
		Provider provider = new Provider(action);
		Receiver receiver = new Receiver(action);
		
		Thread threadOne = new Thread(provider);
		Thread threadTwo = new Thread(receiver);
		
		threadOne.start();
		threadTwo.start();
		
		
		
		
	}

}
