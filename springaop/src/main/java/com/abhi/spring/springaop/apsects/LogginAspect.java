package com.abhi.spring.springaop.apsects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {
	
	@Before("execution(* com.abhi.spring.springaop.ProductServiceImpl.multiply(..))")  //this value is the point cut
	public void logBefore(JoinPoint jp) {  //this method is called advice
		System.out.println("Before calling method");
	}

	@After("execution(* com.abhi.spring.springaop.ProductServiceImpl.multiply(..))")
	public void logAfter(JoinPoint jp) {
		System.out.println("After the method exe");
	}
}
