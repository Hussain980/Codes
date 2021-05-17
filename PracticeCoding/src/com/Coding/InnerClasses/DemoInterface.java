package com.Coding.InnerClasses;

interface A {
	void eat();
}

public class DemoInterface {
	public static void main(String[] args) {
		/*A a = new A() {   // Implementation through Anonymous inner class
			public void eat() {
				System.out.println("hello");
			}
		};
		a.eat();*/
		
		A a = ()-> System.out.println("hello");   // implementation through lambda expression
		a.eat();
	}
		
		
}
