package com.edu.collection.test;

import java.util.Enumeration;
import java.util.Properties;

/*
 * VM관련 환경변수들을 다 출력하는 로직을 작성.
 */
public class PropertiesTest1 {
	public static void main(String[] args) {
		Properties pro = System.getProperties();
		Enumeration e = pro.propertyNames();
		while (e.hasMoreElements()) {
			String name = (String) e.nextElement();
			String value = pro.getProperty(name);
			System.out.println(name + "======================" + value);
		}
	}
}