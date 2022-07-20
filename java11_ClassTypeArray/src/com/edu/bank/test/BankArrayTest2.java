package com.edu.bank.test;

import com.edu.bank.Account;
import com.edu.bank.Customer;

/*
 * Class Type Array의 생성과 선언
 */
public class BankArrayTest2 {
	public static void main(String[] args) {
		Account[] accounts = {new Account(10000, "부산은행"), new Account(20000, "국민은행"), new Account(30000, "신한은행")};
		Customer james = new Customer(111, "James");
		// 1. James가 3개의 통장을 개설... 부산, 국민, 신한
		james.setAccounts(accounts);
		
		// 2. James가 개설한 통장중에서 부산은행 통장을 받아온다.
		Account busanBk = null; 
		for(int i = 0 ; i < james.getAccounts().length; i++) {
			if(james.getAccounts()[i].getBankName().equals("부산은행")) {
				busanBk = james.getAccounts()[i];
			}
		}
		System.out.println("============ 부산은행 통장에 입금을 합니다. ===============");
		busanBk.deposit(900.0); // 1000원 미만이기 때문에 return;
		busanBk.deposit(30000.0);
		System.out.println("============ 부산은행 통장에 출금을 합니다. ===============");
		busanBk.withdraw(50000.0); // 잔액보다 금액이 커서 return;
		busanBk.withdraw(30000.0);
		System.out.println("============ 부산은행 잔액을 확인 합니다. ===============");
		System.out.println("잔액 확인 : " + busanBk.getBalance());
	}
}
