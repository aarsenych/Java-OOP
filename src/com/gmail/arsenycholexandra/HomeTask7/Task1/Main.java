package com.gmail.arsenycholexandra.HomeTask7.Task1;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
	
	private static final int NTHREDS = 2;

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);

		Ship[] flot = new Ship[3];

		ArrayList<Future> task = new ArrayList<>();
		for (Ship ship : flot) {
			task.add(executor.submit(new Ship(10)));
		}
		executor.shutdown();
	}

}
