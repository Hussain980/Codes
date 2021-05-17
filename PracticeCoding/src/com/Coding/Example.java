package com.Coding;

public class Example {
	
	private String name;
	private int marks;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMarks(int marks) {
		this.marks=marks;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public static void main(String[] args) {
		Example ex = new Example();
		ex.setMarks(10);
		ex.setName("Hussain");
		System.out.println(ex.getMarks() + "   "+ex.getName());
	}
}
