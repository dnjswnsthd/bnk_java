package com.edu.collection.test;

import java.util.ArrayList;
/*
 * List
 * 	|
 * ArrayList
 * 순서를 가지면서 중복은 허용
 */
public class ArrayListTest3 {
	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList<>();
		al.add("강호동");
		al.add("이수근");
		al.add("서장훈");
		al.add("김영철");
		al.add("이수근");
		System.out.println(al);
		// 3번째 사람을 삭제... 누가 삭제되었는지 출력
		System.out.println(al.remove(2) + "님 삭제됨");
		
		// 가장 첫번째에 아이유를 추가
		al.add(0, "아이유");
		System.out.println(al);
		
		// list에 저장된 사람들 중에서 서장훈을 찾아서 
		for(String s : al) {
			if(s.equals("김영철"))
				System.out.println(s);
		}
		for(int i = 0; i < al.size(); i++) {
			if(al.get(i).equals("김영철")) System.out.println(al.get(i));
		}
	}
}
