package com.sorting;

import java.util.Comparator;

public class SalarySorting implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
	  return (int) (o1.getSalray()-o2.getSalray());
	}

}
