package com.sac.java.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
	
	@Bean(name="customer")
	public CustomerBo1 customerBo1(){
		
		return new CustomerBo1();
		
	}
}