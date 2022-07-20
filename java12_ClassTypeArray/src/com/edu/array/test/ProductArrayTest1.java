package com.edu.array.test;

import com.edu.array.vo.Product;

public class ProductArrayTest1 {
	public static void main(String[] args) {
		Product[] products = { new Product("신라면", 12000, 5, "농심"), new Product("새우깡", 100, 2, "농심"),
				new Product("옥시크린", 32000, 1, "CJ"), new Product("삼다수", 8000, 10, "제주"), };
		
		System.out.println("==========================1. 상품 정보를 출력합니다.==============================");
		for(Product pro : products) {
			System.out.println(pro.getDetails());
		}
		System.out.println("==========================2. 상품의 maker를 출력합니다.==============================");
		for(Product pro : products) {
			System.out.println(pro.getMaker());
		}
		System.out.println("==========================3. 상품의 특정가격(1만원) 이상의 제품을 출력합니다.==============================");
		for(Product pro : products) {
			if(pro.getPrice() >= 10000) {
				System.out.println(pro.getDetails());
			}
		}
		System.out.println("==========================4. 지금까지 구매한 상품의 총가격을 출력합니다.==============================");
		int sum = 0;
		for(Product pro : products) {
			sum += pro.getPrice() * pro.getQuantity();
		}
		System.out.println("총 금액 : " + sum);
	}
}
