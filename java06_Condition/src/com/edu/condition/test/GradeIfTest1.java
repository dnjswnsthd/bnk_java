package com.edu.condition.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 성적을 제어하는 프로그램을 작성..
// Field 선언은 클래스 바로 아래 / 메소드 블락 바깥쪽
public class GradeIfTest1 {
	public static void main(String[] args) {
		int score = 90;
		String grade = ""; 
		if(100 >= score && score >= 95) {
			grade = "A+";
		}else if(score >= 90) {
			grade = "A";
		}else if(score >= 85) {
			grade = "B+";
		}else if(score >= 80) {
			grade = "B";
		}else if(score >= 75) {
			grade = "C+";
		}else if(score >= 70) {
			grade = "C";
		}else if(score >= 65) {
			grade = "D+";
		}else if(score >= 60) {
			grade = "D";
		}else if(score >= 0){
			grade = "F";
		}else {
			grade = "잘못된 점수입니다.";
		}
		System.out.println("해당 학생의 점수는 " + score + "이며  등급은 " + grade + "입니다.");
	}
}
