package com.edu.oop;
/*
 * 어제 핵심 이슈
 * object Class	  			| 		~ Test (Test 클래스, 실행 클래스)
 * main() 이 없다 ---> 컾마일의 대상			main() 이 있다 ---> 실행의 대상
 * 									1. 객체 생성 == 클래스의 멤버를 메모리에 올린다.
 * 									2. 접근 
 * 										필드 -> 값 할당
 * 										메소드 -> 호출
 * 구성요소
 * filed(멤버 변수) : 값이 저장되는 공간
 * method : 기능 
 *  --------------------------------------------------------------------
 *  NoteBook 
*/

public class NoteBook {
	// 1. 필드 선언
	public String brand;
	public int price;
	public int serialNumber;

	// 2. 메소드
	public void printNoteBookInfo() { // 메소드 선언부, return type + method name(매개 변수)
		StringBuilder sb = new StringBuilder(); // 메소드 구현부
		sb.append("NotebootInfo :: " + brand + ", " + price + ", " + serialNumber + "\n");
		System.out.println(sb);
	}
}
