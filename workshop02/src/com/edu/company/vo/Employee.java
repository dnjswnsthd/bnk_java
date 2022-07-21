package com.edu.company.vo;

public class Employee {

	// 필드
	private String name; // 직원이름
	private char gender; // 성별(F,M)
	private double salary; // 급여
	private int career; // 경력(년수)
	private String position; // 직급(사원, 대리,,,)
	private MyDate startDate; // 입사일
	private MyDate birthDate; // 생년월일
	private int vacation; // 연차(남은 수)

	// setter

	// 직원이름, 성별, 입사일, 생년월일 생성자
	public Employee(String name, char gender, MyDate startDate, MyDate birthDate) {
		this.name = name;
		this.gender = gender;
		this.startDate = startDate;
		this.birthDate = birthDate;
	}
	
	public Employee(String name, char gender, MyDate startDate, MyDate birthDate, double salary, String position) {
		this.name = name;
		this.gender = gender;
		this.startDate = startDate;
		this.birthDate = birthDate;
		this.salary = salary;
		this.position = position;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setCareer(int career) {
		this.career = career;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setVacation(int vacation) {
		this.vacation = vacation;
	}

	// getter

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public double getSalary() {
		return salary;
	}

	public int getCareer() {
		return career;
	}

	public String getPosition() {
		return position;
	}

	public MyDate getStartDate() {
		return startDate;
	}

	public MyDate getBirthDate() {
		return birthDate;
	}

	public int getVacation() {
		return vacation;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", salary=" + salary + ", career=" + career
				+ ", position=" + position + ", startDate=" + startDate.fullDate() + ", birthDate=" + birthDate.fullDate() + ", vacation="
				+ vacation + "]";
	}
}