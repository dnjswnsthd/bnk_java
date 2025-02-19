package com.edu.util;

public class MyDate {
	private int year;
	private int month;
	private int day;

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public String getDate() {
		return year + "-" + month + "-" + day;
	}
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}
	@Override
	public String toString() {
		return year + "-" + month + "-" + day;
	}
	
}
