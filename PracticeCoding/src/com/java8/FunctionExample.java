package com.java8;

import java.util.function.Function;

// Function interface contains apply() method
// when we want to perform some operation based on the input and produce output than we should go for function interface
// it contains one argument and return result  Function<Input type,return Type>
public class FunctionExample {
	
	public static void main(String[] args) {
		
		// return square of integer
		/*Function<Integer, Integer> r = i->i*i;
		System.out.println(r.apply(4));*/
		
		// calculate length of string
		Function<String, Integer> l = s->s.length();
		System.out.println(l.apply("Hussain"));
	}

}
