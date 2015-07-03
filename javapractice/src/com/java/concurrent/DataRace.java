package com.java.concurrent;

public class DataRace {
	public static void main(String args[]) {
		UserCounterRunnable c = new UserCounterRunnable();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);
		t1.start();
		t2.start();
		t3.start();
	}
}