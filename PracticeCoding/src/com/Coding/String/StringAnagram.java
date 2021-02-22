package com.Coding.String;

import java.util.Arrays;

public class StringAnagram {

	  public static void main(String[] args) {
		String s1 = "cat";
		String s2 = "actq";
		char[] a1 = s1.toLowerCase().toCharArray();
		char[] a2 = s2.toLowerCase().toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		Boolean b = Arrays.equals(a1, a2);
		if(b) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}
}
