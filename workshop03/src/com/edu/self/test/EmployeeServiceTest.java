package com.edu.self.test;

import java.util.ArrayList;

import com.edu.self.service.EmployeeServiceImpl;
import com.edu.self.util.MyDate;
import com.edu.self.vo.child.Engineer;
import com.edu.self.vo.child.Manager;
import com.edu.self.vo.parent.Employee;

public class EmployeeServiceTest {
	public static void main(String[] args) {
		// 싱글톤으로 생성된 인스턴스
		EmployeeServiceImpl service = EmployeeServiceImpl.getInstance();

		ArrayList<Employee> employees = new ArrayList<>();
		// Manger 추가
		service.addEmployee(employees, new Manager("김일이", new MyDate(1978, 1, 1), 20000.0, "영업부", 10));
		service.addEmployee(employees, new Manager("이삼사", new MyDate(1975, 2, 1), 34000.0, "개발부", 20));
		service.addEmployee(employees, new Manager("박오륙", new MyDate(1980, 3, 3), 20000.0, "마케팅부", 30));
		service.addEmployee(employees, new Manager("최칠팔", new MyDate(1995, 8, 1), 37000.0, "인사부", 10));

		// Engineer 추가
		service.addEmployee(employees, new Engineer("정구십", new MyDate(1995, 3, 4), 350000.0, "Java", 200.0));
		service.addEmployee(employees, new Engineer("오십구", new MyDate(1995, 7, 2), 350000.0, "Java", 200.0));
		service.addEmployee(employees, new Engineer("조구십", new MyDate(1994, 11, 2), 450000.0, "Python", 300.0));

		// 전체 출력
		System.out.println("=================전체 Employee 출력=================");
		service.printEmployee(employees);

		System.out.println("================= Manager 출력=================");
		service.printManager(employees);

		System.out.println("================= Engineer 출력=================");
		service.printEngineer(employees);

		// updateManager
		System.out.println("================= Manager Update 후 출력=================");
		service.updateManager(employees, 50000.0, "개발부", 20, "김일이");
		service.printManager(employees);

		// updateEngineer
		System.out.println("================= Engineer Update 후 출력=================");
		service.updateEngineer(employees, 50000.0, 350.0, "정구십");
		service.printEngineer(employees);

		// deleteEmployee
		System.out.println("=================  deleteEmployee 후 출력=================");
		service.deleteEmployee(employees, "오십구");
		service.printEngineer(employees);

		// findEmployee
		System.out.println("================= findEmployee 결과=================");
		Employee emp = service.findEmployee(employees, "조구십");
		System.out.println(emp.toString());

		// findManager
		System.out.println("================= findEmployee 결과=================");
		ArrayList<Employee> emps = service.findManager(employees, 20);
		for (Employee e : emps) {
			System.out.println(e.toString());
		}

		// findAllTypeSalaryAvg
		System.out.println("================= 직원 Type별 급여 평균 결과=================");
		service.findAllTypeSalaryAvg(employees);
		
		// findAllTypeYearSalaryAvg
		System.out.println("================= 직원 Type별 연봉 평균 결과=================");
		service.findAllTypeYearSalaryAvg(employees);
	}
}
