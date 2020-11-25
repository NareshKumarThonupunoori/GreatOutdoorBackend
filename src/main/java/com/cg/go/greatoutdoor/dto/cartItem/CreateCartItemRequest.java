package com.cg.go.greatoutdoor.dto.cartItem;

import java.util.Map;


public class CreateCartItemRequest {
	
	private Integer userId;
	private Map<Integer,Integer> products; // productIds,Quantity
	
	public CreateCartItemRequest() {
		
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Map<Integer, Integer> getProducts() {
		return products;
	}
	public void setProducts(Map<Integer, Integer> products) {
		this.products = products;
	}
	
	
}