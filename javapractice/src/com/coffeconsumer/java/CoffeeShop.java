package com.coffeconsumer.java;

public class CoffeeShop {

	private int makeCoffeeNo;

	boolean coffeFlagAvailabe = false;

	public synchronized void makeCoffee(int makeCoffeeNo) {

		if (coffeFlagAvailabe) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.makeCoffeeNo = makeCoffeeNo;
		System.out.println("--------Make the Coffer By coffeeMachine----------"
				+ makeCoffeeNo);
		coffeFlagAvailabe = true;
		notify();
	}

	public synchronized int readyServeCoffee() {
		if (!coffeFlagAvailabe) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("--------Serve the Coffe By waiter----------"
				+ makeCoffeeNo);
		coffeFlagAvailabe = false;
		notify();
		return makeCoffeeNo;
	}

}
