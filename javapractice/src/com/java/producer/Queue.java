package com.java.producer;

public class Queue {
	private int n;

	boolean valueSet = false;

	public synchronized int getN() {
		if (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Got: " + n);
		valueSet = false;
		notify();
		return n;
	}

	public synchronized void put(int n) {
		if (valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		this.n = n;
		valueSet = true;
		System.out.println("Put: " + n);
		notify();
	}

}
