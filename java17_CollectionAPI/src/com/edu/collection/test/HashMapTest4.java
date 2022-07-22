package com.edu.collection.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Map
 * 	|
 * HashMap (key-value)
 * 	|
 * Properties (String key - String Value)
 * 이후에 메타데이타로서 활용된다. 
 * 
 * Collection 계보를 잇는 객체가 아니기 때문에
 * 거기서 볼 수 없는 독특한 특징으로 객체를 저장한다.
 */
public class HashMapTest4 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("강호동", 90);
		map.put("이수근", 80);
		map.put("김영철", 85);
		map.put("서장훈", 95);
		map.put("김희철", 80);

		// 1. map에 담겨져 있는 모든 키값을 받아온다. Set
		Set<String> set = new HashSet<>();
		set = map.keySet();

		// 2. Set에 담겨진 key들을 출력...
		for(String s : set) System.out.print(map.get(s) + "\t");
		System.out.println();
		
		// 3. key에 연결된 사람들의 성적을 받아와서 총점을 출력
		int total = 0;
		for(String name : set) {
			total += map.get(name);
		}
		System.out.println(total + "점");
		// 4. map에 저장된 사람들의 평균점수를 출력
		System.out.println(total / map.size() + "점");
	}
}
