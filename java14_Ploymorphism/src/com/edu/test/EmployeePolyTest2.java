package com.edu.test;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.child.Secretary;
import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class EmployeePolyTest2 {

	public static void main(String[] args) {
		/*
		 * 부모타입의 클래스는
		 * 다양한 이기종간의 자식클래스들을 담는 일종의 컨테이너 역할을 한다.
		 * 
		 * Heterogeneous Collection
		 * 이기종간의 집합체
		 * 상속 + 다형성을 적용하면 배열의 전제조건인 Same Data Type이 깨어진다.
		 * 부모타입으로 다양한 자식들을 다 감싸안을수 있기 때문이다.
		 */
		Employee [] emps = {
				new Manager("염미정", 2400000, "문현동", new MyDate(2000, 2, 12), "개발부"),
				new Engineer("염창희", 3500000, "대연동", new MyDate(1999, 11, 14), "자바", 300),
				new Secretary("홍길동", 252000, "NY", new MyDate(1982, 4, 2), "James"),
				new Manager("염미정2", 2400000, "문현동2", new MyDate(2000, 2, 12), "개발부2")
		};
		
		for(Employee e : emps) {
			System.out.println(e.getDetails());
		}

	}
}
