package com.edu.parent;

// Parent Class...
/*
 * 
 * Overloading
 * Method 	   Overloading (문제 냈습니다. 메소드 이름은 같고 매개변수는 다르다)
 * ConsTructor Overloading (필수 정보 이외는 기본값으로 객체생성하기 위해서)
 * 
 * this 키워드 (주관식  답 : this) 
 * 멤버변수와 로컬 변수가 이름이 같을때 구분하기 위해서
 * 생성자 앞에 붙은 this는 그 클래스 안에 있는 또 다른 생성자를 호출하는 기능(인자값 꽉찬거)
 */
import com.edu.util.MyDate;

public class Employee {
	private String name;
	private double salary;
	private MyDate birthday;
	
	public static final double BASIC_SALARY = 100;
	public static final String BASIC_NAME = "홍길동";

	public Employee(String name) {
		super();
		this.name = name;
	}

	public Employee(String name, MyDate birthday) {
		this(name, BASIC_SALARY,  birthday);
	}

	public Employee(double salary, MyDate birthday) {
		this("홍길동", salary, birthday);
	}
	
	public Employee(String name, double salary, MyDate birthday) {
		super();
		this.name = name;
		this.salary = salary;
		this.birthday = birthday;
	}

	public String getDetails() {
		return name + "\t" + salary + "\t" + birthday;
	}
}
