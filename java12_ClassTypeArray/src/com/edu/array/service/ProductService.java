package com.edu.array.service;

import com.edu.array.vo.Product;

/*
 * Product들을 핸들링하는 서비스 클래스...
 * 기능들로만 구성되어져 있다.
 * 
 * 1). 모든 상품들의 maker를 출력하는 기능
 * 2). 상품들의 총 금액을 리턴하는 기능
 * 3). 특정 금액 이상의 상품들을 리턴하는 기능
 * 4). 동일한 회사의 제품들만 리턴하는 기능
 * 5). 구입한 상품들의 평균가를 리턴하는 기능
 */
public class ProductService {
	// 1). 모든 상품들의 maker를 출력하는 기능
	public void printAllMaker(Product[] products) {
		System.out.println("===============1. 모든 상품들의 maker를 출력합니다.===============");
		for (Product pros : products) {
			System.out.println(pros.getMaker());
		}
	}

	// 2). 상품들의 총 금액을 리턴하는 기능
	public int getTotalPrice(Product[] products) {
		int total = 0;
		for (Product pros : products) {
			total += pros.getPrice() * pros.getQuantity();
		}
		return total;
	}
	
	/*
	 * Method Overloading
	 * ::
	 * 하는일은 같지만
	 * 처리하는 데이타를 달리할때 사용하는 기법
	 * 
	 * ::
	 * 1. 메소드 이름은 같아야한다.
	 * 2. 매개변수는 반드시 달라야한다(순서, 갯수, 타입)
	 * 3. 리턴타입은 상관없다.
	 * 
	 * ::
	 * public Member [ ] searchMember(String name)
	 * public Member [ ] searchMember(String address, String name)
	 * public Member [ ] searchMember(int age)
	 * 
	 * public Member [ ] searchMemberByName(String name)
	 * public Member [ ] searchMemberByAge(int age)
	 * 
	 * 상속이 없는 코드에서는 overloading을 적극적으로 쓸 필요가 있다.(일관성)
	 */
	 
	// 3). 특정 금액 이상의 상품들을 리턴하는 기능
	public Product[] getMorerice(Product[] products, int minPrice) {
		System.out.println("===============3. 특정 금액 이상의 상품들을 리턴합니다.===============");
		System.out.println("입력된" + minPrice + "원 이상의 금액의 상품은 : ");
		Product[] overPriceProducts = new Product[products.length];
		for (int i = 0; i < products.length; i++) {
			if (products[i].getPrice() >= minPrice) {
				overPriceProducts[i] = products[i];
			}
		}
		return overPriceProducts;
	}

	// 4). 동일한 회사의 제품들만 리턴하는 기능
	public Product[] getSameCompany(Product[] products, String company) {
		System.out.println("===============4. 특정 금액 이상의 상품들을 리턴합니다.===============");
		System.out.println("입력된" + company + "의 상품은: ");
		Product[] sameCompanyProduct = new Product[products.length];
		for (int i = 0; i < products.length; i++) {
			if (products[i].getCompany().equals(company)) {
				sameCompanyProduct[i] = products[i];
			}
		}
		return sameCompanyProduct;
	}

	// 5). 구입한 상품들의 평균가를 리턴하는 기능
	public int getAvgPrice(Product[] products) {
		System.out.println("===============5. 총 상품의 평균을 리턴합니다.===============");
		return getTotalPrice(products) / products.length;
	}
}
