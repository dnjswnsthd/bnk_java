package com.edu.oop;
/*
 * ���� �ٽ� �̽�
 * object Class	  			| 		~ Test (Test Ŭ����, ���� Ŭ����)
 * main() �� ���� ---> �������� ���			main() �� �ִ� ---> ������ ���
 * 									1. ��ü ���� == Ŭ������ ����� �޸𸮿� �ø���.
 * 									2. ���� 
 * 										�ʵ� -> �� �Ҵ�
 * 										�޼ҵ� -> ȣ��
 * �������
 * filed(��� ����) : ���� ����Ǵ� ����
 * method : ��� 
 *  --------------------------------------------------------------------
 *  NoteBook 
*/

public class NoteBook {
	// 1. �ʵ� ����
	public String brand;
	public int price;
	public int serialNumber;
	
	// 2. �޼ҵ�
	public void printNoteBookInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("NotebootInfo :: " + brand + ", " + price + ", " + serialNumber + "\n");
		System.out.println(sb);
	}
}
