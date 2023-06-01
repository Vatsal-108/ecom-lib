package com.abc.service;

import java.util.List;

import com.abc.entity.Product;

public interface ProductService {

	public void addProduct(Product product);
	
	public Product getProductById(int productId);
	
	public List<Product> getAllProducts();
}
