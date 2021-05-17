package com.sorting;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Employee1Test {

	public static void main(String[] args) {
		ArrayList<Employee1> list = new ArrayList<>();
		Employee1 e1 = new Employee1(1, "Ramesh", "Chhatarpur", "IT", 15000);
		Employee1 e2 = new Employee1(2, "Ranjan", "Kolkata", "IT", 40000);
		Employee1 e3 = new Employee1(3, "Junaid", "Mumbai", "Sales", 2000);
		Employee1 e4 = new Employee1(4, "Alok", "Surat", "HR", 18000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		
		System.out.println("Before Sorting ");
		for(Employee1 e : list) {
			System.out.println(e);
		}
		//Collections.sort(list,new SalarySorting());
		Collections.sort(list,new NameSorting());
		System.out.println("After sorting ");
		for(Employee1 e : list) {
			System.out.println(e);
		}
		System.out.println(LocalDate.now());
	}
	
}
