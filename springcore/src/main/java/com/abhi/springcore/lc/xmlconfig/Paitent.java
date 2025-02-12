package com.abhi.springcore.lc.xmlconfig;

public class Paitent {

	private int id;

	Paitent(){
		System.out.println("Creating Paitent");
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Initializing Paitent");
		this.id = id;
	}

	private void init() {
		System.out.println("Init");
	}

	private void destroy() {
		System.out.println("destroy");
	}

}
