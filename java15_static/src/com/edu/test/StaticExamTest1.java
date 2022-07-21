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
 * 6. 싱글톤  
 * 
 * java실행파일이 구동되는 곳 (JVM) 문제 나옴
 * 
 */
class StaticExam{
	// member level에서 사용해야 한다..
	static String name = "홍길동"; // static v, class v, 전역변수
	static int age = 19;
	int count = 1; // field, 멤버 변수
	
	// static은 static 끼리 통한다.
	public static void getMember() {
		System.out.println("우/유/빛/깔" + name);
	}
	
	public void getMember2() {
		System.out.println("우/유/빛/깔" + name);
	}
}
public class StaticExamTest1 {
	public static void main(String[] args) {
		// static한 멤버를 사용할 때는 클래스이름.static 멤버;
		StaticExam.getMember();
		StaticExam staticexam = new StaticExam();
		staticexam.getMember2();
		System.out.println("========================");
		staticexam.getMember();
		
	}
}
