package com.edu.condition.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 제어문의 { 안의 코드블락이 한줄일때는 { 생략 가능
 */
public class GradeIfTest3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("점수를 입력해주세요.");
		int score = Integer.parseInt(br.readLine());
		String grade = ""; 
		if(100 >= score && score >= 95) 
			grade = "A+";
		else if(95 >= score &&score >= 90) 
			grade = "A";
		else if(90 >= score &&score >= 85) 
			grade = "B+";
		else if(85 >= score &&score >= 80) 
			grade = "B";
		else if(80 >= score &&score >= 75) 
			grade = "C+";
		else if(75 >= score &&score >= 70) 
			grade = "C";
		else if(70 >= score &&score >= 65) 
			grade = "D+";
		else if(65 >= score &&score >= 60) 
			grade = "D";
		else if(60 >= score &&score >= 0)
			grade = "F";
		else 
			grade = "잘못된 점수";
		
		System.out.println("해당 학생의 점수는 " + score + "이며  등급은 " + grade + "입니다.");
	}
}
