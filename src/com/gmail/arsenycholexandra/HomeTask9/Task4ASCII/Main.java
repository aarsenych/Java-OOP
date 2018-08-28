package com.gmail.arsenycholexandra.HomeTask9.Task4ASCII;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ASCII as = new ASCII();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your text");
		String text = sc.nextLine();
		as.drawASCII(text);	
	}

}
