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
class Car{
	int serialNumber;
	static int counter;
	Car() {
		counter++;
		serialNumber = counter;
	}
}
public class StaticExamTest2 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		System.out.println("===================field====================="); // 객체 마다 서로 다른 값을 가진다.
		System.out.println(c1.serialNumber);
		System.out.println(c2.serialNumber);
		System.out.println(c3.serialNumber);
		System.out.println("===================static====================="); // 힙에 없기 때문에 class area에 있는 값을 공유해서 쓴다.
		System.out.println(Car.counter);
		System.out.println(c1.counter); // counter은 class area에서 생성되서 값을 하나만 가짐
		System.out.println(c2.counter);
		System.out.println(c3.counter);
		
	}
}












