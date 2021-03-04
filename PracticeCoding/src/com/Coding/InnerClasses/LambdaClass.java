package com.Coding.InnerClasses;

@FunctionalInterface
interface intra{
	void me();   // it is used only with single abstract method
//	void ff();   
}

public class LambdaClass {

	public static void main(String[] args) {
		intra i = ()->{                                  
			System.out.println("lambda expression");  // lambda expression is only implement only one abstract method in interface
		};
		i.me();
	}
}
