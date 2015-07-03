package com.java.concurrent;

public class UserCounterRunnable implements Runnable {

	@Override
	public void run() {
		increMent();
		increMent();
		increMent();
	}

	private void increMent() {

		synchronized (this) {
			Counter.count++;
			System.out.print(Counter.count + " ");

		}
	}

}
