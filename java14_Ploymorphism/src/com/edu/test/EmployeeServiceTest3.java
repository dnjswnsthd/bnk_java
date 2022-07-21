package com.edu.test;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.child.Secretary;
import com.edu.parent.Employee;
import com.edu.service.EmployeePolyService;
import com.edu.util.MyDate;

public class EmployeeServiceTest3 {

	public static void main(String[] args) {
		Employee[] emps = { new Manager("염미정", 2400000, "문현동", new MyDate(2000, 2, 12), "개발부"),
				new Engineer("염창희", 3500000, "대연동", new MyDate(1999, 11, 14), "자바", 300),
				new Secretary("홍길동", 252000, "NY", new MyDate(1982, 4, 2), "James"),
				new Manager("염미정2", 2400000, "문현동2", new MyDate(2000, 2, 12), "개발부2") };
		EmployeePolyService service = new EmployeePolyService();
		for (Employee e : emps)
			service.manageEmployee(e);

		for (Employee e : emps)
			System.out.println(service.getAnnualSalary(e));
	}
	
	public Employee findEmployee(Employee [] employees, String name) {
		Employee find = null;
		
		return find;
	}
	
	public Employee [] findEmployee(Employee [] employees, String dept, String address) {
		Employee [] temp = new Employee[employees.length];
		
		return temp;
	}
}
