package com.sac.collections;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/sac/collections/Beans.xml");

		Customer cust = (Customer) context.getBean("a");
		System.out.println(cust);
	}
}