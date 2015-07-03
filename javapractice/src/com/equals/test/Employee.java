package com.equals.test;

public class Employee {

	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (null == obj) {
			return false;
		}

		if (obj.getClass() != this.getClass()) {
			return false;
		}

		if (obj instanceof Employee) {
			Employee obj1 = (Employee) obj;
			if (this.age == obj1.getAge() && this.name == obj1.getName()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + age;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		return result;
	}

}