package com.edu.oop2.test;

import com.edu.oop2.NoteBook;
import com.edu.oop2.Programmer;

public class ProgrammerTest {
	public static void main(String[] args) {
		/*
		 * 1. 객체 생성
		 * 2. 메소드 호출
		 * ==============================
		 * 염미정이라는 개발자를 생성
		 * 정보를 입력하세요 이름, 주요 기술, 주소, 급여
		 * 염미정이 노트북을 구매(setter)
		 * 염미정이 구매한 노트북을 받아서 노트북의 정보를 출력
		 * 최종적으로 염미정의 노트북의 브랜드를 출력.
		 */
		Programmer programmer = new Programmer();
		NoteBook noteBook = new NoteBook();
		
		programmer.setProgrammerInfo("염미정", "Backend", 70000000, "부산시 금정구");
		noteBook.setNotebookInfo("LG", 12000000, 1234);
		programmer.buyNoteBook(noteBook); // 미정이가 삼성 노트북을 구매했다.
		
		System.out.println("===============NoteBook Infomation============");
		System.out.println(noteBook.getNoteBookInfo());
		System.out.println("===============NoteBook Brand============");
		System.out.println(programmer.getNoteBook().getBrand());
	}
}
