package com.bank.oop.test;

import com.bank.oop.Greeting;

/*
 * 			OOP
 * 
 * 		Object Oriented Class	|	~~ Test
 * 
 * 		��ü�� �ǹ��ϴ� Ŭ����				��ü�� �ƴ�
 * 									���� Object Ŭ������ ���� ��ü�� ������ִ� ���� Ŭ����
 */
public class GreetingAppTest {
	public static void main(String[] args) {// main method..���� �޼ҵ�
		// ��ü ���� == �޸𸮿� Ŭ������ ������� �� �ø���. == ����� ����
		Greeting hello = new Greeting();
		/*
		 * ���� �ʵ� --> �� �Ҵ� �޼ҵ� --> �޼ҵ� ȣ��
		 */
		hello.who = "������";
		hello.greet = "������ �ð��Դϴ�~~~ ���� �����̾��.";
		hello.sayHello();
	}
}
