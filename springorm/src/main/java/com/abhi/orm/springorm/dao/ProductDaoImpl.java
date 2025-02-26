package com.abhi.orm.springorm.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.abhi.orm.springorm.entities.Product;

@Component("product")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(Product product) {
		Serializable save = hibernateTemplate.save(product);
		return (int) save;
	}

	@Override
	@Transactional
	public void update(Product product) {

		hibernateTemplate.update(product);
	}

	@Override
	@Transactional
	public void delete(Product p) {

		hibernateTemplate.delete(p);
	}

	@Override
	public Product find(int id) {

		Product p = hibernateTemplate.get(Product.class, id);
		return p;
	}

	@Override
	public List<Product> findAll() {

		List<Product> p = hibernateTemplate.loadAll(Product.class);
		return p;
	}

}
