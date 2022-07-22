package com.edu.compile.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
 * finally 블락은 무조건 수행
 * 예외가 발생하건 안하건....
 * 
 * finally블라기 수행되지 않는 유일한 경우
 * --> 안에서 또 다른 예외가 발생하면 안돌아간다.
 */
class FileReading2{
	public void readFile(String fileName) {
		// 파일안의 내용을 읽어들이는 로직을 작성..
		FileReader fr = null;
		try {
			fr = new FileReader(fileName);
			System.out.println("1. fileReader Creating....");
		} catch (FileNotFoundException e) {
			/*
			 * 1. e.printStackTrace(); // 심각한 문제점 보안 문제로 사용을 권장하지 않는다.
			 * 2. sysout(e.getMessage()); // 너무 설명이 빈약함 // 용도가 따로 있음
			 */
			System.out.println("파일을 찾을 수 없습니다." + e);
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				System.out.println("못함");
			}
		}
		System.out.println("2. file....end...");
	}
}
public class CompileExceptionTest2 {
	public static void main(String[] args) {
		FileReading2 fr = new FileReading2();
		String fileName = "C:\\bnk_swj\\util\\epp560_4250_64bit.exe";
		fr.readFile(fileName);
		System.out.println("3. 잘 읽어드렸습니다.");
	}
}
