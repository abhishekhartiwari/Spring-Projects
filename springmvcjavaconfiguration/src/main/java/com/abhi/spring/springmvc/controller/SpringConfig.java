package com.abhi.spring.springmvc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan("com.abhi.spring.springmvc.controller")
@Configuration
public class SpringConfig extends WebMvcConfigurerAdapter{

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver v = new InternalResourceViewResolver();
		v.setPrefix("/WEB-INF/views/");
		v.setSuffix(".jsp");
		return v;
	}
	
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

	configurer.enable();
	}
}
