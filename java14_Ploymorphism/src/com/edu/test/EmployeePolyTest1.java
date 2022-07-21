package com.edu.test;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class EmployeePolyTest1 {

	public static void main(String[] args) {
		Employee e = new Employee("구자경", 2000000, "역삼동", new MyDate(1999, 1, 3));
		Manager m = new Manager("염미정", 2400000, "문현동", new MyDate(2000, 2, 12), "개발부");
		Engineer eg = new Engineer("염창희", 3500000, "대연동", new MyDate(1999, 11, 14), "자바", 300);

		System.out.println(e.getDetails());
		System.out.println(m.getDetails());
		System.out.println(eg.getDetails());
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////
		/*
		 * PolyMorphism(답 : 다형성  정확하게 쓰기  문제 냈습니다. 주관식)
		 * ::
		 * 부모타입으로 자식 객체를 생성하는 것
		 * ::
		 * 1. Manager m = new Manager();
		 * 				VS 
		 * 2. Employee m1 = new Manager(); => 다형성 
		 * 
		 */
		/*
		 * Virtual Method Invocation 원리
		 * 상속 관계에서 오버라이딩된 자식의 메소드에서 발생된다.
		 * Compile Type - 부모의 메소드 호출
		 * Runtime Type - 생성된 실질적인 자식의 메소드를 호출
		 */
		System.out.println("============================================================");
		Employee m1 = new Manager("염미정", 2400000, "문현동", new MyDate(2000, 2, 12), "개발부");
		Employee eg1 = new Engineer("염창희", 3500000, "대연동", new MyDate(1999, 11, 14), "자바", 300);
		
		/*
		 * Object casting
		 * 부모타입에 없는 자식만의 멤버를 호출할 때 발생
		 * 자식타입으로 Casting하고 나서 자식의 타입으로 다시 찾아야 한다.
		 */
		((Manager) m1).changeDept("AI 분석부");
//		Manager manager = (Manager) m1;
//		manager.changeDept("AI 분석부");

		System.out.println(m1.getDetails());
		System.out.println(eg1.getDetails());		
	}
}
