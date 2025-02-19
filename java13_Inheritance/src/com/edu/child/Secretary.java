package com.edu.child;

import com.edu.parent.Employee;
import com.edu.util.MyDate;

// Child Class...
public class Secretary extends Employee {
	private String bossOfName;
	
	public Secretary(String name, double salary, MyDate birthday, String bossOfName) {
		super(name, salary, birthday);
		this.bossOfName = bossOfName;
	}

	@Override
	public String getDetails() {
		return super.getDetails() + "\t" + bossOfName;
	}
}