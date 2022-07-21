package com.edu.company.vo;

public class Department {
	private String name;
	private String responsible;
	private Employee[] employees;

	public Department(String name, String responsible) {
		this.name = name;
		this.responsible = responsible;
	}

	public String getName() {
		return name;
	}

	public String getResponsible() {
		return responsible;
	}

	public void setEmployee(Employee[] employees) {
		this.employees = employees;
	}

	public Employee[] getEmployee() {
		return employees;
	}

}