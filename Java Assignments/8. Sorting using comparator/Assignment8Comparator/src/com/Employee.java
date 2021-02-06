package com;

import java.util.Scanner;

public class Employee {

	private int id;
	private String name;
	private float salary;

	Scanner sc = new Scanner(System.in);

	public Employee(int id, String name, float salary) {
		super();
		System.out.println("Enter Id :");
		this.id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name :");
		this.name = sc.nextLine();
		System.out.println("Enter Salary : ");
		this.salary = sc.nextFloat();
	}

	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

//	public int compareTo(Employee o) {
////		if (this.id > o.id)
////			return -1;
////		else if (this.id < o.id) // decreasing order           //comparable
////			return 1;
////		return 0;
//		return this.id - o.id;
//	}

}
