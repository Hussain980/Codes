package com.sorting;

public class Employee1 {
	private int id;
	private String name;
	private String address;
	private String department;
	private double salray;

	public Employee1(int id, String name, String address, String department, double salray) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.department = department;
		this.salray = salray;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalray() {
		return salray;
	}

	public void setSalray(double salray) {
		this.salray = salray;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", department=" + department
				+ ", salray=" + salray + "]";
	}

}
