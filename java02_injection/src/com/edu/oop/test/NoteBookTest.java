package com.edu.oop.test;

import com.edu.oop.NoteBook;

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
