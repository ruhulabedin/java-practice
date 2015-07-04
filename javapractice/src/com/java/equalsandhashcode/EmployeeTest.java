package com.java.equalsandhashcode;

public class EmployeeTest {
	public static void main(String[] args) {
      Employee emp = new Employee();
      emp.setEmpid(10);
      emp.setFirstname("ruhul");
      emp.setLastname("abedin");
      emp.setEmail("ruhul.abedin@gmail.com");
      
      Employee emp1 = new Employee();
      emp1.setEmpid(10);
      emp1.setFirstname("ruhul");
      emp1.setLastname("abedin");
      emp1.setEmail("ruhul.abedin@gmail.com");
      
      System.out.println(emp.equals(emp1));
      System.out.println(emp.hashCode());
      System.out.println(emp1.hashCode());
	}
}
