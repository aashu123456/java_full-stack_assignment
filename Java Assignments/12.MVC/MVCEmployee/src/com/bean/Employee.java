package com.bean;

public class Employee {
	private int id;
	private String name;
	private float salary;
	private String designation;

	public int getId() {
		return id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {

		this.designation = designation;
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
