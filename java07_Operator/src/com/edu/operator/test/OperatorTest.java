package com.edu.operator.test;
/*
 * 			선언된 위치			기본값 유무				메모리			  별칭				
 * 
 * filed 	메소드 바깥			   있다.				heap		멤버 변수
 * 
 * local	메소드 블락 안		   없다.(사용전 반드시 초기화)		stack	지역, Temporary,
 * 														Automatically v
 */
public class OperatorTest {
	public static void main(String[] args) {
		// Local 
		int i = 5;
		int j = 3;
		
		System.out.println(i == j);
		System.out.println(i != j);
		System.out.println("===================");
		System.out.println("연산자 : " + i % j);
		System.out.println("연산자 : " + i / j);
		System.out.println("===================");
		
		int k = 10;
		System.out.println(k++); // 10
		System.out.println(k);
		System.out.println(++k); // 11
	}
}
