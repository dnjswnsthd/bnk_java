package com.edu.self.vo.child;

import com.edu.self.util.MyDate;
import com.edu.self.vo.parent.Employee;

public class Manager extends Employee {
	private String dept;
	private int deptno;

	public Manager(String name, MyDate birthDate, double salary, String dept) {
		super(name, birthDate, salary);
		this.dept = dept;
	}

	public Manager(String name, MyDate birthDate, double salary, int deptno) {
		super(name, birthDate, salary);
		this.deptno = deptno;
	}

	public Manager(String name, MyDate birthDate, double salary, String dept, int deptno) {
		super(name, birthDate, salary);
		this.dept = dept;
		this.deptno = deptno;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public int getDeptno() {
		return deptno;
	}

	@Override
	public String toString() {
		return super.toString() + "\t" + dept + "\t" + deptno;
	}

}
