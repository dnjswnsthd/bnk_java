package com.edu.array.test;
import com.edu.array.service.ProductService;
/*
 * Prouct + Service ====> ~~~Test2
 */
import com.edu.array.vo.Product;

public class ProductServiceTest2 {
	public static void main(String[] args) {
		Product[] products = { new Product("신라면", 12000, 5, "농심"), new Product("새우깡", 1000, 2, "농심"),
				new Product("옥시크린", 32000, 1, "CJ"), new Product("삼다수", 8000, 10, "제주"), };
		
		ProductService productService = new ProductService();
		
		// service라는 참조변수를 이용해서 구현하신 기능을 하나씩 호출합니다...
		productService.printAllMaker(products);
		
		System.out.println("===============2. 상품들의 총 금액을 리턴합니다.===============");
		System.out.println("상 품의 총 금액은 :" + productService.getTotalPrice(products) + "원 입니다.");
		
		
		Product [] overPriceProducts = productService.getMorerice(products, 10000);  
		for(int i = 0; i < overPriceProducts.length; i++) {
			if(overPriceProducts[i] != null) System.out.println(overPriceProducts[i].getDetails());
		}
		
		
		Product [] sameCompanyProduct = productService.getSameCompany(products, "농심");
		for(int i = 0; i < sameCompanyProduct.length; i++) {
			if(sameCompanyProduct[i] != null) System.out.println(sameCompanyProduct[i].getDetails());
		}
		
	
		System.out.println("평균 값은 " + productService.getAvgPrice(products) + "입니다.");
	}
}
