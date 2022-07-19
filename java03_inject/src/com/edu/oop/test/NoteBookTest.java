package com.edu.oop.test;

import com.edu.oop.NoteBook;

public class NoteBookTest {
	public static void main(String[] args) {
		/*
		 * 1. 객체 생성
		 * 2. 값할당 | 메소드 호출
		 */
		NoteBook nb = new NoteBook();
		
		nb.setNotebookInfo("samsung", 10000000, 1000);
		System.out.println(nb.getNoteBookInfo());
		System.out.println("Brand : " + nb.getBrand());
		
		nb.setNotebookInfo("lg", 20000000, 2000);
		System.out.println(nb.getNoteBookInfo());
		System.out.println("Brand : " + nb.getBrand());
	}
}
 