package com.edu.capsul.test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * month, day값을 Scaaner로 받는다.
 * 
 * 오늘은 0월 22일입니다.
 * 오늘은 7월 0일입니다.
 * 이렇게 출력되지 않도록 합니다.
 */
import com.edu.capsul.MyDate;

public class MyDateTest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int month, day = 0;
		MyDate md = new MyDate();
		System.out.println("월을 입력해주세요");
		month = Integer.parseInt(br.readLine());
		
		md.setMonth(month);
		
		System.out.println("일을 입력해주세요");
		day = Integer.parseInt(br.readLine());
		
		md.setDay(month,day);
		
		if(md.getMonth() != 0 && md.getDay() != 0)
			System.out.println("오늘은 " + md.getMonth() + "월 " + md.getDay() + "일 입니다.");
		else 
			System.out.println("잘못된 날짜가 입력되었습니다.");
	}
}
