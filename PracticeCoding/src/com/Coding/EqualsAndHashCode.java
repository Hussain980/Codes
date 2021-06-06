package com.Coding;
// if return type of equals method of two object is true than their hash code value will be same
// if we override equals method then we must override hashcode method
import java.util.HashSet;
import java.util.Set;

public class EqualsAndHashCode {
	public static void main(String[] args) {
		Employee e1 = new Employee(10, "Hussain");
		Employee e2 = new Employee(10, "Hussain");
		Employee e3 = e1;
		System.out.println(e1.equals(e3));
		System.out.println(e1.hashCode());
		System.out.println(e3.hashCode());
		
		Set<Employee> s = new HashSet<>();
		s.add(e1);
		s.add(e2);
		for(Employee s1 : s) {
			System.out.println(s1);
		}
	}
}

class Employee {

	public int id;
	public String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	

}
