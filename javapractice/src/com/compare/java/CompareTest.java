package com.compare.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareTest {
	public static void main(String[] args) {
		Person pone = new Person(10, "rabedin");
		Person pone1 = new Person(5, "zainul");
		Person pone2 = new Person(3, "roxina");
		Person pone3 = new Person(3, "zainul");
		Person pone4 = new Person(30, "ruhul");

		List<Person> personList = new ArrayList<Person>();
		personList.add(pone);
		personList.add(pone1);
		personList.add(pone2);
		personList.add(pone3);
		personList.add(pone4);

		Collections.sort(personList, Person.personNameCompaarator);
		
		for(Person person : personList){
			System.out.println(person);
		}

	}
}
