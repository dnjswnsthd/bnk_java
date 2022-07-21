package com.edu.condition.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GradeIfTest4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("점수를 입력해주세요.");
		int score = Integer.parseInt(br.readLine());
		String grade = ""; 
		switch(score){
			case 90: System.out.println("A"); break;
			case 80: System.out.println("B"); 
			case 70: System.out.println("C"); 
			case 60: System.out.println("D"); 
			default : System.out.println("f");
		}
		
	}
}
