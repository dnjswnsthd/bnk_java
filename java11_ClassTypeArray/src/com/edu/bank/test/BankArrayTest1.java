package com.edu.bank.test;

import com.edu.bank.Account;

/*
 * Class Type Array의 생성과 선언
 */
public class BankArrayTest1 {
	public static void main(String[] args) {
		Account[] accounts = new Account[3];
		
		for(Account acc : accounts) {
			System.out.println(acc);
		}
		System.out.println("===============================");
		accounts[0] = new Account(10000, "부산은행");
		accounts[1] = new Account(20000, "국민은행");
		accounts[2] = new Account(30000, "신한은행");
		
		for(Account acc : accounts) {
			System.out.println(acc);
		}
		
		System.out.println("===============배열안의 정보를 출력 ================");
		for(Account acc : accounts) {
			System.out.println(acc.getDetails());
		}
	}
}
