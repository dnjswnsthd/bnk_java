package com.edu.loop.test;
/*
 * if 문과 함께 사용되는 반복문의 키워드
 * if + break --> 결과적으로 해당조건을 만족하면 반복문 전체를 빠져나간다.
 * if + continue --> 결과적으로 해당조건을 만족하면 그 부분은 건너뛰고 반복문을 계속 진행한다.
 */
public class BasicLoopTest2 {
	public static void main(String[] args) {
		int total = 0;
		
		/*for(int member = 1; member <= 10; member++) {
			if(total >= 30) break;
			total += member;
		}
		System.out.println(total);*/
		
		// 홀수의 합
		for(int num = 1; num <= 10; num++) {
			if(num % 2 == 0)continue;
			total += num;
		}
		System.out.println(total);
	}
}