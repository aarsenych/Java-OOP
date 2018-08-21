package com.gmail.arsenycholexandra.HomeTask6.Task1;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			ThreadFactorial tf = new ThreadFactorial(i);
			Thread th = new Thread(tf);
			th.start();
		}

	}

}
