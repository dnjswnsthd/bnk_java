package com.bank.busan.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.bank.busan.Account;
import com.bank.busan.Customer;

public class BankAppTest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int accNumber = 0;
		String CustName = "";
		double balance = 0.0;
		String bankName = "";
		boolean exit = false;
		// 첫 번째 계좌 입력
		System.out.println("계좌번호를 입력해주세요");
		accNumber = Integer.parseInt(br.readLine());
		System.out.println("성함을 입력해주세요");
		CustName = br.readLine();
		System.out.println("잔액을 입력해주세요");
		balance = Double.parseDouble(br.readLine());
		System.out.println("은행 명을 입력세요");
		bankName = br.readLine();
		System.out.println();
		// 두 번째 계좌 입력
		Account acc1 = new Account(accNumber, CustName, balance, bankName);
		System.out.println("계좌번호를 입력해주세요");
		accNumber = Integer.parseInt(br.readLine());
		System.out.println("성함을 입력해주세요");
		CustName = br.readLine();
		System.out.println("잔액을 입력해주세요");
		balance = Double.parseDouble(br.readLine());
		System.out.println("은행 명을 입력세요");
		bankName = br.readLine();
		Account acc2 = new Account(accNumber, CustName, balance, bankName);
		Customer cust1 = new Customer("미정", acc1, "부산시");
		Customer cust2 = new Customer("자경", acc2, "부산시");
		System.out.println("미정 고객님 이시라면 1번 자경 고객님이 시라면 2번을 눌러주세요");
		int num = Integer.parseInt(br.readLine());
		if (num == 1) {
			while (true) {
				System.out.println("======================");
				System.out.println("미정님 부산은행 계좌 서비스에 오신 것을 환영합니다.");
				System.out.println("원하시는 서비스를 선택해주세요");
				System.out.println("1. 계좌 정보 조회");
				System.out.println("2. 입금");
				System.out.println("3. 출금");
				System.out.println("4. 종료");
				int select = Integer.parseInt(br.readLine());
				if (select == 1) {
					System.out.println(cust1.getAccount().getAccountInfo());
					System.out.println("감사합니다.");
				} else if (select == 2) {
					System.out.println();
					System.out.println("입금하실 금액을 1000원 이상 입력해주세요");
					double amt = Double.parseDouble(br.readLine());
					System.out.println();
					if (amt < 1000) {
						System.out.println("1000원 이상의 금액만 입금하실 수 있습니다. 다음에 다시 이용해주세요.");
					} else {
						cust1.getAccount().deposit(amt);
						System.out.println("고객님의 입금 후 잔액은 " + cust1.getAccount().getBalance() + "입니다.");
					}
				} else if (select == 3) {
					System.out.println("출금하실 금액을 잔액 이하로 입력해주세요");
					double amt = Double.parseDouble(br.readLine());
					if (amt > cust1.getAccount().getBalance()) {
						System.out.println("잔액 부족입니다. 다음에 다시 이용해주세요.");
					} else {
						cust1.getAccount().withdraw(amt);
						System.out.println("고객님의 출금 후 잔액은 " + cust1.getAccount().getBalance() + "입니다.");
					}
				} else if (select == 4) {
					System.out.println("다음에 뵙겠습니다. 감사합니다.");
					break;
				} else {
					System.out.println("잘못된 입력값입니다. 다시 입력해주세요.");
				}
			}
		} else if (num == 2) {
			while (true) {
				System.out.println("======================");
				System.out.println("자경님 부산은행 계좌 서비스에 오신 것을 환영합니다.");
				System.out.println("원하시는 서비스를 선택해주세요");
				System.out.println("1. 계좌 정보 조회");
				System.out.println("2. 입금");
				System.out.println("3. 출금");
				System.out.println("4. 종료");
				int select = Integer.parseInt(br.readLine());
				if (select == 1) {
					System.out.println(cust2.getAccount().getAccountInfo());
					System.out.println("감사합니다.");
				} else if (select == 2) {
					System.out.println("입금하실 금액을 1000원 이상 입력해주세요");
					double amt = Double.parseDouble(br.readLine());
					if (amt < 1000) {
						System.out.println("1000원 이상의 금액만 입금하실 수 있습니다. 다음에 다시 이용해주세요.");
					} else {
						cust2.getAccount().deposit(amt);
						System.out.println("고객님의 입금 후 잔액은 " + cust2.getAccount().getBalance() + "입니다.");
					}
				} else if (select == 3) {
					System.out.println("출금하실 금액을 잔액 이하로 입력해주세요");
					double amt = Double.parseDouble(br.readLine());
					if (amt > cust2.getAccount().getBalance()) {
						System.out.println("잔액 부족입니다. 다음에 다시 이용해주세요.");
					} else {
						cust1.getAccount().withdraw(amt);
						System.out.println("고객님의 출금 후 잔액은 " + cust2.getAccount().getBalance() + "입니다.");
					}
				} else if (select == 4) {
					System.out.println("다음에 뵙겠습니다. 감사합니다.");
					break;
				} else {
					System.out.println("잘못된 입력값입니다. 다시 입력해주세요.");
				}
			}
		}
	}
}
