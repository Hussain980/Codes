package com.Coding;

import java.io.IOException;

class Parent1 {

	protected void sum() throws Exception{
		System.out.println("Parent class method");
	}
}

class child extends Parent1 {
	  protected void sum() throws IOException {
		System.out.println("child class method");
	}
}

public class Overriding {
	public static void main(String[] args) throws Exception {
      Parent1 p = new child();
      p.sum();
	}

}
