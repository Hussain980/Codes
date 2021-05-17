package com.Coding.Array;

public class TwoArrayDuplicacy {

	 public static void main(String[] args) {
		int[] a = {10,1,211,12,23,22,44,56,7};
		int[] b = {101,10,21,32,23,62,84,56,90};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println("Duplicate Found "+a[i]);
				}
			}
		}
	}
}
