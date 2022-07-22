package com.edu.user.test;

import java.util.Scanner;

class UnderAgeException extends Exception {
	UnderAgeException() {
		// super(); 무조건 들어가있다. 상속관계에서
		this("This is UnderAgeException....");
	}

	UnderAgeException(String message) {
		super(message);
	}
}

class AdultMovieService { // 성인 영화 관람 서비스...
	public void entrance(int age) throws UnderAgeException {
		if (age >= 19)
			System.out.println("Ticketing OK...Enter!!");
//		else throw new UnderAgeException();
		else
			throw new UnderAgeException("미성년자 입밴이요");
	}
}

public class UserExceptionTest {
	public static void main(String[] args) {
		AdultMovieService service = new AdultMovieService();
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try {
			service.entrance(age);
		} catch (UnderAgeException e) {
			System.out.println(e.getMessage());
//			System.out.println("응애");
		} finally {
			System.out.println("오후 10시가 되어서 극장문을 닫습니다.");
		}
		System.out.println("Exit....");
	}
}
