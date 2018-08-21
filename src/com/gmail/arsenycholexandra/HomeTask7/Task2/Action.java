package com.gmail.arsenycholexandra.HomeTask7.Task2;

public class Action {
	private int value;
	private boolean turn = false;
	private boolean stop = false;
	
	public Action() {
		super();
	}
	public synchronized int getValue() {
		for(; turn == false;) {
			try {
				wait();
			} catch(InterruptedException e) {
				
			}
		}
			int temp = this.value;
			notifyAll();
			System.out.println("Text is accepted" + this.value);
			return temp;	
	}
	
	public synchronized void setValue(int value) {
		for(; turn == true;) {
			try {
				wait();
			} catch(InterruptedException e) {
				
			}
		}
			this.value = value;
			notifyAll();
			System.out.println("Text is accepted" + this.value);
			notifyAll();
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		
		this.stop = stop;
	}

}
