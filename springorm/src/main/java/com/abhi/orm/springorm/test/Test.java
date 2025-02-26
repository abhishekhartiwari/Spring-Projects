package com.abhi.orm.springorm.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhi.orm.springorm.dao.ProductDao;
import com.abhi.orm.springorm.entities.Product;

public class Test {

	public static void main(String[] args) {

		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhi/orm/springorm/test/Config.xml");
		ProductDao dao =  ctx.getBean("product", ProductDao.class);
		
		Product product = new Product();
		
		product.setId(3);
		product.setName("Modem");
		product.setDesc("Wireless modem");
		product.setPrice(1200);
		
		//dao.create(product);
		//dao.update(product);
		//dao.delete(product);
		
		//Product p = dao.find(1);
		
		List<Product> p = dao.findAll();
		p.forEach(System.out::println);
	}

}
