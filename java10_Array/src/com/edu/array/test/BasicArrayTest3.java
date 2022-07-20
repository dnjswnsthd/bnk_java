package com.edu.array.test;

/*
 * 배열의 특징
 * 1. Same DataType이 전제이다.
 * 2. 클래스타입이 제공되지 않는다.
 * 3. 배열은 resizing이 안된다. 새로 만들어줘야한다.
 */
public class BasicArrayTest3 {
	public static void main(String[] args) {
		int[] target = { 1, 2, 3, 4, 5, 6 };
		for(int i : target) System.out.print(i + " ");
		System.out.println("\n ========Resizing========" );
		target = new int [10];
		target[6] = 7; target[7] = 8; target[8] = 9; target[9] = 10;
		for(int i : target) System.out.print(i + " ");
	}
}
