package com.Coding;

interface A{
	void d1();
}

interface B{
	void d1();
}

public class Test2 implements A,B{


	@Override
	public void d1() {
		System.out.println("A  ");
		
	}
	
	public static void main(String[] args) {
		B a = new Test2();
		a.d1();
	}

	
 
}
