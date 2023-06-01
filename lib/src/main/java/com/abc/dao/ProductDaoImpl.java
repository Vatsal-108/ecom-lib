package com.abc.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.abc.entity.Product;

public class ProductDaoImpl implements ProductDao {

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void saveProduct(Product product) {
		// TODO Auto-generated method stub
		entityManager.persist(product);
	}

	@Override
	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		Product product=entityManager.find(Product.class, productId);
		return product;
	}

	@Override
	public List<Product> findAllproduct() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
