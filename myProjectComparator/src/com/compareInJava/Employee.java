package com.compareInJava;

public class Employee implements Comparable<Employee>{ // Comparable is normal interface
	
	private int id = 0;
	private String name = null;
	@SuppressWarnings("null")
	private int salary = 0;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee that) {   // This compareTo method from Comparable interface
//		return this.salary-that.salary;
		return this.getName().compareTo(that.getName());
	}
}
