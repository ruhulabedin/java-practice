package com.coffeconsumer.java;

public class ProducesCoffee implements Runnable {

	CoffeeShop coffeeShop;

	public ProducesCoffee(CoffeeShop coffeeShop) {
		this.coffeeShop = coffeeShop;
		new Thread(this, "Produces Coffee").start();
		
	}

	@Override
	public void run() {

		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			coffeeShop.makeCoffee(i);
		}

	}

}
