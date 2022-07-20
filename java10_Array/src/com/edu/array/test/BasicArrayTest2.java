package com.edu.array.test;

public class BasicArrayTest2 {
	public static void main(String[] args) {
		// 1. 배열 선언 + 생성
/*		int[] arr = new int[3];;

		for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
		System.out.println();
		
		//3. 초기화
		arr[0] = 11; arr[1] = 22; arr[2] = 33;
		System.out.println("=====================");
		for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");*/
		
		// 배열의 선언 + 생성 + 초기화를 한번에
		int [] arr1 = {11, 22, 33};
		int [] arr2 = {100, 200, 300};
		/*for(int i = 0; i < arr1.length; i++) System.out.print(arr1[i] + " ");*/
		// advanced for 문..."뭐가 어디서 돌아가는가?"
		for(int i : arr1) System.out.println(i);
		for(int i : arr2) System.out.println(i);
		arr1 = arr2;
		
	}
}
