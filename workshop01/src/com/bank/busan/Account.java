package com.bank.busan;

public class Account {
	private int accNumber;
	private String custName;
	private double balance;
	private String bankName;

	public Account(int accNumber, String custName, double balance, String bankName) {
		this.accNumber = accNumber;
		this.custName = custName;
		this.balance = balance;
		this.bankName = bankName;
	}

	public double getBalance() {
		return balance;
	}

	// 출금
	public void withdraw(double amt) {
		balance -= amt;
	}

	// 입금
	public void deposit(double amt) {
		balance += amt;
	}

	public String getAccountInfo() {
		return "고객님의 계좌 번호는 " +  accNumber + ", 계좌 소유자는 " + custName + ", 잔액은 " + balance + ", 은행명은 " + bankName + "입니다.";
	}

	public String getBankName() {
		return bankName;
	}

}
