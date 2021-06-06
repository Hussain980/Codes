package com.java8;

import java.util.ArrayList;
import java.util.List;

public class StreamExample2 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(19);
		l.add(39);
		l.add(44);
		l.add(1);
		l.stream().forEach(System.out::println);
		int min = l.stream().min((i1,i2)->-i1.compareTo(i2)).get();
		System.out.println("min is "+min);
		int max = l.stream().max((i1,i2)->-i1.compareTo(i2)).get();
		System.out.println("max is "+max);
	}
}
