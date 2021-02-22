package com.Coding.Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateArray {
	
	/*To find Duplicate elements from array*/

	 public static void main(String[] args) {
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++) {
		a[i] =	sc.nextInt();	
		}
		
	/*	First Approach*/
		
		
//	   for(int i=0;i<a.length;i++) {
//		   for(int j=i+1;j<a.length;j++) {
//			   if(a[i]==a[j]) {
//				   System.out.println("Duplicate founds : "+a[i]);
//			   }
//		   }
//	   }
		
		
	
		
		/*	First Approach*/
		
//		Set<Integer> set = new HashSet<>();
//		for(int s : a) {
//			if(!set.add(s)) {
//				System.out.println("Duplicate founds : "+s);
//			}
//		}
	}
}
