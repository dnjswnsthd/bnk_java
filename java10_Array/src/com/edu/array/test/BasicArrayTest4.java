package com.edu.array.test;

/*
 * 배열의 특징
 * 1. Same DataType이 전제이다.
 * 2. 클래스타입이 제공되지 않는다.
 * 3. 배열은 resizing이 안된다. 새로 만들어줘야한다.
 * 4. 사이즈가 다른 배열의 내용을 copy해 올수는 있다.
 *    이때 System.arraycopy() 를 사용한다
 */
public class BasicArrayTest4 {
	public static void main(String[] args) {
		int[] target = { 1, 2, 3, 4, 5, 6 };
		int[] source = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		for(int i : target) System.out.print(i + " ");
		System.out.println();
		System.arraycopy(source, 2, target,0, 6);
		for(int i : target) System.out.print(i + " ");
	}
}
