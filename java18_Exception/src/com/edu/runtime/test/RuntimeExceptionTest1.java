package com.edu.runtime.test;

// 에외 ----------> 객체
public class RuntimeExceptionTest1 {
	public static void main(String[] args) {
		String[] str = { "Hello", "No I mean it", "Nice to meet you" };
		int i = 0;
		while (i <= 3) {
			try {
				// 예외 발생 가능 코드
				System.out.println(str[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Nice Catch~~~");
			} 
			i++;
		}
		System.out.println("while loop end....");
	}
}
