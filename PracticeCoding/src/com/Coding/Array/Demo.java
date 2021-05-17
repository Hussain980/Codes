package com.Coding.Array;

public class Demo {
   
	public static void main(String[] args) {
		int[] a = {1,1,3,4,3};
		int count =0;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
