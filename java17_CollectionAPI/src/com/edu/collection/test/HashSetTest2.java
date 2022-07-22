package com.edu.collection.test;

import java.util.HashSet;
import java.util.Set;

/*
 * Set
 * 	|
 * HashSet
 * 
 * Unique한 것들만 저장함
 * 순서는 없다
 */
public class HashSetTest2 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("송원준");
		set.add("구자경");
		set.add("강호동");
		set.add("송원준");
		set.add("김일이");
		// Collection은 자체적으로 toString()를 오버라이딩 해놓았다... 멤버 출력
		System.out.println(set + " " + set.size());
		System.out.println("이수근이 포함되었냐? " + set.contains("이수근"));
		System.out.println("삭제 진행 " + set.remove("강호동") + "!!");// set은 remove의 return type이 boolean이다 삭제되면 true, 안되면 false
		System.out.println(set);
		
		set.clear();
		System.out.println("Set안이 다 비워졌나요?" + set.isEmpty());
	}
}