package com.edu.cons.test;

import com.edu.cons.Shirt;

public class ShirtTest {
	public static void main(String[] args) {
		Shirt t1 = new Shirt("Jara", false, 'L');
		System.out.println(t1.getBrand() + " " + t1.isLongSleeved() + " " + t1.getSize());
	}
}