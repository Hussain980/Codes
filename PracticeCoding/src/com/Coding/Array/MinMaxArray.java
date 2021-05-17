package com.Coding.Array;

public class MinMaxArray {

	public static void main(String[] args) {
		int[] a = {12,12,13,14,5,17};
		int min = a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min =a[i];
			}
		}
		
		   System.out.println("Minimum element in array is "+min);
	}
}
