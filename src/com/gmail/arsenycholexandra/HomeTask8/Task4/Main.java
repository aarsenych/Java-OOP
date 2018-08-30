package com.gmail.arsenycholexandra.HomeTask8.Task4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {

		Deque<String> bigBang = new ArrayDeque<>();
		int doubleCola = 2;
		bigBang.add("Sheldon");
		bigBang.add("Leonard");
		bigBang.add("Volovits");
		bigBang.add("Kutrapalli");
		bigBang.add("Penny");
		System.out.println(bigBang);

		for (int i = 0; i < doubleCola; i++) {
			bigBang.add(bigBang.peekFirst());
			bigBang.add(bigBang.peekFirst());
			bigBang.removeFirst();
		}
		System.out.println(bigBang);
	}

}
