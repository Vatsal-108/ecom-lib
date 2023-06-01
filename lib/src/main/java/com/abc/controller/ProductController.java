package com.abc.controller;

import com.abc.entity.Product;
import com.abc.service.ProductService;


public class ProductController {

	private ProductService productService;
	
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	public void createProduct(Product product) {
		productService.addProduct(product);
		System.out.println("Product Saved");
	}
	public void fetchProductById(int productId) {
		Product product=productService.getProductById(productId);
		if(product!=null) {
			System.out.println("Product Id: "+product.getProductId());
			System.out.println("Product Name: "+product.getProductName());
			System.out.println("Product Price: "+product.getProductPrice());
		}
		else {
			System.out.println("Product doesnot exist");
		}
	}
	public void fetchAllProducts() {
		
	}
}
