package com.edu.array.service;

import com.edu.array.vo.Customer;
import com.edu.array.vo.Product;

public class ProductOutletService {
	// 1. 특정 고객이 구입한 상품을 리턴..
	public Product[] getProducts(Customer cust) {
		return cust.getProducts();
	}

	// 2. 특정 고객이 구입한 상품의 maker들만 린턴..
	public String[] getAllProductMaker(Customer cust) {
		String[] temp = new String[cust.getProducts().length];
		for(int i = 0; i < cust.getProducts().length; i++) {
			temp[i] = cust.getProducts()[i].getMaker();
		}
		return temp;
	}

	// 3. 모든 고객들 중에서 특정한 고객을 검색하는 기능...search, find
	public Customer findCustomerBySsn(Customer[] custs, int ssn) {
		Customer customer = null;
		for(Customer cust : custs) {
			if(cust.getSsn() == ssn) {
				customer = cust;
			}
		}
		return customer;
	}

	// 4. 특정한 동네에 살고있는 고객들을 검색...
	public Customer[] findCustomerByAddress(Customer[] custs, String address) {
		Customer[] customer = new Customer[custs.length];
		int index = 0;
		for(Customer cust : custs) {
			if(cust.getAddress() == address) {
				customer[index++] = cust;
			}
		}
		return customer;
	}
	
	// 5. 특정 고객이 구입한 물건등 중에서 최고가에 해당하는 물건의 가격을 리턴...
	public int getMaxPriceProduct(Customer cust) {
		int maxPrice = 0;
		Product [] products = cust.getProducts();
		for(int i = 0; i < products.length; i++) {
			if(maxPrice < products[i].getPrice()) {
				maxPrice = products[i].getPrice();
			}
		}
		return maxPrice;
	}
	
	// 6. 특정 고객이 구입한 물건 중 특정 가격 이상이 되는 제품들을 리턴...
	public Product [] getMorePriceProducts(Customer cust, int price) {
		Product [] temp = new Product[cust.getProducts().length];
		Product [] products = cust.getProducts();
		for(int i = 0; i < products.length; i++) {
			if(products[i].getPrice() >= price) {
				temp[i] = products[i];
			}
		}
		return temp;
	}
	
	// 7. 모든 고객이 구입한 물건 중 특정 가격 이상이 되는 제품들을 리턴...
		public Product [] getMorePriceProducts(Customer [] custs, int price) {
			int len = 0;
			for(Customer c : custs) {
				len += c.getProducts().length;
			}
			Product [] temp = new Product[len];
			int index = 0;
			for(Customer c : custs) {
				for(Product p : c.getProducts()) {
					if(p.getPrice() >= price)
						temp[index++] = p;
				}
			}
			return temp;
		}
}
