package com.gmail.arsenycholexandra.HomeTask6.Task2;

public class Summation extends Thread {
	private int[] a;
	private int low;
	private int high;
	private int part;

	public Summation(int[] a, int low, int high) {
		super();
		this.a = a;
		this.low = low;
		this.high = high;
	}

	public int getPartSum() {
		return part;
	}

	public void run() {
		part = sum(a, low, high);
	}

	public static int sum(int[] a) {
		return sum(a, 0, a.length);
	}

	public static int sum(int[] a, int low, int high) {
		int res = 0;
		for (int i = low; i < high; i++) {
			res += a[i];
		}
		return res;
	}

	public static int parallelSum(int[] arr, int threads) {
		int size = (int) Math.ceil(arr.length * 1.0 / threads);

		Summation[] sums = new Summation[threads];

		for (int i = 0; i < threads; i++) {
			sums[i] = new Summation(arr, i * size, (i + 1) * size);
			sums[i].start();
		}

		try {
			for (Summation sum : sums) {
				sum.join();
			}
		} catch (InterruptedException e) {
		}

		int total = 0;

		for (Summation sum : sums) {
			total += sum.getPartSum();
		}

		return total;
	}

}
