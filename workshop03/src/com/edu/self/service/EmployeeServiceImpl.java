package com.edu.self.service;

import java.util.ArrayList;

import com.edu.self.vo.child.Engineer;
import com.edu.self.vo.child.Manager;
import com.edu.self.vo.parent.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	// 싱글톤 패턴 적용
	private static EmployeeServiceImpl service = new EmployeeServiceImpl();

	private EmployeeServiceImpl() {
	}

	public static EmployeeServiceImpl getInstance() {
		return service;
	}

	@Override
	public void addEmployee(ArrayList<Employee> employees, Employee employee) {
		employees.add(employee);
	}

	@Override
	public void updateManager(ArrayList<Employee> employees, double salary, String dept, int deptno, String name) {
		for (Employee e : employees) {
			if (e instanceof Manager && e.getName().equals(name)) {
				((Manager) e).setDept(dept);
				((Manager) e).setDeptno(deptno);
				((Employee) e).setSalary(salary);
			}
		}
	}

	@Override
	public void updateEngineer(ArrayList<Employee> employees, double salary, double bonus, String name) {
		for (Employee e : employees) {
			if (e instanceof Engineer && e.getName().equals(name)) {
				((Engineer) e).setBonus(bonus);
				((Employee) e).setSalary(salary);
			}
		}
	}

	@Override
	public void deleteEmployee(ArrayList<Employee> employees, String name) {
		for (Employee e : employees) {
			if (e.getName().equals(name)) {
				employees.remove(e);
			}
		}
	}

	@Override
	public Employee findEmployee(ArrayList<Employee> employees, String name) {
		Employee temp = null;
		for (Employee e : employees) {
			if (e.getName().equals(name)) {
				temp = e;
			}
		}
		return temp;
	}

	@Override
	public ArrayList<Employee> findManager(ArrayList<Employee> employees, int deptno) {
		ArrayList<Employee> tmp = new ArrayList<>();
		for (Employee e : employees) {
			if (e instanceof Manager && ((Manager) e).getDeptno() == deptno) {
				tmp.add(e);
			}
		}
		return tmp;
	}

	@Override
	public void printEmployee(ArrayList<Employee> employees) {
		for (Employee e : employees) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void printManager(ArrayList<Employee> employees) {
		for (Employee e : employees) {
			if (e instanceof Manager) {
				System.out.println(e.toString());
			}
		}
	}

	@Override
	public void printEngineer(ArrayList<Employee> employees) {
		for (Employee e : employees) {
			if (e instanceof Engineer) {
				System.out.println(e.toString());
			}
		}
	}

	@Override
	public void findAllTypeSalaryAvg(ArrayList<Employee> employees) {
		double empSum = 0, mngSum = 0, engSum = 0;
		double mngMem = 0, engMem = 0;
		for (Employee e : employees) {
			if (e instanceof Manager) {
				mngSum += e.getSalary();
				mngMem++;
			} else if (e instanceof Engineer) {
				engSum += e.getSalary();
				engMem++;
			}
			empSum += e.getSalary();
		}
		System.out.println("전 직원의 급여 평균은 : " + (int) (empSum / employees.size()) + " 원 입니다.");
		System.out.println("매니저들의 급여 평균은 : " + (int) (mngSum / mngMem) + " 원 입니다.");
		System.out.println("엔지니어들의 급여 평균은 : " + (int) (engSum / engMem) + " 원 입니다.");
	}

	@Override
	public void findAllTypeYearSalaryAvg(ArrayList<Employee> employees) {
		double empSum = 0, mngSum = 0, engSum = 0;
		double mngMem = 0, engMem = 0;
		for (Employee e : employees) {
			if (e instanceof Manager) {
				mngSum += e.getSalary() * 12;
				mngMem++;
			} else if (e instanceof Engineer) {
				engSum += e.getSalary() * 12;
				engSum += ((Engineer) e).getBonus();
				engMem++;
			}
			empSum += e.getSalary() * 12;
		}
		System.out.println("전 직원의 급여 평균은 : " + (int) (empSum / employees.size()) + " 원 입니다.");
		System.out.println("매니저들의 급여 평균은 : " + (int) (mngSum / mngMem) + " 원 입니다.");
		System.out.println("엔지니어들의 급여 평균은 : " + (int) (engSum / engMem) + " 원 입니다.");
	}

	@Override
	public void updateBirthdayBonus(ArrayList<Employee> employees, int month, int bonus) {
		for (Employee e : employees) {
			if(e.getBirthDate().getMonth() == month) {
				if(e instanceof Engineer) {
					((Engineer) e).setBonus(((Engineer) e).getBonus() + bonus);
				}else {
					e.setSalary(e.getSalary() + bonus);
				}
			}
		}
	}

}
