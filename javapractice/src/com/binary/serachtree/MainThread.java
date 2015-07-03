package com.binary.serachtree;

public class MainThread {
	public static void main(String[] args) throws InterruptedException {
		EvenThread ev = new EvenThread();
		OddThread od = new OddThread();
		Thread t = new Thread(ev);
		Thread t1 = new Thread(od);
		t.start();
		t.join();
		t1.start();
		
	}
}
