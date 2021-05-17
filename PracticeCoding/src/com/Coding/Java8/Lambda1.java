package com.Coding.Java8;

interface demo{
	
	//void m1();
	void m1(int i,int j);
}

public class Lambda1 {
	public static void main(String[] args) {
		  demo d = (i,j)->System.out.println("lambda expression working "+i +"  "+j);
		  d.m1(11,12);
	}

}
