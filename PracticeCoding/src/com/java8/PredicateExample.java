package com.java8;

import java.util.ArrayList;
import java.util.function.Predicate;

// predicate is a predefined functional interface in java 8 
// present in java.util.function package
// used for conditional check
// contains test(T t) method its return type is boolean
// multiple predicates can be joined  p1.and(p2).test(); p1.or(p2).test();  p1.negate(p2).test();
public class PredicateExample {
   public static void main(String[] args) {
	/*Predicate<Integer> p = i->i%2==0;
	System.out.println(p.test(12));
	System.out.println(p.test(19));*/
	   
	   ArrayList<Employee> e = new ArrayList<>();
	   e.add(new Employee(25,25000));
	   e.add(new Employee(29,30000));
	   e.add(new Employee(22,28000));
	   e.add(new Employee(35,150000));
	   
	   Predicate<Employee> emp = (p)->p.age>25;
	   for(Employee em : e) {
		   if(emp.test(em)) {
			   System.out.println(em.age +"  "+  em.salary);
		   }
	   }
}
}

class Employee{
	
	public int age;
	public double salary;
	public Employee(int age, double salary) {
		super();
		this.age = age;
		this.salary = salary;
	}
	
	
}
