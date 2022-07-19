package com.edu.oop;
/*
 * Object Class
 * 필드 선언;
 * void setXxx(o, o){
 * 	필드 초기화
 * }
 * return type getXxx(){return}
 */

public class NoteBook {
	// 1. 필드 선언
	public String brand;
	public int price;
	public int serialNumber;

	// 2. 메소드
	public String getNoteBookInfo() { // 메소드 선언부, return type + method name(매개 변수)
		// 메소드 구현부
		// String Data + NoN-String  ==> String 화
		return "NotebookInfo :: " + brand + ", " + price + ", " + serialNumber;		
	}

	// 3. 메소드 추가
	// 노트북의 브랜드를 리넡하는 기능을 추가
	public String getBrand() {
		return brand; // 메소드를 호출한 지점으로 값이 리턴된다.. back된다.
	}

	// 필드 초기화 기능을 추가
	public void setNotebookInfo(String brand, int price, int serialNumber) { // 로컬 변수
		// 필드에 값을 주입 반환값이 필요없다.매개 변수는 필요하다.
		// 필드 이름과 로컬 변수의 이름이 같을 때 필드 앞에 this를 붙인다.
		this.brand = brand;
		this.price = price;
		this.serialNumber = serialNumber;
	}
}