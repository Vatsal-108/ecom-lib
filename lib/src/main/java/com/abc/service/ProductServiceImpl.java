package com.abc.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.abc.dao.ProductDao;
import com.abc.entity.Product;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	@Transactional
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.saveProduct(product);
		
	}

	@Override
	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		Product product=productDao.findProductById(productId);
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
