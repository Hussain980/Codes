package com.Coding.String;

import java.util.Random;

public class RandomNumber {

	
	
	public static void main(String[] args) {
	    // It will generate 6 digit random Number.
	    // from 0 to 999999
	    Random rnd = new Random();
	    int number = rnd.nextInt(999999);

	    // this will convert any number sequence into 6 character.
	    System.out.println(String.format("%06d", number));
	}
}
