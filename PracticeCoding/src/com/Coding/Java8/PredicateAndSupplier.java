package com.Coding.Java8;

import java.util.function.Predicate;

public class PredicateAndSupplier{

	/*@Override
	public void accept(Integer t) {
      System.out.println("Printing "+ t);		
	}*/
	public static void main(String[] args) {
	  /*Consumer<Integer> c = (t)->System.out.println("Consumer "+t);
	  c.accept(10);*/
		
		Predicate<Integer> pr = (t)->{
			if(t%2==0) {
				return true;	
		}
			else	
		 {
				return false;
		}
			
	};
	
	System.out.println(pr.test(21));
		
	}

}
