package com.Coding.InnerClasses;

abstract class Person{
	
    abstract void eat();      // anonymous classess are used to provide implementation for abstract methods of classes and interfaces
}

public class AnonymousInnerr {

	public static void main(String[] args) {
		Person p = new Person() {      
			void eat() {
				System.out.println("eating");   // implementation   for abstract method through anonymous classes
			}
		};
		
		p.eat();
	}
	
}
