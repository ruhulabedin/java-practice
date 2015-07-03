package com.compare.java;

import java.util.Comparator;

public class Person implements Comparable<Person> {
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int id;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id----"+id+"name---"+name;
	}

	public String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Person other) {
		return (this.id < other.id) ? -1 : (this.id > other.id) ? 1 : 0;
	}
	
	public static Comparator<Person> personNameCompaarator = new Comparator<Person>(){

		@Override
		public int compare(Person o1, Person o2) {
			return o1.getName().compareTo(o2.getName()) ;
		}
		
	};
}
