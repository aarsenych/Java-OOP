package com.gmail.arsenycholexandra.HomeTask7.Task1;

public class Ship implements Runnable {
	private int count;

	public Ship(int count) {
		super();
		this.count = count;
	}

	public Ship() {
		super();
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public void run() {

		for (int i = count; i < 0; i--) {
			count = count - 1;
		}
		try {
			Thread.sleep(500);
			System.out.println("The ship is unloading... ");
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		System.out.println("The ship is unloaded");
	}
}
