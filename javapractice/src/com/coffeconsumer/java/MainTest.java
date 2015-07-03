package com.coffeconsumer.java;

public class MainTest {
	public static void main(String[] args) {
		CoffeeShop coffeeShop = new CoffeeShop();
		new ProducesCoffee(coffeeShop);
		new ConsumeCoffer(coffeeShop);
	}

}
