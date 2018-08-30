package com.gmail.arsenycholexandra.HomeTask8.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rn = new Random();

		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			arr.add(rn.nextInt(10));
		}
		arr.remove(0);
		arr.remove(1);
		arr.remove(7);

		System.out.println(arr);
	}

}
