package com.hashcodeequals;

class Parent {
	private String name;

	Parent(String name) {
		this.name = name;
		System.out.println(this.name);
		System.out.println("called parent");
	}
}

class Child extends Parent {

	Child(String name) {
		super(name);
		System.out.println("first called chile");
	}
}

public class Test5 {
	public static void main(String[] args) {
		Child child = new Child("ruhul");
	}
}