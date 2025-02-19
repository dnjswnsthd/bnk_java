package com.edu.array.test;

/*
 * Array
 * ::
 * Same DataType을 가지는 서로 다른 값들을 하나로 묶어서 처리하는 기법
 * 배열은 객체다
 */
public class BasicArrayTest1 {
	public static void main(String[] args) {
		// 1. 배열 선언
		int[] arr;
		// 2. 배열 생성...사이즈 명시
		arr = new int[3];
		
		for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
		System.out.println();
		
		//3. 초기화
		arr[0] = 11; arr[1] = 22; arr[2] = 33;
		System.out.println("=====================");
		for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
	}
}
