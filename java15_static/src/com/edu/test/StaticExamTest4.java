package com.edu.test;
/*
 * static 성질 (문제 주관식) 정답 : static 키워드는 다 소문자다.
 * 1. static으로 지정된 멤버는 객체 생성 과정 없이 메모리에 올라간다. // 이게 문제 일듯 객체 생성 과정 없이 메모리에 올라가기 위해 붙여야하는 키워드
 * 2. class 파일이 로더되는 시점에 메모리에(JVM) 로더된다.
 * 3. static이 붙은 변수는 필드 로컬 레벨에서 사용될 수 없다.
 * 4. static으로 지정된 변수들은 생성된 객체들이 모두 공유한다!!!
 * 	  필드 VS 로컬변수 VS 클래스변수(static)
 * 5. static final은 거의 함께 붙어서 사용된다. -----Usage Modifier...
 *    final static
 *    final "내가 마지막이야~~~"
 *    final + 변수 : "내가 마지막 변수야~~" --> 상수의미
 *    final + 메소드 : "내가 마지막 메소드야~~" --> 오버라이딩 금지
 *    final + 클래스 : 내가 마지막 클래스야~~" --> 상속 금지
 *    !! 문제나옴 
 * 6. 싱글톤  //클래스의 인스턴스를 하나만 생성하기 위해서 db connection pool 문제 나온다
 * 메모리에 인스턴스 하나를 등록해 여러 쓰레드에서 동시에 하나의 객체를 이용할 수 있게 할 수 있다.
 * 동기화 문제
 * 1). 일단 클래스 안에서 하나의 객체는 생성
 * 		private static 으로 객체를 하나 생성한다.
 * 2). 다른 곳에서 해당 클래스로 객체생성 못하도록 막아둔다.
 * 		private 생성자(){}
 * 3). public static Service getInstance(){ //!!static을 빠드리면 안됨
 * 			return service e;
 * 		}
 * 
 * java실행파일이 구동되는 곳 (JVM) 문제 나옴
 * 
 */
class Service{
	private static Service service = new Service();
	private Service() {
		System.out.println("Singtone Pattern Ready....");
	}
	public static Service getInstance() { // static을 안쓰면 getInstance()가 생성할 수 없어서 쓸 수 가 없다!!!!!
		return service;
	}
}
public class StaticExamTest4 {
	public static void main(String[] args) {
//		Service s1 = new Service();
		Service service1 = Service.getInstance();
		Service service2 = Service.getInstance();
		Service service3 = Service.getInstance();
		System.out.println(service1);
		System.out.println(service2);
		System.out.println(service3);
	}
}












