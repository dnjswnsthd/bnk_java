package com.edu.runtime.test;

/*
 * Catch는 여러번 가능하다.
 * 여러개의 catch 구문을 작성하더라도 단 하나의 catch구문만 실행된다.
 */

public class RuntimeExceptionTest2 {
	public static void main(String[] args) {
		String[] str = { "Hello", "No I mean it", "Nice to meet you" };
		int i = 0;
		while (i <= 3) {
			try {
				// 예외 발생 가능 코드
				System.out.println(str[i]);
			} catch (NullPointerException e) {
				System.out.println("Nice Catch~~~");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Nice chchchchach2");
			} catch (ArithmeticException e) { //분모가 0일때
				System.out.println("nice catch 3");
			}
			i++;
		}
		System.out.println("while loop end....");
	}
}