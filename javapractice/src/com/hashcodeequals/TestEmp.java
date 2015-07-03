package com.hashcodeequals;

import java.util.HashSet;
import java.util.Set;

public class TestEmp {
	public static void main(String[] args) throws InterruptedException {
		Emp emp1 = new Emp(23);
		Emp emp2 = new Emp(23);

		ThreadOne threadOne = new ThreadOne();
		Thread thread = new Thread(threadOne);
		thread.start();
		
		thread.join();

		Set<Emp> empSet = new HashSet<Emp>();
		empSet.add(emp1);
		empSet.add(emp2);
		System.out.println("emp1.equals(emp2)--->>>" + emp1.equals(emp2));
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
	}
}