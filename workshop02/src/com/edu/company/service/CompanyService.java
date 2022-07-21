package com.edu.company.service;

import java.util.ArrayList;

import com.edu.company.vo.Company;
import com.edu.company.vo.Department;
import com.edu.company.vo.Employee;
import com.edu.company.vo.MyDate;

public class CompanyService {
	// 부서에 있는 모든 직원을 리턴한다.
	public Employee[] getAllEmployee(Department dept) {
		Employee[] employees = null;

		return employees;
	}

	// 특정 회사의 모든 부서를 리턴한다.
	public Department[] getAllDepartment(String name) {
		Department[] dapartments = null;

		return dapartments;
	}

	// 회사의 모든 부서의 경력이 (Input)이상인 직원의 (Input)%만큼 변경한다.
	public void changeSalaryByCareer(int carreer, double changeRate) {

	}

	// 특정 회사의 (Input) 달에 생일자의 연차를 지급한다.
	public void appendVacationByBirthDate(Company company, MyDate birthDate) {

	}

	// 시가 총액이 (Input) 이상인 회사의 직급이 (Input)인 직원 리스트
	public ArrayList <Employee> searchEmployeeByMarketCapAndPosition(Company [] companys, Long marketCap, String position) {
		ArrayList <Employee> employees = new ArrayList<>();
		for(Company c : companys) {
			if(c.getMarketCap() >= marketCap) {
				for(Department d : c.getDepartment()) {
					if(d.getEmployee() == null) continue; 
					for(Employee e : d.getEmployee()) {
						if(e.getPosition() == null) continue;
						if(e.getPosition().equals(position)) {
							employees.add(e);
						}
					}
				}
			}
		}

		return employees;
	}

	// 모든 회사의 특정 부서에 성별이 (Input)인 직원을 리턴한다.(overloading)
	public Employee[] searchEmployeeBySomething(String name, char gender) {
		Employee[] employees = null;

		return employees;
	}

	// 모든 회사의 특정 부서에 경력이 (Input)인 직원을 리턴한다. (overloading)
	public Employee[] searchEmployeeBySomething(String name, int career) {
		Employee[] employees = null;

		return employees;
	}

	// 모든 회사의 특정 부서에 연봉이 (Input) 이상인 직원을 리턴한다.(overloading)
	public Employee[] searchEmpolyeeBySomething(String name, Double salary) {
		Employee[] employees = null;

		return employees;
	}
	// 특정 회사의 각 부서별 급여 평균의 최대인 부서명을 리턴한다.
	public String getMaxAvgSalaryDept(Company company) {
		String tmp = "";
		Double avg = 0.0;
		for(Department d : company.getDepartment()) {
			double sum = 0;
			if(d.getEmployee() == null) continue;
			for(Employee e : d.getEmployee()) {
				if(e.getSalary() == 0) continue;
				sum += e.getSalary();
			}
			if(avg < sum / d.getEmployee().length) {
				avg = sum / d.getEmployee().length;
				tmp = d.getName();
			}
		}
		return tmp;
	}
}
