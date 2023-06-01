package com.abc.main;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.controller.ProductController;
import com.abc.entity.Product;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product=new Product();
		product.setProductId(11);
		product.setProductName("Iphone14");
		product.setProductPrice(150000);
		
		ApplicationContext context=new ClassPathXmlApplicationContext("appcontext.xml");
		ProductController pController=(ProductController) context.getBean("pController");
		//pController.createProduct(product);
		
		int productId=11;
		pController.fetchProductById(productId);
	}

}
