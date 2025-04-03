package com.abhi.spring;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.abhi.spring.entities.Product;
import com.abhi.spring.repository.ProductRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {
	
	@Autowired
	ApplicationContext context;

	@Test
	void saveProduct() {
		
		//create/add
		ProductRepository bean = context.getBean(ProductRepository.class);
		Product p = new Product();
		p.setId(11);
		p.setName("HDD");
		p.setDescription("Solid DD");
		p.setPrice(70000);
		bean.save(p);
		
		//get one
		Optional<Product> byId = bean.findById(11);
		System.out.println(byId);
		
		//update
		Optional<Product> byId1 = bean.findById(11);
		if(byId1.isPresent()) {
			Product product = byId1.get();
			product.setPrice(14000);
			
			bean.save(product);
			bean.findAll().forEach(pp-> {System.out.println(pp.getPrice());});
		}
		
		//Custom Finder methods
		
		System.out.println("-----------Name--------------");
		System.out.println(bean.findByName("Modem"));
		System.out.println("------------------------------");
		
		System.out.println("-----------Price--------------");
		System.out.println(bean.findByPrice(200.00));
		System.out.println("------------------------------");
		
		System.out.println("-----------Name And Price--------------");
		System.out.println(bean.findByNameAndPrice("Mobile", 200.00));
		
	}

}
