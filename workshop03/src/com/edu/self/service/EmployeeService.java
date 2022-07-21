package com.edu.self.service;

import java.util.ArrayList;

import com.edu.self.vo.parent.Employee;

public interface EmployeeService {
	// Employee를 추가한다.
	void addEmployee(ArrayList<Employee> employees, Employee e);

	// Manager 중 입력된 이름과 같은 사람의 급여와 부서명, 부서번호 정보를 업데이트 한다.
	void updateManager(ArrayList<Employee> employees, double salary, String dept, int deptno, String name);

	// Engineer 중 입력된 이름과 같은 사람의 급여와, 보너스 정보를 업데이트 한다.
	void updateEngineer(ArrayList<Employee> employees, double salary, double bonus, String name);

	// Name을 통해 Employee를 삭제한다.
	public void deleteEmployee(ArrayList<Employee> employees, String name);

	// Employee 중에서 이름이 입력과 같은 사람을 리턴한다.
	Employee findEmployee(ArrayList<Employee> employees, String name);

	// Manager 중에 부서번호가 같은 직원들을 리턴한다.
	ArrayList<Employee> findManager(ArrayList<Employee> employees, int deptno);

	// 전체 Employee를 출력한다.
	void printEmployee(ArrayList<Employee> employees);

	// Manager만 출력한다.
	void printManager(ArrayList<Employee> employees);

	// Engineer만 출력한다.
	void printEngineer(ArrayList<Employee> employees);

	// Employee, Manager, Engineer의 급여의 평균을 각각 출력한다.
	void findAllTypeSalaryAvg(ArrayList<Employee> employees);

	// Employee, Manager, Engineer의 연봉의 평균을 각각 출력한다.(보너스 포함)
	void findAllTypeYearSalaryAvg(ArrayList<Employee> employees);
	
	// 생일이 입력된 달인 직원 Employee, Manager의 경우 연봉을 input 만큼, Engineer인 경우 보너스를 input 만큼 추가해준다.
	void updateBirthdayBonus(ArrayList<Employee> employees, int month, int bonus);
}
