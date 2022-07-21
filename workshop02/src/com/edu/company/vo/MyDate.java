package com.edu.company.vo;

public class MyDate {
	private String year;
	private String month;
	private String day;
	
	public MyDate(String year, String month, String day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public String getYear() {
		return year;
	}

	public String getMonth() {
		return month;
	}

	public String getDay() {
		return day;
	}
	
	public String fullDate() {
		return year + "-" + month + "-" + day;
	}
	
}
