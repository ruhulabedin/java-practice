package com.equals.test;

import java.util.HashSet;

public class ClientTest {
        @SuppressWarnings("unused")
		public static void main(String[] args) {
            Employee employee = new Employee("rajeev", 24);
			Employee employee1 = new Employee("rajeev", 25);
            Employee employee2 = new Employee("rajeev", 24);
            
            System.out.println(employee==employee2);
            System.out.println(employee.equals(employee2));

            HashSet<Employee> employees = new HashSet<Employee>();
            employees.add(employee);
            System.out.println(employees.contains(employee2));
            System.out.println("employee.hashCode():  " + employee.hashCode()
                    + "  employee2.hashCode():" + employee2.hashCode());
        }
    }