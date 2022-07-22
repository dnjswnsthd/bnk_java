package com.edu.service.impl;

/*
 * VO클래스들을 핸들링하는 기능들만 모아놓은 서비스 클래스
 * 서비스 인터페이스를 상속받아서 작성했다.
 * 
 * 이런 서비스 클래스는 클라이언트에서 요청이 아무리 많이 들어와도
 * 클래스 인스턴스는 단 하나 서버상에 만들어놓고
 * 요청을 처리하는 것은 서비스 클래스에 메소드가 요청을 받아서 처리한다.
 * 즉 Singletone Pattern으로 작성
 * 
 * 해당 서비스 클래스는 이후 JDBC기술에서 Database 어플리케이션이 될 것이다.
 * 
 * 싱글톤 작성 패턴
 * 1. private static 객체를 일단 하나 생성
 * 2. private 생성자..다른곳에서 생성을 하지 못하도록 막아둔다
 * 3. public static 생성한 객체를 받아 쓸수 있도록 열어둔다
 */
import java.util.ArrayList;

import com.edu.service.EmployeeListService;
import com.edu.vo.Employee;
import com.edu.vo.Engineer;
import com.edu.vo.Manager;

public class EmployeeListServiceImpl implements EmployeeListService {

	// 추가
	private ArrayList<Employee> list;
	ArrayList<String> empId;

	// 싱글톤 추가
	private static EmployeeListServiceImpl service = new EmployeeListServiceImpl();

	private EmployeeListServiceImpl() {
		list = new ArrayList<>();
		empId = new ArrayList<>();
	}

	public static EmployeeListServiceImpl getInstance() {
		return service;
	}

	@Override
	public void addEmployee(Employee e) {
		// list에 추가하도록 로직을 작성
		if (!empId.contains(e.getEmpId())) {
			list.add(e);
			empId.add(e.getEmpId());
		} else
			System.out.println("추가 실패!! " + e + "님은 이미 등록되어있습니다.");
	}

	@Override
	public void deleteEmployee(String empId) {
		// list에서 삭제
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(empId)) {
				list.remove(i);
				break;

			}
		}

	}

	// id는 수정의 대상이 안된다..
	// id를 제외한 나머지 필드값이 수정의 대상이 된다.
	@Override
    public void updateEmployee(Employee e) {
        for(Employee emp: list) {
            if(emp.getEmpId().equals(e.getEmpId())) { //수정할 대상이 존재한다면
                emp.setName(e.getName());
                emp.setAddr(e.getAddr());
                emp.setSalary(e.getSalary());
                if(emp instanceof Manager) {
                    ((Manager) emp).changeDept(((Manager) e).getDept());
                }
                if(emp instanceof Engineer) {
                    ((Engineer) emp).changeTech(((Engineer) e).getTech());
                    ((Engineer) emp).changeBonus(((Engineer) e).getBonus());
                }
            }
        }
    }

	@Override
	public ArrayList<Employee> findEmployees(String addr) {
		ArrayList<Employee> temp = new ArrayList<Employee>();
		// list에서 검색
		for (Employee e : list) {
			if (e.getAddr().equals(addr)) {
				temp.add(e);
			}
		}
		return temp;
	}

	@Override
	public void findEmployees() {
		// list에 있는 데이타들을 콘솔로 출력
		for (Employee e : list)
			System.out.println(e);
	}
}
