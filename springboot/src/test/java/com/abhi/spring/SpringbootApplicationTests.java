package com.abhi.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.abhi.spring.service.MyService;

@SpringBootTest
class SpringbootApplicationTests {
	
	@Autowired
	ApplicationContext context;

	@Test
	void testService() {
		
		MyService bean = context.getBean(MyService.class);
		bean.save();
	}

}
