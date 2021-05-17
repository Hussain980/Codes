package com.Coding.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayListEx {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<>();
	al.add(10);
	al.add(12);
	al.add(34);
	al.add(78);
	al.add(90);
	
	
	// Traversing 
	
	/*Iterator<Integer> it = al.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}*/
	
	/*ListIterator<Integer> li = al.listIterator(al.size());
	while(li.hasPrevious()) {
		 
		Integer i = li.previous();
		System.out.println(i);
		
	}*/
	
	/*for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));
	}*/
	
	Integer[] a = al.toArray(new Integer[al.size()]);
	for(Integer i : a) {
		System.out.println(i);
	}
	
	List<Integer> an = new ArrayList<Integer>();
	an = Arrays.asList(a);
	System.out.println(an);
}
}
