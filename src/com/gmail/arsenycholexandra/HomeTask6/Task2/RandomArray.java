package com.gmail.arsenycholexandra.HomeTask6.Task2;

import java.util.Random;

public class RandomArray {
	private static final Random RAND = new Random();

	public static int[] createRandomArray(int length) {
		int[] a = new int[length];
		for (int i = 0; i < a.length; i++) {
			a[i] = RAND.nextInt(100);
		}
		return a;
	}

}
