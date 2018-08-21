package com.gmail.arsenycholexandra.HomeTask5.Task2;

import com.gmail.arsenycholexandra.HomeTask7.Task2.Action;

public class Receiver implements Runnable {
private Action action;
	
	public Receiver(Action action) {
		super();
		this.action = action;
	}
	
	@Override
	public void run() {
		for(;!action.isStop();) {
			
		}
		
	}
}
