package com.java.equalsandhashcode;

public class Employee {
	private int empid;
	private String firstname;
	private String lastname;
	private String email;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (this.getClass() != obj.getClass()) {
			return false;
		}

		if (obj instanceof Employee) {
			Employee emp = (Employee) obj;
			if (this.empid == emp.empid && this.email == emp.email
					&& this.firstname == emp.firstname
					&& this.lastname == emp.lastname) {
				return true;

			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 7 * hash + this.firstname.hashCode();
		hash = 7 * hash + this.lastname.hashCode();
		hash = 7 * hash + this.email.hashCode();
		return hash;
	}

}
