package com.edu.capsul;

/*
 * Encapsulation 
 * ::
 * month는 1~12까지의 값만 받아들이도록 로직을 작성
 * day는 month에 따라서 받아들이는 값이 달라진다.
 * 1,3,5,7,8,10,12월 1~31
 * 4,6,9, 11월 1~30
 * 2월 1~28일 까지
 */
public class MyDate {
	private int month;
	private int day;

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		// 필드초기화 직전에 valid한 값이 할당되도록 제어문을 달아준다.
		if(month >= 1 && month <= 12) {
			// 필드 초기화
			this.month = month;
		}else {
			System.out.println("Invalid");
			System.exit(0);
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int month, int day) {
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if(day >= 1 && day <= 31)
				this.day = day;
			else {
				System.out.println("invaild");
				System.exit(0);
			}
		}else if(month == 4 || month == 6 || month == 9 || month == 11) {
			if(day >= 1 && day <= 30)
				this.day = day;
			else {
				System.out.println("invaild");
				System.exit(0);
			}
		}else if (month == 2) {
			if(day >= 1 && day <= 28)
				this.day = day;
			else {
				System.out.println("invaild");
				System.exit(0);
			}
		}
	}
}
