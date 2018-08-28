package com.gmail.arsenycholexandra.HomeTask7.Task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Action {
	private File file1;
	private File file2;
	private byte[] buffer;
	private byte[] saved;
	private int readByte;
	private int length;
	private boolean turn = false;
	private boolean stop = false;
	private boolean sign = false;

	public Action(File file1, File file2) {
		super();
		this.file1 = file1;
		this.file2 = file2;
	}

	public Action() {
		super();
	}

	/**
	 * @return the file1
	 */
	public File getFile1() {
		return file1;
	}

	/**
	 * @param file1
	 *            the file1 to set
	 */
	public void setFile1(File file1) {
		this.file1 = file1;
	}

	/**
	 * @return the file2
	 */
	public File getFile2() {
		return file2;
	}

	/**
	 * @param file2
	 *            the file2 to set
	 */
	public void setFile2(File file2) {
		this.file2 = file2;
	}

	public synchronized void readBytes(byte[] buffer, int readByte) {
		int temp = 0;
		for (; turn == false;) {
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}
		this.buffer = buffer;
		this.saved = new byte[buffer.length];
		this.readByte = readByte;
		System.arraycopy(buffer, 0, saved, 0, buffer.length);
		turn = true;
		sign = true;
		notifyAll();
	}

	public synchronized int getLength() {
		turn = false;
		notifyAll();
		return length;
	}

	public synchronized void saveBytes() throws FileNotFoundException, IOException {
		for (; turn == true;) {
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}
		try (FileOutputStream fos = new FileOutputStream(this.file2)) {
			fos.write(this.buffer, 0, this.readByte);
		}
		sign = false;
		notifyAll();
	}

	public synchronized void showProgress() {
		int total = 0;
		for (; turn == false;) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		int temp = this.readByte;
		total += temp;
		long percent = (total  / file1.length()) * 100;
		System.out.print(percent  + " loaded");
		turn = false;
		notifyAll();
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {

		this.stop = stop;
	}

}
