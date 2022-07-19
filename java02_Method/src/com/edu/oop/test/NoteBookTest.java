package com.edu.oop.test;

import com.edu.oop.NoteBook;
/*
 * NoteBookTest의 문제
 * :: 
 * 필드가 많아질수록 코드라인이 늘어난다.
 * 더무기 생성되는 개체가 커질수록 코드량은 기하급수적으로 증가한다.
 * 
 * 필드에 값을 직접 할당하면 발생하는 문제점
 * 
 * ---------------------------------------------
 * NoteBookTest의 해결책
 * ::
 * 필드 초기화 해주는 기능을 만든다.
 */
public class NoteBookTest {
	public static void main(String[] args) {
		/*
		 * 1. 객체 생성
		 * 2. 값할당 | 메소드 호출
		 */
		NoteBook nb = new NoteBook();
		nb.brand = "samsung";// 필드 초기화(처음 값이 아니더라도 넣어 주는 행위를 뜻함)
		nb.price = 1000000;
		nb.serialNumber = 1000;
		
		nb.printNoteBookInfo();
		System.out.println("Brand : " + nb.getBrand());
	}
}
