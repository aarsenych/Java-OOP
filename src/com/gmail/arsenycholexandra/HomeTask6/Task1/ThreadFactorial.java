package com.gmail.arsenycholexandra.HomeTask6.Task1;

import java.math.BigInteger;

public class ThreadFactorial implements Runnable {

	private int number;

	public ThreadFactorial(int number) {
		super();
		this.number = number;
	}

	public ThreadFactorial() {
		super();
	}

	public BigInteger calculateFactorial(int n) {
		BigInteger factorial = new BigInteger("1");

		for (int i = 1; i <= n; i++) {
			factorial = factorial.multiply(new BigInteger("" + i));
		}
		return factorial;
	}

	@Override
	public void run() {
		Thread th = Thread.currentThread();
		System.out.println(th.getName() + "-> " + number + "!= " + calculateFactorial(number));

	}
}
