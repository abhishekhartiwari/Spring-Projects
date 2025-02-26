package com.abhi.orm.springorm.dao;

import java.util.List;

import com.abhi.orm.springorm.entities.Product;

public interface ProductDao {

	
	int create(Product product);
	
	void update(Product product);
	
	void delete(Product p);
		
	Product find(int id);
	
	List<Product> findAll();
}
