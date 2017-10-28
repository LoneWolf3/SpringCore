package com.sac.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/sac/autowire/Beans.xml");
		A obj = (A) context.getBean("a");

		obj.display();
	}

}