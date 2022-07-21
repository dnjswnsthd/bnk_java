package com.edu.self.vo.child;

import com.edu.self.util.MyDate;
import com.edu.self.vo.parent.Employee;

public class Engineer extends Employee {
	private String tech;
	private double bonus;

	public Engineer(String name, MyDate birthDate, double salary, String tech) {
		super(name, birthDate, salary);
		this.tech = tech;
	}
	
	public Engineer(String name, MyDate birthDate, double salary, double bonus) {
		super(name, birthDate, salary);
		this.bonus = bonus;
	}
	
	public Engineer(String name, MyDate birthDate, double salary, String tech, double bonus) {
		super(name, birthDate, salary);
		this.tech = tech;
		this.bonus = bonus;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return super.toString() + "\t" + tech + "\t" + bonus;
	}
	
}
