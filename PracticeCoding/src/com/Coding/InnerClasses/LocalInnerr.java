package com.Coding.InnerClasses;

public class LocalInnerr {
 
	void display() {
		class Inner{
			void msg() {
				System.out.println("Inside Inner class");
			}
		}
		
		Inner i = new Inner();    // inner class must be instantiated inside the method only
		i.msg();
	}
	
	public static void main(String[] args) {
		LocalInnerr lo = new LocalInnerr();
		lo.display();
	}
}
