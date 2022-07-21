package com.edu.company.vo;

public class Company {
	private String name;
	private String address;
	private String scale;
	private String ceo;
	private MyDate foundingDate;
	private double marketCap;
	private Department[] department;

	public Company() {
	};

	public Company(String name, String address, String scale, String ceo, MyDate foundingDate, double marketCap,
			Department[] department) {
		super();
		this.name = name;
		this.address = address;
		this.scale = scale;
		this.ceo = ceo;
		this.foundingDate = foundingDate;
		this.marketCap = marketCap;
		this.department = department;
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

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public MyDate getFoundingDate() {
		return foundingDate;
	}

	public void setFoundingDate(MyDate foundingDate) {
		this.foundingDate = foundingDate;
	}

	public double getMarketCap() {
		return marketCap;
	}

	public void setMarketCap(double marketCap) {
		this.marketCap = marketCap;
	}

	public Department[] getDepartment() {
		return department;
	}

	public void setDepartment(Department[] department) {
		this.department = department;
	}

}