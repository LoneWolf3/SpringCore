package com.sac.java.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchedulerConfig {
	
	@Bean(name="scheduler")
	public SchedulerBo suchedulerBo(){
		
		return new SchedulerBo();
		
	}
	
}