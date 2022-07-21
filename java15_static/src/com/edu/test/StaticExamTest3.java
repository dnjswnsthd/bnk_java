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
 * 6. 싱글톤  //클래스의 인스턴스를 하나만 생성하기 위해서 db connection pool
 * 메모리에 인스턴스 하나를 등록해 여러 쓰레드에서 동시에 하나의 객체를 이용할 수 있게 할 수 있다.
 * 동기화 문제
 * 
 * java실행파일이 구동되는 곳 (JVM) 문제 나옴
 * 
 */
class A{
	public final static int BASIC_SALARY = 3000000;
	public final String test() {
		return "오버라이딩 금지";
	}
}

final class B{ //상속 금지
	
}

/*class C extends B{
	
}*/

class D extends A{
	/*public final String test() {
	
	}오버라이딩 금지 */
	/*BASIC_SALARY = 350000; 상수 변경 금지*/
}
public class StaticExamTest3 {
	public static void main(String[] args) {
		
	}
}












