package com.edu.compile.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
// 예외처리 방법
// 1. 즉각적인 처리 try ~ cath
// 2. throws 호출한곳으로 던짐
class FileReading{
	public void readFile(String fileName) {
		// 파일안의 내용을 읽어들이는 로직을 작성..
		try {
			FileReader fr = new FileReader(fileName);
			System.out.println("1. fileReader Creating....");
		} catch (FileNotFoundException e) {
			/*
			 * 1. e.printStackTrace(); // 심각한 문제점 보안 문제로 사용을 권장하지 않는다.
			 * 2. sysout(e.getMessage()); // 너무 설명이 빈약함 // 용도가 따로 있음
			 */
			System.out.println("파일을 찾을 수 없습니다." + e);
		}
		System.out.println("2. file....end...");
	}
}
public class CompileExceptionTest1 {
	public static void main(String[] args) {
		FileReading fr = new FileReading();
		String fileName = "C:\\bnk_swj\\util\\epp560_4250_64bit.exe";
		fr.readFile(fileName);
		System.out.println("3. 잘 읽어드렸습니다.");
	}
}
