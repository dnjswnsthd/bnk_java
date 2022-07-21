package com.edu.company.test;

import java.util.ArrayList;

import com.edu.company.service.CompanyService;
import com.edu.company.vo.Company;
import com.edu.company.vo.Department;
import com.edu.company.vo.Employee;
import com.edu.company.vo.MyDate;

public class CompanyTest {
	public static void main(String[] args) {
		Department[] departments = { new Department("영업부", "남부장"), new Department("개발부", "류부장"),
				new Department("개발부", "이부장"), new Department("개발부", "송부장") };
		Company[] companys = {
				new Company("부산은행", "문현", "대기업", "안감찬", new MyDate("1968", "1", "8"), 60392219672724.0, departments),
				new Company("부산은행", "문현", "대기업", "안감찬", new MyDate("1988", "1", "8"), 60392219672724.0, departments) };
		Employee[] employees1 = {
				new Employee("김사원", 'M', new MyDate("2022", "7", "21"), new MyDate("1997", "5", "20"), 10000, "사장"),
				new Employee("이사원", 'W', new MyDate("2015", "5", "30"), new MyDate("1985", "1", "2"), 10000, "대리"),
				new Employee("박사원", 'M', new MyDate("2012", "6", "12"), new MyDate("1987", "8", "7"), 10000, "대리"),
				new Employee("최사원", 'M', new MyDate("2014", "10", "9"), new MyDate("1990", "11", "21"), 10000, "계장"),
				new Employee("제갈사원", 'W', new MyDate("2021", "11", "5"), new MyDate("1975", "5", "5"), 10000, "사원"),
				new Employee("남궁사원", 'W', new MyDate("2022", "7", "21"), new MyDate("1998", "7", "15"), 10000, "대리"),
				new Employee("선우사원", 'W', new MyDate("2021", "11", "5"), new MyDate("1975", "3", "40"), 10000, "과장") };
		Employee[] employees2 = {
				new Employee("김사원", 'M', new MyDate("2022", "7", "21"), new MyDate("1997", "5", "20"), 20000, "과장"),
				new Employee("이사원", 'W', new MyDate("2015", "5", "30"), new MyDate("1985", "1", "2"), 20000, "사장"),
				new Employee("박사원", 'M', new MyDate("2012", "6", "12"), new MyDate("1987", "8", "7"), 20000, "차장"),
				new Employee("최사원", 'M', new MyDate("2014", "10", "9"), new MyDate("1990", "11", "21"), 20000, "대리"),
				new Employee("제갈사원", 'W', new MyDate("2021", "11", "5"), new MyDate("1975", "5", "5"), 20000, "사원"),
				new Employee("남궁사원", 'W', new MyDate("2022", "7", "21"), new MyDate("1998", "7", "15"), 20000, "사원"),
				new Employee("선우사원", 'W', new MyDate("2021", "11", "5"), new MyDate("1975", "3", "40"), 20000, "과장") };

		companys[0].getDepartment()[0].setEmployee(employees1);
		companys[0].getDepartment()[1].setEmployee(employees2);
		CompanyService service = new CompanyService();
		ArrayList<Employee> emplist = new ArrayList<>();
		emplist = service.searchEmployeeByMarketCapAndPosition(companys, 1000000l, "대리");
		for (Employee e : emplist) {
			System.out.println(e.toString());
		}
		System.out.println(service.getMaxAvgSalaryDept(companys[0]));
		System.out.println("====================================");
		// 1.
		Employee[] returnEP = service.getAllEmployee(departments[0]);
		for (Employee e : returnEP) {
			System.out.println(e.getName());
		}
		// 2.
		Department[] returnDP = service.getAllDepartment(companys[0]);
		System.out.println("===== 입력 회사의 모든 부서 =====");
		for (Department d : returnDP) {
			System.out.println(d.getName());
		}

	}
}
