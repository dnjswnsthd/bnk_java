package com.edu.loop.test;

/*
 * for, while
 * 
 * for(초기화; 조건식; 증감식){
 * 	// code block
 * }
 * ----------------------------------
 * while(조건식){
 * 	// code block
 * 	증감식
 * }
 */
public class BasicLoopTest1 {
	public static void main(String[] args) {
		System.out.println("========== for ==========");
		for (int i = 0; i < 10; i++) // 반복하는 횟수르 알수 있다...
			System.out.println("i : " + i);
		System.out.println("========== while ==========");
		int i = 10;
		while (i > 0) {
			System.out.println("i : " + i);
			i--;
		}
	}
}
