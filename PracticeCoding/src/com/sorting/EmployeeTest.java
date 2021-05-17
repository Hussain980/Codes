package com.sorting;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		Employee e1 = new Employee(1, "Ramesh", "Chhatarpur", "IT", 15000);
		Employee e2 = new Employee(2, "Ranjan", "Kolkata", "IT", 40000);
		Employee e3 = new Employee(3, "Junaid", "Mumbai", "Sales", 2000);
		Employee e4 = new Employee(4, "Alok", "Surat", "HR", 18000);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		System.out.println("Before Sorting ");
		for(Employee e : al) {
			System.out.println(e);
		}
		Collections.sort(al);
		
		System.out.println("After sorting ");
		for(Employee e : al) {
			System.out.println(e);
		}
		System.out.println(LocalDate.now());
	}

}
