package com.Coding.Array;

public class FirstAndSecondLargest {

	public static void main(String[] args) {
		int[] a = {10,11,76,98,35,26,88,90};
		int firstlargest =0;
		int secondLargest =0;
		for(int i=0;i<a.length;i++) {
			if(firstlargest<a[i]) {
				secondLargest =firstlargest;
				firstlargest=a[i];
			}else if(secondLargest<a[i]) {
				secondLargest=a[i];	
			}
		}
		
		System.out.println("first largest : "+firstlargest + " Second Largest " +secondLargest);
   }
}