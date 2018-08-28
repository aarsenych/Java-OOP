package com.gmail.arsenycholexandra.HomeTask7.Task2;

public class Progress implements Runnable {

	private Action action;

	public Progress(Action action) {
		this.action = action;
	}

	public Progress() {
	}

	@Override
	public void run() {
		for (; !action.isStop();) {
			action.showProgress();
		}
	}
}
