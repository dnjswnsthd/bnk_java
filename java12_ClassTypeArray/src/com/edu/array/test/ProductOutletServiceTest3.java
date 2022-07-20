package com.edu.array.test;

import java.util.Map;

import com.edu.array.service.ProductOutletService;
import com.edu.array.vo.Customer;
import com.edu.array.vo.Product;

public class ProductOutletServiceTest3 {
	public static void main(String[] args) {
		Product[] pros1 = { new Product("신라면", 12000, 5, "농심"), new Product("새우깡", 1000, 2, "농심"),
				new Product("옥시크린", 32000, 1, "CJ"), new Product("삼다수", 8000, 10, "제주") };
		Product[] pros2 = { new Product("안성탕면", 22000, 5, "농심"), new Product("칭따오", 500000, 50, "따오"),
				new Product("Terra", 22000, 3, "부산은행") };
		Customer[] custs = { new Customer(111, "구자경", "역삼동"), new Customer(222, "염미정", "역삼동") };
		
		// 각각의 고객과 상품들을 Hasing..
		custs[0].buyProducts(pros2);
		custs[1].buyProducts(pros1);
		
		ProductOutletService service = new ProductOutletService();
		//////// 아래에서는 서비스의 기능을 하나씩 호출합니다. ////////
		
		Product [] products = service.getProducts(custs[0]);
		for(Product pro : products) {
			System.out.println(pro.getDetails());
		}
		
		String [] pros = service.getAllProductMaker(custs[0]);
		for(int i = 0; i < pros.length; i++) {
			System.out.println(pros[i]);
		}
		Customer cust = service.findCustomerBySsn(custs, 111);
		System.out.println(cust.getName() + " " + cust.getAddress());
		
		Customer [] custss = service.findCustomerByAddress(custs, "역삼동");
		for(int i = 0; i < custss.length; i++) {
			if(custss != null) {
				System.out.println(cust.getName() + " " + cust.getAddress());
			}
		}
		
		int max = service.getMaxPriceProduct(custs[0]);
		System.out.println(max);
		
		Product [] pro = service.getMorePriceProducts(custs[0], 23000);
		for(int i = 0; i < pro.length; i++) {
			if(pro[i] != null)
				System.out.println(pro[i].getDetails());
		}

		System.out.println("============");
		Product [] proAll = service.getMorePriceProducts(custss, 10000);
		for(int i = 0; i < proAll.length; i++) {
			if(proAll[i] != null)
				System.out.println(proAll[i].getDetails());
		}
	}
}
