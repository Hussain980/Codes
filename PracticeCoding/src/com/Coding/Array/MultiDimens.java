package com.Coding.Array;

import java.util.ArrayList;
import java.util.HashSet;

public class MultiDimens {
    public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6},{9,8,7}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
		}
		
//		ArrayList<Integer> al = new ArrayList<>();
		HashSet<Integer> al = new HashSet<>();
		al.add(12);
		al.add(13);
		al.add(12);
		al.add(null);
		System.out.println(al);
	}
}
