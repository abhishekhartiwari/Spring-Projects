package com.abhi.spring.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.spring.entities.Product;
import com.abhi.spring.repository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductRepository repo;
	
	@GetMapping
	public Iterable<Product> getProducts(){
		return repo.findAll();
	}
	
	@PostMapping
	public Product create(@RequestBody Product product) {
		return repo.save(product);
	}
	
	@PutMapping
	public Product update(@RequestBody Product product) {
		return repo.save(product);
	}
	
	@GetMapping("/{id}")
	public Optional<Product> getProduct(@PathVariable("id") int id) {
		return repo.findById(id);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable int id) {
		repo.deleteById(id);
	}
	
}
