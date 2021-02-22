package com.Coding.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] a = {10,13,12,12,13,14,15,16,17,14};
//		Set<Integer> set = new HashSet<>();
//		for(int arr : a) {
//			set.add(arr);
//		}
//		
//		System.out.println(set);
		
		// Stream Api can be use
		// stream method of Arrays class 
		
		int[] st = Arrays.stream(a).distinct().toArray();
		for(int in : st) {
			System.out.print(in+" ");
		}
	}
}
