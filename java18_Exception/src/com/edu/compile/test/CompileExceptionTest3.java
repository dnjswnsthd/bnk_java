package com.edu.compile.test;

import java.io.FileReader;
import java.io.IOException;

/*
 * finally 블락은 무조건 수행
 * 예외가 발생하건 안하건....
 * 
 * finally블라기 수행되지 않는 유일한 경우
 * --> 안에서 또 다른 예외가 발생하면 안돌아간다.
 */
class FileReading3 {
	public void readFile(String fileName) throws IOException {
		// 파일안의 내용을 읽어들이는 로직을 작성..
		FileReader fr = null;
		try {
			fr = new FileReader(fileName);
			System.out.println("1. fileReader Creating....");
		}finally {
			fr.close();
		}
	}
}

public class CompileExceptionTest3 {
	public static void main(String[] args) {
		FileReading3 fr = new FileReading3();
		String fileName = "C:\\bnk_swj\\util\\epp560_4250_64bit.exe";
		try {
			fr.readFile(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("3. 잘 읽어드렸습니다.");
	}
}

