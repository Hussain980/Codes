package com.Coding.InnerClasses;

public class MemberInnerrr {

	private int i =10;
	
	class Inner{
		
		void msg() {
			System.out.println(i);        // we can access private data members of outer class
		}
	}
	
	public static void main(String[] args) {
		MemberInnerrr me = new MemberInnerrr();  // first create outer class object
		MemberInnerrr.Inner in = me.new Inner();
		in.msg();
	}
	
}
