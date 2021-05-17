package com.Coding.InnerClasses;
interface A{
	void eat();
}
public class DemoInterface {
 public static void main(String[] args) {
	A a = new A() {
	public 	void eat() {
			System.out.println("hello");
		}
	};
	a.eat();
}
}
