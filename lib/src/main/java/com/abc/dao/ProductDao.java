package com.abc.dao;

import java.util.List;

import com.abc.entity.Product;

public interface ProductDao {
	public void saveProduct(Product product);
	
	public Product findProductById(int productId);
	
	public List<Product> findAllproduct();
	
	
}
