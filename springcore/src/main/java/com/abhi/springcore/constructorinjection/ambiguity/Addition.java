package com.abhi.springcore.constructorinjection.ambiguity;

public class Addition {

	public Addition(Double a, Double b) {
		System.out.println("Inside double addition");
	}
	
	public Addition(int a, int b) {
		System.out.println("Inside init addition");
	}
	
	public Addition(String a, String b) {
		System.out.println("Inside String addition");
	}
	
	public Addition(int a, double b) {
		
		
		System.out.println("int + double");
		System.out.println("int "+a) ;
		System.out.println("double " + b);
	}

}
