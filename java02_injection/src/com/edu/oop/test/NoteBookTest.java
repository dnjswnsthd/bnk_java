package com.edu.oop.test;

import com.edu.oop.NoteBook;

public class NoteBookTest {
	public static void main(String[] args) {
		/*
		 * 1. 객체 생성
		 * 2. 값할당 | 메소드 호출
		 */
		NoteBook nb = new NoteBook();
		nb.brand = "samsung";
		nb.price = 1000000;
		nb.serialNumber = 1000;
		
		nb.printNoteBookInfo();
	}
}
