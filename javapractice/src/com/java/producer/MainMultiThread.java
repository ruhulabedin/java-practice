package com.java.producer;

public class MainMultiThread {
	public static void main(String args[]) { 
		Queue q = new Queue(); 
		new Producer(q); 
		new Consumer(q); 
		System.out.println("Press Control-C to stop."); 
		} 
}
