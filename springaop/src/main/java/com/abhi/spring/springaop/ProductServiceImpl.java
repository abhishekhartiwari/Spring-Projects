package com.abhi.spring.springaop;

public class ProductServiceImpl implements ProductService {

	@Override
	public int multiply(int n1, int n2) {

		return n1*n2;
	}

}
